package com.ksemin.raksha.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Post {

    @SerializedName("name")
    @Expose
    private String username;
    @SerializedName("age")
    @Expose
    private String password;
    @SerializedName("userId")
    @Expose
    private Integer userId;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("bloodgrp")
    @Expose
    private Integer bloodgrp;


    public String getTitle() {
        return username;
    }

    public void setTitle(String title) {
        this.username = title;
    }

    public String getBody() {
        return password;
    }

    public void setBody(String body) {
        this.password = body;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Post{" +
                "names='" + username + '\'' +
                ", password='" + password + '\'' +
                ", userId=" + userId +'\''+
                ",bloodgrp=" + bloodgrp +
                ", id=" + id +
                '}';
    }
}

