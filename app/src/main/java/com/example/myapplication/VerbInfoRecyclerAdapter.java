package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.List;

public class VerbInfoRecyclerAdapter extends RecyclerView.Adapter<VerbInfoRecyclerAdapter.MyViewHolder> {

    private List<String[]> list;
    private TextView mTenseport;
    private TextView mTenseeng;
    private TextView mEu;
    private TextView mEle;
    private TextView mNos;
    private TextView mEles;

    private TextView mEuVerb;
    private TextView mEleVerb;
    private TextView mNosVerb;
    private TextView mElesVerb;

    private EditText mEuVerbEdit;
    private EditText mEleVerbEdit;
    private EditText mNosVerbEdit;
    private EditText mElesVerbEdit;

    private FloatingActionButton floatingActionButton;

    public VerbInfoRecyclerAdapter(List<String[]> list)
    {
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {

        View textView = (View) LayoutInflater.from(parent.getContext()).inflate(R.layout.verb_info_layout,parent,false);

        MyViewHolder myViewHolder = new MyViewHolder(textView);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {

        mTenseport = myViewHolder.VersionName.getRootView().findViewById(R.id.tense_port_txt);
        mTenseeng = myViewHolder.VersionName.getRootView().findViewById(R.id.tense_eng_txt);

        mEuVerbEdit = myViewHolder.VersionName.getRootView().findViewById(R.id.eu_verb_edit);
        mEleVerbEdit = myViewHolder.VersionName.getRootView().findViewById(R.id.ele_verb_edit);
        mNosVerbEdit = myViewHolder.VersionName.getRootView().findViewById(R.id.nos_verb_edit);
        mElesVerbEdit = myViewHolder.VersionName.getRootView().findViewById(R.id.eles_verb_edit);

        mEuVerb = myViewHolder.VersionName.getRootView().findViewById(R.id.eu_verb_txt);
        mEleVerb = myViewHolder.VersionName.getRootView().findViewById(R.id.ele_verb_txt);
        mNosVerb = myViewHolder.VersionName.getRootView().findViewById(R.id.nos_verb_txt);
        mElesVerb = myViewHolder.VersionName.getRootView().findViewById(R.id.eles_verb_txt);

        mEu = myViewHolder.VersionName.getRootView().findViewById(R.id.eu_txt);
        mEle = myViewHolder.VersionName.getRootView().findViewById(R.id.ele_txt);
        mNos = myViewHolder.VersionName.getRootView().findViewById(R.id.nos_txt);
        mEles = myViewHolder.VersionName.getRootView().findViewById(R.id.eles_txt);

        floatingActionButton = myViewHolder.VersionName.getRootView().findViewById(R.id.submitInfo_button);

        String[] words = list.get(i);

        mTenseport.setText(words[0]);
        mTenseeng.setText(words[1]);
        mEuVerbEdit.setText(words[2]);
        mEleVerbEdit.setText(words[3]);
        mNosVerbEdit.setText(words[4]);
        mElesVerbEdit.setText(words[5]);

        mEuVerb.setText(words[2]);
        mEleVerb.setText(words[3]);
        mNosVerb.setText(words[4]);
        mElesVerb.setText(words[5]);

        //TODO Switch Case
        mEu.setText(R.string.eu);
        mEle.setText(R.string.voc_ele_ela);
        mNos.setText(R.string.nos);
        mEles.setText(R.string.vocs_eles_elas);

        //TODO set if where disable edit and hide FAB
        Boolean EditOrList = false;

        if(EditOrList)//List
        {
            mEuVerbEdit.setVisibility(View.GONE);
            mEleVerbEdit.setVisibility(View.GONE);
            mNosVerbEdit.setVisibility(View.GONE);
            mElesVerbEdit.setVisibility(View.GONE);
        }
        else
        {
            mEuVerb.setVisibility(View.GONE);
            mEleVerb.setVisibility(View.GONE);
            mNosVerb.setVisibility(View.GONE);
            mElesVerb.setVisibility(View.GONE);
        }






    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder
    {
        View VersionName;
        public MyViewHolder(View itemView) {
            super(itemView);
            VersionName = itemView;

        }
    }

}
