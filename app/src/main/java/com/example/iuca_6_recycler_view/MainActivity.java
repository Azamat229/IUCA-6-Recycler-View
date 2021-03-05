package com.example.iuca_6_recycler_view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<ExampleItem> exampleList = new ArrayList<>();
        exampleList.add(new ExampleItem(R.drawable._1_danil, "Group: IT-118", "first name: Danil", "last name: Popov"));
        exampleList.add(new ExampleItem(R.drawable._2_aidin, "Group: IT-118", "first name: Aidin", "last name: Bekturganov"));
        exampleList.add(new ExampleItem(R.drawable._3_avai, "Group: IT-118", "first name: Avai", "last name: Aidarov"));
        exampleList.add(new ExampleItem(R.drawable._4_venya, "Group: IT-118", "first name: Veniyanin", "last name: Burnashev"));
        exampleList.add(new ExampleItem(R.drawable._5_aisulu, "Group: IT-118", "first name: Aisulu", "last name: Abdraimova "));
        exampleList.add(new ExampleItem(R.drawable._6_indira, "Group: IT-119", "first name: Indira", "last name: Ismailhanova"));
        exampleList.add(new ExampleItem(R.drawable._7_azat, "Group: IT-120", "first name: Azat", "last name: Aidarov"));
        exampleList.add(new ExampleItem(R.drawable._8_azamat, "Group: IT-118", "first name: Azamat", "last name: Mambetaliev"));
        exampleList.add(new ExampleItem(R.drawable._1_danil, "Group: IT-118", "first name: Danil", "last name: Popov"));
        exampleList.add(new ExampleItem(R.drawable._2_aidin, "Group: IT-118", "first name: Aidin", "last name: Bekturganov"));
        exampleList.add(new ExampleItem(R.drawable._3_avai, "Group: IT-118", "first name: Avai", "last name: Aidarov"));
        exampleList.add(new ExampleItem(R.drawable._4_venya, "Group: IT-118", "first name: Veniyanin", "last name: Burnashev"));
        exampleList.add(new ExampleItem(R.drawable._5_aisulu, "Group: IT-118", "first name: Aisulu", "last name: Abdraimova "));
        exampleList.add(new ExampleItem(R.drawable._6_indira, "Group: IT-119", "first name: Indira", "last name: Ismailhanova"));
        exampleList.add(new ExampleItem(R.drawable._7_azat, "Group: IT-120", "first name: Azat", "last name: Aidarov"));
        exampleList.add(new ExampleItem(R.drawable._8_azamat, "Group: IT-118", "first name: Azamat", "last name: Mambetaliev"));
        exampleList.add(new ExampleItem(R.drawable._1_danil, "Group: IT-118", "first name: Danil", "last name: Popov"));
        exampleList.add(new ExampleItem(R.drawable._2_aidin, "Group: IT-118", "first name: Aidin", "last name: Bekturganov"));
        exampleList.add(new ExampleItem(R.drawable._3_avai, "Group: IT-118", "first name: Avai", "last name: Aidarov"));
        exampleList.add(new ExampleItem(R.drawable._4_venya, "Group: IT-118", "first name: Veniyanin", "last name: Burnashev"));
        exampleList.add(new ExampleItem(R.drawable._5_aisulu, "Group: IT-118", "first name: Aisulu", "last name: Abdraimova "));
        exampleList.add(new ExampleItem(R.drawable._6_indira, "Group: IT-119", "first name: Indira", "last name: Ismailhanova"));
        exampleList.add(new ExampleItem(R.drawable._7_azat, "Group: IT-120", "first name: Azat", "last name: Aidarov"));
        exampleList.add(new ExampleItem(R.drawable._8_azamat, "Group: IT-118", "first name: Azamat", "last name: Mambetaliev"));

        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new ExampleAdapter(exampleList);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }
}