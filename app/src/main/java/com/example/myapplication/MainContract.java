package com.example.myapplication;

import java.util.List;

public interface MainContract {
    interface View {
        void showPosts(List<Post> posts);
        void showError(String errMsg);
    }

    interface Presenter {
        void getPosts();
    }
}
