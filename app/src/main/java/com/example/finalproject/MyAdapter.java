package com.example.finalproject;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.core.content.ContextCompat;


public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CardView v = (CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.mycard,
                parent,
                false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.ViewHolder holder, int position) {
        CardView cardView = holder.cardView;
        TextView text1 = (TextView) cardView.findViewById(R.id.txt1);
        TextView text2 = (TextView) cardView.findViewById(R.id.txt2);
        TextView text3 = (TextView) cardView.findViewById(R.id.txt3);
        text1.setText("   Operation is: " + room[position]);
        text2.setText("   Type is: " + area[position]);
        text3.setText("   Level is: " + num[position]);
        cardView.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //
            }
        });
    }
    private String[] room;
    private String[] area;
    private String[] num;

    public MyAdapter(String[] op, String[] type, String[] level){
        this.room = room;
        this.area = area;
        this.num = num;
    }

    @Override
    public int getItemCount() {
        return room.length;
    }
    public static class ViewHolder extends RecyclerView.ViewHolder{
        private CardView cardView;
        public ViewHolder(CardView cardView){
            super(cardView);
            this.cardView = cardView;
        }

    }
}
