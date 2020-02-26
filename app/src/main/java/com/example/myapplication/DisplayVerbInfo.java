package com.example.myapplication;


import android.os.Bundle;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class DisplayVerbInfo extends Fragment {

    private int mClickPosition;
    private VerbInfoRecyclerAdapter verbInfoRecyclerAdapter;

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private TextView verbPort;
    private TextView verbEng;
    private Verb selectedVerb;

    public DisplayVerbInfo() {
        // Required empty public constructor
    }

    //TODO Change constructor to include ListOrEdit Bool
    public DisplayVerbInfo(int position){
        mClickPosition = position;

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_display_verb_info, container, false);

        verbPort = view.findViewById(R.id.selectedVerb);
        verbEng = view.findViewById(R.id.selectedVerbEng);

        selectedVerb = ((MainActivity)getActivity()).verbList.get(mClickPosition);

        verbPort.setText(selectedVerb.getPorVerb());
        verbEng.setText(selectedVerb.getEngVerb());

        verbInfoRecyclerAdapter = new VerbInfoRecyclerAdapter(selectedVerb.getVerbInfo());
        recyclerView = view.findViewById(R.id.verbInfoRecyclerView);

        layoutManager = new LinearLayoutManager(view.getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(verbInfoRecyclerAdapter);



        return view;
    }

}
