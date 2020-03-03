package com.example.flickapi;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class PhotoWrapperDTO {
    @SerializedName("photos")
    @Expose
    PhotoDetail photoDetail;
}
class PhotoDetail {
    @SerializedName("page")
    @Expose
    public Integer page;
    @SerializedName("photo")
    @Expose
    public List<Photo> photo = new ArrayList<>();
}

class Photo {

    @SerializedName("farm")
    @Expose
    public int farmId;

    @SerializedName("server")
    @Expose
    public int serverId;

    @SerializedName("id")
    @Expose
    public String photoId;

    @SerializedName("secret")
    @Expose
    public String secretId;

    @SerializedName("title")
    @Expose
    public String title;
}
