package com.example.myapplication;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import android.content.DialogInterface;
import android.app.AlertDialog;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements View.OnClickListener{

    private Button addVerb;
    private Button listVerb;
    private Button resetVerb;


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        ((MainActivity)getActivity()).getSupportActionBar().setTitle("Home Page");
        ((MainActivity)getActivity()).setHideMenu(true);


        addVerb = view.findViewById(R.id.goToAddVerbBn);
        addVerb.setOnClickListener(this);

        listVerb = view.findViewById(R.id.goToListBn);
        listVerb.setOnClickListener(this);

        resetVerb = view.findViewById(R.id.resetBn);
        resetVerb.setOnClickListener(this);



        return view;

    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.goToListBn:
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new ListFragment()).addToBackStack(null).commit();
                break;

            case R.id.goToAddVerbBn:
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new AddVerbFragment()).addToBackStack(null).commit();
                break;

            case R.id.resetBn:
                DialogInterface.OnClickListener dialogClickListener = new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        switch (which){
                            case DialogInterface.BUTTON_POSITIVE:
                                MainActivity.myAppDatabase.myDao().clearAll();
                                MainActivity.myAppDatabase.myDao().insertAllVerbs(Verb.preloadVerbs());
                                ((MainActivity)getActivity()).verbList = MainActivity.myAppDatabase.myDao().getVerbs();
                                break;

                            case DialogInterface.BUTTON_NEGATIVE:
                                //No button clicked
                                break;
                        }
                    }
                };

                AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
                builder.setMessage("Are you sure you want to reset the database?").setPositiveButton("Yes", dialogClickListener)
                        .setNegativeButton("No", dialogClickListener).show();
        }

    }
}
