package com.example.hw4_33;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ViewPager2 viewPager2;
    private TabLayout tabLayout;
    private ViewPagerAdapter adapter;
    private ArrayList<Fragment> list = new ArrayList<>();
    private String[] titles = new String[]{"TITLES" , "NUMBERS" , "IMAGES"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
initViewPager();
    }
    private void initViewPager(){
        viewPager2 = findViewById(R.id.view_pager);
        tabLayout = findViewById(R.id.tab_layout_id);
        adapter = new ViewPagerAdapter(this);
        adapter.additems(createList());
        viewPager2.setAdapter(adapter);
        new TabLayoutMediator(tabLayout, viewPager2,
                (tab , position) -> tab.setText(titles[position])
        ).attach();
    }
    private ArrayList<Fragment> createList(){
        list = new ArrayList<>();
        list.add(new TitlesFragment());
        list.add(new NumberFragment());
        list.add(new ImagesFragment());
        return list;
    }
}