package com.example.myapplication;

import androidx.annotation.Nullable;

public class Post {
    private int id;
    private String title;
    private String body;
    private int userId;

    public Post(int id, String title, String body, int userId) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public boolean equals (@Nullable Object obj) {
        if(!(obj instanceof Post))
            throw new IllegalArgumentException();

        final Post other = (Post) obj;
        return this.getId() == other.getId() &&
                this.getTitle().equals(other.getTitle()) &&
                this.getBody().equals(other.getBody()) &&
                this.getUserId() == other.getUserId();
    }
}
