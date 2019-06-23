package afniramadania.tech.jenisabkapp;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardViewAbkAdapter extends RecyclerView.Adapter<CardViewAbkAdapter.CardViewViewHolder> {
    private Context context;
    private ArrayList<Abk> listAbk;

    public ArrayList<Abk> getListAbk() {
        return listAbk;
    }

    public void setListAbk(ArrayList<Abk> listAbk) {
        this.listAbk = listAbk;
    }

    public CardViewAbkAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cardview_abk, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewViewHolder holder, int position) {
        final Abk a = getListAbk().get(position);
        Glide.with(context).load(a.getPhoto()).apply(new RequestOptions().override(350, 550)).into(holder.imgPhoto);
        holder.tvName.setText(a.getName());
        holder.tvRemarks.setText(a.getRemarks());
        holder.abk = a;


        holder.btnShare.setOnClickListener(new CustomOnItemClickListener(position, new CustomOnItemClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                Toast.makeText(context, "Share" + getListAbk().get(position).getName(), Toast.LENGTH_SHORT).show();
            }
        }));


    }

    @Override
    public int getItemCount() {
        return getListAbk().size();
    }

    public void startactivity(Intent intent){

    }



    public class CardViewViewHolder extends RecyclerView.ViewHolder  {
        ImageView imgPhoto;
        TextView tvName, tvRemarks;
        Button btnDetail, btnShare;
        Abk abk;

        CardViewViewHolder(View itemView) {
            super(itemView);
            imgPhoto = (ImageView) itemView.findViewById(R.id.img_item_photo);
            tvName = (TextView) itemView.findViewById(R.id.tv_item_name);
            tvRemarks = (TextView) itemView.findViewById(R.id.tv_item_remarks);
            btnShare = (Button) itemView.findViewById(R.id.btn_set_share);
            btnDetail.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context, DetailAbk.class);
                    intent.putExtra("key", abk);
                    context.startActivity(intent);

                }
            });


        }


    }
    }




