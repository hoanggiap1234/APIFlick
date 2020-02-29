package com.example.flickapi;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;



public class Photo {

    @SerializedName("farm")
    @Expose
    private int farmId;
    @SerializedName("server")
    @Expose
    private int serverId;
    @SerializedName("id")
    @Expose
    private int photoId;
    @SerializedName("secret")
    @Expose
    private String secretId;

    @SerializedName("title")
    @Expose
    private String title;

    public int getFarmId() {
        return farmId;
    }

    public int getServerId() {
        return serverId;
    }

    public int getPhotoId() {
        return photoId;
    }

    public String getSecretId() {
        return secretId;
    }

    public String getTitle() {
        return title;
    }
}
