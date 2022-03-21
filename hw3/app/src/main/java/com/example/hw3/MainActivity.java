package com.example.hw3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
      ArrayList<Foods>food = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listview);

        Foods coffee = new Foods("coffee", 20.0 , R.drawable.coffee);
         Foods ice_cream = new Foods("ice_cream", 40.0 , R.drawable.icecream);
         Foods snad =  new Foods("sandwich", 50.0 , R.drawable.sss);
        Foods drink =  new Foods("drink", 50.0 , R.drawable.sss);
        Foods salad =  new Foods("salad", 50.0 , R.drawable.sss);

        food.add(coffee);
        food.add(ice_cream);
        food.add(snad);
        food.add(drink);
        food.add(salad);

        FoodAdapter foodAdapter = new FoodAdapter(this, 0 , food);
        listView.setAdapter(foodAdapter);



    }


}