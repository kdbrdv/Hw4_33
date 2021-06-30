package com.example.hw4_33;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NumberFragment extends Fragment {
    private RecyclerView recyclerView;
    private NumberAdapter adapter;
    private ArrayList<Integer> list = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_numbers, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recycler_view_numbers);
        adapter = new NumberAdapter();
        createList();
        adapter.addItems(list);
        recyclerView.setAdapter(adapter);
    }

    private void createList() {
        for (int i = 0; i < 20; i++) {
            list.add(i + 1);
        }
    }
}
