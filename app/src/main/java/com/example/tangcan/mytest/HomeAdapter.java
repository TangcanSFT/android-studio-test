package com.example.tangcan.mytest;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by tangcan on 16/6/12.
 * 修改人：tangcan
 * 修改时间：16/6/12 上午11:32
 * 修改备注：
 */
public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.MyViewHolder> {
    public List<CellData> data;
    private View view;

    public HomeAdapter(List<CellData> data) {
        this.data = data;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_cell, viewGroup, false);

//        view.setOnClickListener(this);
//        view.setOnLongClickListener(this);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder myViewHolder, int i) {

        CellData cd = data.get(i);
        myViewHolder.roomName.setText(cd.getRoomName());
        myViewHolder.audienceNum.setText(cd.getAudienceNum());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView roomName;
        TextView audienceNum;

        public MyViewHolder(View view) {
            super(view);
            roomName=(TextView)view.findViewById(R.id.roomName);
            audienceNum=(TextView)view.findViewById(R.id.audienceNum);
        }
    }
}
