package com.example.mobiocartapp.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.mobiocartapp.Adapter.ProlistAdapter;
import com.example.mobiocartapp.R;
import com.example.mobiocartapp.Response.ProLIstResponse;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity  {
    ArrayList<ProLIstResponse> proLIstResponseArrayList;
    RecyclerView rv;
    ProlistAdapter adapter;
    Button bt_submit_pro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt_submit_pro = findViewById(R.id.btn_submit_pro);

      /*  Intent intent=getIntent();
        final String imageurl=intent.getStringExtra("imageurl");
        final String prname=intent.getStringExtra("prname");
        final String prprice=intent.getStringExtra("prprice");
        final int id=intent.getIntExtra("id",0);*/

        rv = findViewById(R.id.recycler_prolist);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, true));
        ArrayList<ProLIstResponse> proLIstResponseArrayList = new ArrayList<>();

            proLIstResponseArrayList.add(new ProLIstResponse("60c30c3d54a6468980addbff","$1,233.81","http://placehold.it/256x256","COMTEST"));
            proLIstResponseArrayList.add(new ProLIstResponse("60c30c3dfe5afa7999c39e52","$1,440.19","http://placehold.it/256x256","BOINK"));
            proLIstResponseArrayList.add(new ProLIstResponse("60c30c3de6a2c2ea92535e94","$2,036.82","http://placehold.it/256x256","DOGSPA"));
            proLIstResponseArrayList.add(new ProLIstResponse("60c30c3de4c16dadb861c5a0","$1,898.12","http://placehold.it/256x256","DATACATOR"));
            proLIstResponseArrayList.add(new ProLIstResponse("60c30c3d699af5b7ed621070","$1,109.99","http://placehold.it/256x256","ACCUPRINT"));
            proLIstResponseArrayList.add(new ProLIstResponse("60c30c3daf092fed381dba9d","$3,433.40","http://placehold.it/256x256","COLLAIRE"));
            proLIstResponseArrayList.add(new ProLIstResponse("60c30c3dba2f588ea4301e9c","$1,325.10","http://placehold.it/256x256","ZOSIS"));
            proLIstResponseArrayList.add(new ProLIstResponse("60c30c3d1ead8a0ce227274b","$2,217.90","http://placehold.it/256x256","MICROLUXE"));
            proLIstResponseArrayList.add(new ProLIstResponse("60c30c3d5cfeea8fc250ad9a","$3,608.41","http://placehold.it/256x256","ENOMEN"));
            proLIstResponseArrayList.add(new ProLIstResponse("60c30c3d5abce6bec089233f","$1,477.75","http://placehold.it/256x256","MOMENTIA"));

        adapter = new ProlistAdapter(proLIstResponseArrayList,this);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        rv.setLayoutManager(mLayoutManager);
        rv.setItemAnimator(new DefaultItemAnimator());
        rv.setAdapter(adapter);

        bt_submit_pro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,OrderSummaryActivity.class);
                startActivity(i);

              /* Cart cart= new Cart();
                cart.setId(id);
                cart.setImageid(imageurl);
                cart.setName(prname);
                cart.setPrice(prprice);
                startActivity(i);
                finish();*/
            }
        });



    }

}
