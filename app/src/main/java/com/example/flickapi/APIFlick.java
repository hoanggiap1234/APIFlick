package com.example.flickapi;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIFlick {
    String HTTPS_API_FLICK = "https://api.flickr.com/services/rest/";
    @GET("?method=flickr.photos.getRecent&api_key=fee10de350d1f31d5fec0eaf330d2dba&format=json&nojsoncallback=true")
    Call <PhotoWrapper> getListPhoto();

}
