package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Toast;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements MainContract.View {
    @SuppressLint("NonConstantResourceId")
    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;

    private MainContract.Presenter presenter = new MainPresenter(this, new PostClientImpl(RetrofitProvider.getRetrofit()));
    private PostsAdapter postsAdapter;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        postsAdapter = new PostsAdapter();
        recyclerView.setAdapter(postsAdapter);


        presenter.getPosts();
    }

    @Override
    public void showPosts (List<Post> posts) {
        postsAdapter.updatePosts(posts);
    }

    @Override
    public void showError (String errMsg) {
        Toast.makeText(this,errMsg, Toast.LENGTH_SHORT).show();
    }
}