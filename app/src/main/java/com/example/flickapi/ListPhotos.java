package com.example.flickapi;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class ListPhotos {

    @SerializedName("page")
    @Expose
    public Integer page;

    public List<Photo> photoList = new ArrayList<>();
    public  class  Photo {

        @SerializedName("farm")
        @Expose
        public int farmId;

        @SerializedName("server")
        @Expose
        public int serverId;

        @SerializedName("id")
        @Expose
        public int photoId;

        @SerializedName("secret")
        @Expose
        public String secretId;

        @SerializedName("title")
        @Expose
        public String title;
    }


}
