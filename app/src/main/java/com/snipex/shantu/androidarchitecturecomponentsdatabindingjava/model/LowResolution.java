package com.snipex.shantu.androidarchitecturecomponentsdatabindingjava.model;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LowResolution {

    /*
     *  This is class is for getting low resolution of instagram images.
     *  image height = 320 , width = 320
     * */
    @SerializedName("url")
    @Expose
    private String imageUrl;

    @BindingAdapter("imageUrl")
    public static void loadImage(ImageView view, String imageUrl) {
        Glide.with(view.getContext())
                .load(imageUrl)
                .into(view);
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
