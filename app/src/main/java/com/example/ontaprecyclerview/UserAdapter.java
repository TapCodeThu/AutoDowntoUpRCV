package com.example.ontaprecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.MyViewHolder>{
    private int lastPosition = -1;
    List<User> mListUser;
    public void setData(List<User> list){
        this.mListUser = list;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item_user,parent,false);
       return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        User user = mListUser.get(position);
        holder.HinhAvarta.setImageResource(user.getImageAvarta());
        holder.NameUser.setText(user.getNameUser());
        setAnimation(holder.itemView,position);

    }

    @Override
    public int getItemCount() {
        return mListUser.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        CircleImageView HinhAvarta;
        TextView NameUser;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            HinhAvarta = itemView.findViewById(R.id.id_circle_avarta);
            NameUser = itemView.findViewById(R.id.id_ten_user);
        }
    }
    private void setAnimation(View viewtoAnimate, int position){

           if(position>lastPosition){
               Animation downtoUp = AnimationUtils.loadAnimation(viewtoAnimate.getContext(),R.anim.down_to_up);
               viewtoAnimate.setAnimation(downtoUp);

           }
           lastPosition = position;


    }
}
