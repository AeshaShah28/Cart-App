package com.example.mobiocartapp.Adapter;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.example.mobiocartapp.Activity.OnImageClickListener;
import com.example.mobiocartapp.R;
import com.example.mobiocartapp.Response.ProLIstResponse;
import java.util.ArrayList;
import java.util.List;
import de.hdodenhof.circleimageview.CircleImageView;

public class ProlistAdapter extends RecyclerView.Adapter<ProlistAdapter.MyViewHolder> {
    List<ProLIstResponse> ProListResponseList;
    Context context;
    private OnImageClickListener onImageClickListener;

    public ProlistAdapter(List<ProLIstResponse> proListResponseList, Context context) {
        ProListResponseList = proListResponseList;
        this.context = context;

    }

   // public  ArrayAdapter<BrandResponse> brandDataAdapter;

    @Override
    public ProlistAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.rowdata, viewGroup, false);
        return new ProlistAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProlistAdapter.MyViewHolder holder, final int i) {
        Glide.with(context).load(ProListResponseList.get(i).getPicture()).into(holder.pro_img);
        holder.pro_name.setText(ProListResponseList.get(i).getProductName());
        holder.price.setText("Price : "+ProListResponseList.get(i).getPrice());

       /* onImageClickListener.onImageClick(ProListResponseList.get(i).getPicture());
        onImageClickListener.onImageClick(ProListResponseList.get(i).getProductName());
        onImageClickListener.onImageClick(ProListResponseList.get(i).getPrice());*/


         if(ProListResponseList.get(i).getProductName()=="COMTEST")
         {
             List<String >list_COMTEST=new ArrayList<String>();
             list_COMTEST.add("Schroeder Valenzuela");
             list_COMTEST.add("Gamble Hendrix");
             list_COMTEST.add("Pat Gray");
             ArrayAdapter<String>arrayAdapter=new ArrayAdapter<String>(context,android.R.layout.simple_spinner_item,list_COMTEST);
             arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
             holder.sp_brand.setAdapter(arrayAdapter);
         }
        if(ProListResponseList.get(i).getProductName()=="BOINK")
        {
            List<String >list_BOINK=new ArrayList<String>();
            list_BOINK.add("Morgan Weeks");
            list_BOINK.add("Corinne Finch");
            list_BOINK.add("Jo Dorsey");
            ArrayAdapter<String>arrayAdapter=new ArrayAdapter<String>(context,android.R.layout.simple_spinner_item,list_BOINK);
            arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            holder.sp_brand.setAdapter(arrayAdapter);
        }
        if(ProListResponseList.get(i).getProductName()=="DOGSPA")
        {
            List<String >list_DOGSPA=new ArrayList<String>();
            list_DOGSPA.add("Erickson Sanders");
            list_DOGSPA.add("Haney Mcclure");
            list_DOGSPA.add("Karla Durham");
            ArrayAdapter<String>arrayAdapter=new ArrayAdapter<String>(context,android.R.layout.simple_spinner_item,list_DOGSPA);
            arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            holder.sp_brand.setAdapter(arrayAdapter);
        }

        if(ProListResponseList.get(i).getProductName()=="DATACATOR")
        {
            List<String >list_DOGSPA=new ArrayList<String>();
            list_DOGSPA.add("Lilly Simon");
            list_DOGSPA.add("Brooke Gallegos");
            list_DOGSPA.add("Carla Ellison");
            ArrayAdapter<String>arrayAdapter=new ArrayAdapter<String>(context,android.R.layout.simple_spinner_item,list_DOGSPA);
            arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            holder.sp_brand.setAdapter(arrayAdapter);
        }
        if(ProListResponseList.get(i).getProductName()=="ACCUPRINT")
        {
            List<String >list_ACCUPRINT=new ArrayList<String>();
            list_ACCUPRINT.add("Vasquez Gillespie");
            list_ACCUPRINT.add("Rasmussen Dunn");
            list_ACCUPRINT.add("Yang Dean");
            ArrayAdapter<String>arrayAdapter=new ArrayAdapter<String>(context,android.R.layout.simple_spinner_item,list_ACCUPRINT);
            arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            holder.sp_brand.setAdapter(arrayAdapter);
        }
        if(ProListResponseList.get(i).getProductName()=="COLLAIRE")
        {
            List<String >list_COLLAIRE=new ArrayList<String>();
            list_COLLAIRE.add("Diaz Henderson");
            list_COLLAIRE.add("Bianca Banks");
            list_COLLAIRE.add("Heather Blevins");
            ArrayAdapter<String>arrayAdapter=new ArrayAdapter<String>(context,android.R.layout.simple_spinner_item,list_COLLAIRE);
            arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            holder.sp_brand.setAdapter(arrayAdapter);
        }
        if(ProListResponseList.get(i).getProductName()=="ZOSIS")
        {
            List<String >list_ZOSIS=new ArrayList<String>();
            list_ZOSIS.add("Gonzalez Barlow");
            list_ZOSIS.add("Young Bernard");
            list_ZOSIS.add("Moses Kirk");
            ArrayAdapter<String>arrayAdapter=new ArrayAdapter<String>(context,android.R.layout.simple_spinner_item,list_ZOSIS);
            arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            holder.sp_brand.setAdapter(arrayAdapter);
        }

        if(ProListResponseList.get(i).getProductName()=="MICROLUXE")
        {
            List<String >list_MICROLUXE=new ArrayList<String>();
            list_MICROLUXE.add("Mayo Cook");
            list_MICROLUXE.add("Kelly Andrews");
            list_MICROLUXE.add("Pierce Hubbard");
            ArrayAdapter<String>arrayAdapter=new ArrayAdapter<String>(context,android.R.layout.simple_spinner_item,list_MICROLUXE);
            arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            holder.sp_brand.setAdapter(arrayAdapter);
        }

        if(ProListResponseList.get(i).getProductName()=="ENOMEN")
        {
            List<String >list_ENOMEN=new ArrayList<String>();
            list_ENOMEN.add("Cathleen Wall");
            list_ENOMEN.add("Doreen Skinner");
            list_ENOMEN.add("Romero Kim");
            ArrayAdapter<String>arrayAdapter=new ArrayAdapter<String>(context,android.R.layout.simple_spinner_item,list_ENOMEN);
            arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            holder.sp_brand.setAdapter(arrayAdapter);
        }

        if(ProListResponseList.get(i).getProductName()=="MOMENTIA")
        {
            List<String >list_MOMENTIA=new ArrayList<String>();
            list_MOMENTIA.add("Lorraine Schmidt");
            list_MOMENTIA.add("Minerva Robles");
            list_MOMENTIA.add("Katheryn Park");
            ArrayAdapter<String>arrayAdapter=new ArrayAdapter<String>(context,android.R.layout.simple_spinner_item,list_MOMENTIA);
            arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            holder.sp_brand.setAdapter(arrayAdapter);
        }
      // holder.r_red.setText( ProListResponseList.get(i).getColors().indexOf(0));
       // holder.r_blue.setText(ProListResponseList.get(i).getColors().indexOf(1));
      //  holder.r_green.setText( ProListResponseList.get(i).getColors().indexOf(2));

      /*  Intent intent=new Intent( "custom-message");
        String id= ProListResponseList.get(i).get_id();
        String imageurl=ProListResponseList.get(i).getPicture();
        String prprice=ProListResponseList.get(i).getPrice();
        String prproductname=ProListResponseList.get(i).getProductName();
        String qty = holder.et_qty.getText().toString();*/
       // intent.putExtra("quantity",Integer.parseInt(holder.et_qty.getText().toString()));
       /* intent.putExtra("quantity",qty);
        intent.putExtra("picture",imageurl);
        intent.putExtra("productName",prproductname);
        intent.putExtra("price",prprice);
        intent.putExtra("_id",id);*/
       // context.startActivity(intent);
       // LocalBroadcastManager.getInstance(context).sendBroadcast(intent);


    }
    @Override
    public int getItemCount() {
        return ProListResponseList.size();
    }
    public class MyViewHolder extends RecyclerView.ViewHolder
    {
        public CircleImageView pro_img;
        public TextView pro_name,price;
        public Spinner sp_brand;
        public RadioButton r_red,r_blue,r_green;
        public EditText et_qty;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            pro_name = itemView.findViewById(R.id.tv_productName);
            price = itemView.findViewById(R.id.tv_price);
            pro_img = itemView.findViewById(R.id.product_img);
            sp_brand = itemView.findViewById(R.id.spinner);
            r_red = itemView.findViewById(R.id.rb_red);
            r_blue = itemView.findViewById(R.id.rb_blue);
            r_green = itemView.findViewById(R.id.rb_green);
            et_qty = itemView.findViewById(R.id.qty);
            sp_brand.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    sp_brand.setSelection(position);

                }
                @Override
                public void onNothingSelected(AdapterView<?> parent) {
                }
            });
        }
    }
}
