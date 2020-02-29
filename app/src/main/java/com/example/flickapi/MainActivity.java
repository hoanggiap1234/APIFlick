package com.example.flickapi;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    Retrofit retrofit;
    APIFlick apiFlick;
    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView = findViewById(R.id.txt);
        retrofit = new Retrofit.Builder()
                .baseUrl(APIFlick.HTTPS_API_FLICK)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        apiFlick = retrofit.create(APIFlick.class);

        Call<ListPhotos> call = apiFlick.getListPhoto(2);
        call.enqueue(new Callback<ListPhotos>() {
            @Override
            public void onResponse(Call<ListPhotos> call, Response<ListPhotos> response) {
                if (!response.isSuccessful()) {
                    mTextView.setText("code: " + response.code());
                    return;
                } else {
                    ListPhotos listPhoto = response.body();
                    List<ListPhotos.Photo> photos = listPhoto.photoList;
                    for (ListPhotos.Photo photo : photos) {
                        String urlPhoto = "https://farm" + photo.farmId + ".staticflickr.com/"
                                + photo.serverId + "/" + photo.photoId
                                + "_" + photo.secretId + ".jpg" + "\n";
                        mTextView.append(urlPhoto);
                    }
                }
            }
            @Override
            public void onFailure(Call<ListPhotos> call, Throwable t) {
                mTextView.setText(t.getMessage());
            }
        });

    }
}
