package com.example.myapplication;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import androidx.recyclerview.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SearchView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListFragment extends Fragment implements View.OnClickListener, RecyclerAdapter.OnNoteListener {


    public RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private SearchView searchView;

    public FloatingActionButton fab;

    public ListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_list, container, false);
        fab = view.findViewById(R.id.floatingActionButton);
        fab.show();

        ((MainActivity)getActivity()).getSupportActionBar().setTitle("Verb List");
        ((MainActivity)getActivity()).setHideMenu(true);

        searchView = view.findViewById(R.id.search_bar);

        MainActivity.adapter = new RecyclerAdapter(((MainActivity)getActivity()).verbList,this);
        recyclerView = view.findViewById(R.id.recyclerview);
        layoutManager = new LinearLayoutManager(view.getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(MainActivity.adapter);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new AddVerbFragment()).addToBackStack(null).commit();
            }
        });

        searchView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                searchView.setIconified(false);
            }
        });

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                MainActivity.adapter.filter(query);
                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                MainActivity.adapter.filter(newText);
                return true;
            }
        });

        return view;
    }


    public void onClick(View v){

    };

    @Override
    public void onNoteClick(int position) {
        ((MainActivity)getActivity()).verbList.get(position);
        MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new DisplayVerbInfo(position)).addToBackStack(null).commit();
    }


}
