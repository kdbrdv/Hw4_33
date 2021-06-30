package com.example.hw4_33;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TitlesFragment extends Fragment {
    private RecyclerView recyclerView;
    private TitleAdapter adapter;
    private ArrayList<User> list = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_titles, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recycler_view);
        adapter = new TitleAdapter();
        createList();
        adapter.addItems(list);
        recyclerView.setAdapter(adapter);
        recyclerView.addItemDecoration(new DividerItemDecoration(getActivity(), DividerItemDecoration.VERTICAL));

    }

    private void createList() {
        list.add(new User("Итачи", "Учиха"));
        list.add(new User("Наруто", "Узумаки"));
        list.add(new User("Минато", "Намиказе"));
        list.add(new User("Какаши", "Хатаге"));
        list.add(new User("Хаширама", "Сенджу"));
        list.add(new User("Мадара", "Учиха"));
        list.add(new User("Саске", "Учиха"));
        list.add(new User("Хината", "Хьюга"));
        list.add(new User("Фугагу", "Учиха"));
        list.add(new User("Сакура", "Харуно"));
        list.add(new User("Тобирама", "Сенджу"));
        list.add(new User("Рин", "Нохара"));
    }
}
