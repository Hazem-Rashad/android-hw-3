package com.example.hw3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class FoodAdapter extends ArrayAdapter<Foods> {
    List<Foods> food ;
    public FoodAdapter(@NonNull Context context, int resource, @NonNull List<Foods> objects) {
        super(context, resource, objects);
         food=objects;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = LayoutInflater.from(getContext()).inflate(R.layout.food , parent , false);
         Foods thisFood = food.get(position);

        ImageView imageView = view.findViewById(R.id.imageView);
        TextView foodName = view.findViewById(R.id.itemName);
        TextView foodPrice = view.findViewById(R.id.itemprice);


        imageView.setImageResource(thisFood.getFoodImeg());
       foodName.setText(thisFood.getFoodName());
       foodPrice.setText(thisFood.getFoodPrice() + "");

        return view ;
    }
}

