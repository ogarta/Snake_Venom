package com.svute.snakevenom;

import android.app.Activity;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;


public class LibraryFragment extends Fragment {

    RecyclerView recyclerView;
    SnakeAdapter snakeAdapter;
    List<SnakeModel> snakeModels;
    MainActivity mMainActivity;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_library, container, false);
        mMainActivity = (MainActivity) getActivity();
        addControls(view);
        setUpRecyclerView(mMainActivity);
        return view;
    }

    private void addControls(View view) {
        recyclerView = view.findViewById(R.id.recyclerView);
    }

    private void setUpRecyclerView(MainActivity mMainActivity) {
        snakeModels = SnakeModel.getMock();
        Log.d("TAG", String.valueOf(SnakeModel.getMock().size()));
        snakeAdapter = new SnakeAdapter(snakeModels, new SnakeAdapter.IClickItemListener() {
            @Override
            public void onClickItemIplant(SnakeModel snakeModelModel) {
                mMainActivity.openSnakeDetailFragment(snakeModelModel);
            }
        });
        recyclerView.setAdapter(snakeAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
    }
}