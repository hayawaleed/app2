package com.example.myapplication;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;

public class PostClientImpl implements PostClient {
    private final PostEndPoint postEndpoint;

    public PostClientImpl(Retrofit retrofit) {
        postEndpoint = retrofit.create(PostEndPoint.class);
    }


    public Call<List<Post>> getPosts() {
        return postEndpoint.getPosts();
    }
}
