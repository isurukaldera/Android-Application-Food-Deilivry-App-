package com.project.assigntment2londontec.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.project.assigntment2londontec.R;
import com.project.assigntment2londontec.model.AsianFood;
import com.project.assigntment2londontec.model.PopularFood;

import java.util.List;

public class AsianFoodAdapter extends RecyclerView.Adapter<AsianFoodAdapter.AsianFoodViewHolder> {

    Context context;
    List<AsianFood> asianFoodList;



    public AsianFoodAdapter(Context context, List<AsianFood> asianFoodList) {
        this.context = context;
        this.asianFoodList = asianFoodList;
    }

    @NonNull
    @Override
    public AsianFoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.asian_food_row_item, parent,false);
        return new AsianFoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AsianFoodViewHolder holder, int position) {

        holder.foodImage.setImageResource(asianFoodList.get(position).getImageUrl());
        holder.name.setText(asianFoodList.get(position).getName());
        holder.price.setText(asianFoodList.get(position).getPrice());
        holder.rating.setText(asianFoodList.get(position).getRating());
        holder.resturantname.setText(asianFoodList.get(position).getResturantname());

    }

    @Override
    public int getItemCount() {
        return asianFoodList.size();
    }


    public static final class AsianFoodViewHolder extends RecyclerView.ViewHolder{

        ImageView foodImage;
        TextView price, name, rating, resturantname;


        public AsianFoodViewHolder(@NonNull View itemView) {
            super(itemView);

            foodImage =itemView.findViewById(R.id.food_image);
            price =itemView.findViewById(R.id.price);
            name =itemView.findViewById(R.id.name);
            rating =itemView.findViewById(R.id.rating);
            resturantname =itemView.findViewById(R.id.resturant_name);



        }
    }
}
