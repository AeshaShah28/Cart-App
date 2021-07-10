package com.example.mobiocartapp.Adapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.mobiocartapp.R;

public class OrderSummaryAdapter extends RecyclerView.Adapter<OrderSummaryAdapter.MyViewHolder>
{
    public BroadcastReceiver mMessageReceiver;
    String imageurl,prname,prprice;
    int id;

    @NonNull
    @Override
    public OrderSummaryAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, final int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_ordersummary_data, viewGroup, false);
        return new OrderSummaryAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull OrderSummaryAdapter.MyViewHolder holder, int position)
    {

       // holder.tv_qty1.setText(prprice);
        // holder.tv_selected_brand1.setText(prprice);
      //  holder.tv_selectedcolor1.setText(prprice);
      //  holder.tv_totalprice1.setText(prprice);

        // Register to receive messages.
        // We are registering an observer (mMessageReceiver) to receive Intents
        // with actions named "custom-message".
         mMessageReceiver = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent)
            {
                  imageurl=intent.getStringExtra("imageurl");
                  prname=intent.getStringExtra("prproductname");
                  prprice=intent.getStringExtra("prprice");
                 // prprice=intent.getStringExtra("prproductname");
                 // prprice=intent.getStringExtra("prprice");
                //  id=intent.getIntExtra("id",0);
            }
        };

        holder.tv_price1.setText(prprice);
        holder.tv_proname1.setText(prname);

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tv_proname1,tv_qty1,tv_price1,tv_selectedcolor1,tv_selected_brand1,tv_totalprice1;
        ImageView iv;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_proname1 = itemView.findViewById(R.id.tv_productName);
            tv_qty1= itemView.findViewById(R.id.tv_qty);
            tv_price1= itemView.findViewById(R.id.tv_price);
            tv_selectedcolor1 = itemView.findViewById(R.id.tv_color);
            tv_selected_brand1 = itemView.findViewById(R.id.tv_brand);
            tv_totalprice1 = itemView.findViewById(R.id.tv_total_price);
            iv = itemView.findViewById(R.id.product_img);



        }
    }
}
