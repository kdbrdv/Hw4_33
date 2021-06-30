package com.example.hw4_33;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NumberAdapter extends RecyclerView.Adapter<NumberAdapter.ViewHolder> {
    private ArrayList<Integer> list = new ArrayList<>();

    public void addItems(ArrayList<Integer> list) {
        this.list.addAll(list);
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.number_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(NumberAdapter.ViewHolder holder, int position) {
        holder.onBind(list.get(position));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView numbers;

        public ViewHolder(View itemView) {
            super(itemView);

            numbers = itemView.findViewById(R.id.tv_number_item);
        }

        public void onBind(Integer integer) {
            numbers.setText(integer.toString());
        }
    }
}
