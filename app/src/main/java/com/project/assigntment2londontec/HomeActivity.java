package com.project.assigntment2londontec;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.project.assigntment2londontec.adapter.AsianFoodAdapter;
import com.project.assigntment2londontec.adapter.PopularFoodAdapter;
import com.project.assigntment2londontec.model.AsianFood;
import com.project.assigntment2londontec.model.PopularFood;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    RecyclerView popularRecycler,asianRecycler;
    PopularFoodAdapter popularFoodAdapter;
    AsianFoodAdapter asianFoodAdapter;

    ImageView profiled;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        profiled=findViewById(R.id.profiled);

        profiled.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeActivity.this,ProfileActivity.class);
                startActivity(intent);

            }
        });

        List<PopularFood> popularFoodList = new ArrayList<>();

        popularFoodList.add(new PopularFood("Float Cakes Japan","450.00", R.drawable.popularfood1));
        popularFoodList.add(new PopularFood("Chiken Drumstic","1250.00", R.drawable.popularfood2));
        popularFoodList.add(new PopularFood("Fish Tikka Stick","1500.00", R.drawable.popularfood3));
        popularFoodList.add(new PopularFood("Float Cakes Japan","450.00", R.drawable.popularfood1));
        popularFoodList.add(new PopularFood("Chiken Drumstic","1250.00", R.drawable.popularfood2));
        popularFoodList.add(new PopularFood("Fish Tikka Stick","1500.00", R.drawable.popularfood3));

        setPopularRecycler(popularFoodList);

        List<AsianFood> asianFoodList = new ArrayList<>();
        asianFoodList.add(new AsianFood("Italian Pizza", "2050.00", R.drawable.asiafood1, "4.7","Briand Resturant"));
        asianFoodList.add(new AsianFood("Strawberry Cake", "3000.00", R.drawable.asiafood2, "4.2","Kick Resturant"));

        setAsianRecycler(asianFoodList);

    }


    private void setPopularRecycler(List<PopularFood> popularFoodList){

        popularRecycler = findViewById(R.id.popular_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager( this, RecyclerView.HORIZONTAL,false);
        popularRecycler.setLayoutManager(layoutManager);
        popularFoodAdapter= new PopularFoodAdapter(this,popularFoodList);
        popularRecycler.setAdapter(popularFoodAdapter);

    }
    private void setAsianRecycler(List<AsianFood> asianFoodList){

        asianRecycler = findViewById(R.id.asian_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager( this, RecyclerView.VERTICAL,false);
        asianRecycler.setLayoutManager(layoutManager);
        asianFoodAdapter= new AsianFoodAdapter(this,asianFoodList);
        asianRecycler.setAdapter(asianFoodAdapter);

    }


}