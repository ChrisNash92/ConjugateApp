package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Arrays;
import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

    private List<Verb> list;
    private TextView mPortVerb;
    private TextView mEngVerb;
    private OnNoteListener mOnNoteListener;
    private Verb[] listCopy;

    public RecyclerAdapter(List<Verb> list, OnNoteListener onNoteListener)
    {
        this.list = list;
        this.mOnNoteListener = onNoteListener;
        copyList();
    }

    private void copyList()
    {
        listCopy = new Verb[list.size()];
        int i = 0;
        for(Verb verb : list)
        {
            listCopy[i] = verb;
            i++;
        }
    }


    public void filter(String text) {
        list.clear();
        if(text.isEmpty()){
            list.addAll(Arrays.asList(listCopy));
        } else{
            text = text.toLowerCase();
            for(Verb item: Arrays.asList(listCopy)){
                if(item.getPorVerb().toLowerCase().contains(text) || item.getEngVerb().toLowerCase().contains(text)){
                    list.add(item);
                }
            }
        }

        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View textView = (View) LayoutInflater.from(parent.getContext()).inflate(R.layout.text_view_layout,parent,false);

        MyViewHolder myViewHolder = new MyViewHolder(textView,mOnNoteListener);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        mPortVerb = holder.VersionName.getRootView().findViewById(R.id.txt_port);
        mEngVerb = holder.VersionName.getRootView().findViewById(R.id.txt_eng);

        mPortVerb.setText(list.get(position).getPorVerb());
        mEngVerb.setText(list.get(position).getEngVerb());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {
        OnNoteListener onNoteListener;
        View VersionName;
        public MyViewHolder(View itemView, OnNoteListener onNoteListener){
            super(itemView);
            VersionName = itemView;

            this.onNoteListener = onNoteListener;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            onNoteListener.onNoteClick(getAdapterPosition());

        }
    }

    public interface OnNoteListener{
        void onNoteClick(int position);


    }
}
