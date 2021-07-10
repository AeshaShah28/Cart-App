package com.example.mobiocartapp.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.mobiocartapp.Adapter.OrderSummaryAdapter;

import com.example.mobiocartapp.R;

public class OrderSummaryActivity extends AppCompatActivity {

    RecyclerView rv1;
    OrderSummaryAdapter adapter1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_summary);

        rv1 = findViewById(R.id.recycler_ordersummary);
        rv1.setHasFixedSize(true);
        rv1.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        rv1.setAdapter(adapter1);


    }

}
