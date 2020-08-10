package com.elad.themovie.service.repository.storge.model;

import androidx.annotation.NonNull;
import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.recyclerview.widget.DiffUtil;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

/**
 * Immutable model class for a Movie and entity in the Room database.
 */

@Entity(tableName = "movies")
public class Movie extends BaseObservable {

    @PrimaryKey()
    @ColumnInfo(name = "id") @SerializedName(value="id") private Integer mId;
    @ColumnInfo(name = "post_id") @SerializedName(value="post_id") private Integer post_id;
    @ColumnInfo(name = "user_id") @SerializedName(value="user_id") private Integer user_id;
    @ColumnInfo(name = "full_name") @SerializedName(value="full_name") private String full_name;
    @ColumnInfo(name = "user_name") @SerializedName(value="user_name") private String user_name;
    @ColumnInfo(name = "user_profile") @SerializedName(value="user_profile") private String user_profile;
    @ColumnInfo(name = "post_video") @SerializedName(value="post_video") private String post_video;
    @ColumnInfo(name = "post_image") @SerializedName(value="post_image") private String post_image;


    // use for ordering the items in view
    public static DiffUtil.ItemCallback<Movie> DIFF_CALLBACK = new DiffUtil.ItemCallback<Movie>() {
        @Override
        public boolean areItemsTheSame(@NonNull Movie oldItem, @NonNull Movie newItem) {
            return oldItem.getId().equals(newItem.getId());
        }

        @Override
        public boolean areContentsTheSame(@NonNull Movie oldItem, @NonNull Movie newItem) {
            return oldItem.getId().equals(newItem.getId());
        }
    };

    @Bindable
    public Integer getId() {
        return mId;
    }

    public void setId(Integer mId) {
        this.mId = mId;
    }

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public Integer getPost_id() {
        return post_id;
    }

    public void setPost_id(Integer post_id) {
        this.post_id = post_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_profile() {
        return user_profile;
    }

    public void setUser_profile(String user_profile) {
        this.user_profile = user_profile;
    }

    public String getPost_video() {
        return post_video;
    }

    public void setPost_video(String post_video) {
        this.post_video = post_video;
    }

    public String getPost_image() {
        return post_image;
    }

    public void setPost_image(String post_image) {
        this.post_image = post_image;
    }
}
