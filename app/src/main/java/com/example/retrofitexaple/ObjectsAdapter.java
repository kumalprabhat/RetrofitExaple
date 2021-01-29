package com.example.retrofitexaple;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class ObjectsAdapter extends RecyclerView.Adapter<ObjectsAdapter.ObjectsViewHolder> {

    private List<Objects> objectsList;
    private Context context;

    private static int currentPosition = 0;

    public ObjectsAdapter(List<Objects> objectsList, Context context) {
        this.objectsList = objectsList;
        this.context = context;
    }

    @Override
    public ObjectsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.objects, null);
        return new ObjectsViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final ObjectsViewHolder holder, final int position) {
        Objects objects = objectsList.get(position);
        holder.txt1.setText(objects.getId());
        holder.txt2.setText(objects.getSid() );
        holder.txt3.setText(objects.getCategory());
        holder.txt4.setText(objects.getSubCategory());
        holder.txt5.setText(objects.getTitleEng());
        holder.txt6.setText(objects.getTitleHindi());
        holder.txt7.setText(objects.getTitleKannada());

        Glide.with(context).load(objects.getImage()).into(holder.imageView);
        holder.linearLayout.setVisibility(View.GONE);

        if (currentPosition == position) {

            Animation slideDown = AnimationUtils.loadAnimation(context, R.anim.anim);

            holder.linearLayout.setVisibility(View.VISIBLE);

            holder.linearLayout.startAnimation(slideDown);
        }


    }

    @Override
    public int getItemCount() {
        return objectsList.size();
    }

    class ObjectsViewHolder extends RecyclerView.ViewHolder {
        TextView txt1, txt2, txt3, txt4, txt5, txt6, txt7;
        ImageView imageView;
        LinearLayout linearLayout;

        ObjectsViewHolder(View itemView) {
            super(itemView);

            txt1 = itemView.findViewById(R.id.txt1);
            txt2 = itemView.findViewById(R.id.txt2);
            txt3 = itemView.findViewById(R.id.txt3);
            txt4 = itemView.findViewById(R.id.txt4);
            txt5 = itemView.findViewById(R.id.txt5);
            txt6 = itemView.findViewById(R.id.txt6);
            txt7 = itemView.findViewById(R.id.txt7);
            imageView = itemView.findViewById(R.id.img);

            linearLayout = itemView.findViewById(R.id.linearLayout);
        }
    }
}
