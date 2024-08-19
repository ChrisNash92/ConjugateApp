package com.example.myapplication;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Arrays;


/**
 * A simple {@link Fragment} subclass.
 */
public class AddVerbFragment extends Fragment implements View.OnClickListener {

    private EditText porVerb, engVerb;
    private Button bnAddVerb;
    private RadioButton rbRegular;
    private RadioButton rbIrregular;
    private RadioGroup radioGroup;
    private FloatingActionButton fab;

    public AddVerbFragment() {
        // Required empty public constructor
    }

    public static boolean isStringOnlyAlphabet(String str) {
        return ((str != null)
                && (str.matches("^[a-zA-Z ]*$")));
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_add_user, container, false);
        bnAddVerb = view.findViewById(R.id.addVerbButton);
        porVerb = view.findViewById(R.id.addPorVerb);
        engVerb = view.findViewById(R.id.addEngVerb);
        rbRegular = view.findViewById(R.id.radio_regular);
        rbIrregular = view.findViewById(R.id.radio_irregular);
        radioGroup = view.findViewById(R.id.RadioGroup);

        rbRegular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bnAddVerb.setText("Add");
            }
        });

        rbIrregular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bnAddVerb.setText("Next");
            }
        });

        ((MainActivity)getActivity()).getSupportActionBar().setTitle("Add new verbs");
        ((MainActivity)getActivity()).setHideMenu(true);

        radioGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Do nothing;
            }
        });

        bnAddVerb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String porverb = porVerb.getText().toString();
                String engverb = engVerb.getText().toString();
                if (!isStringOnlyAlphabet(porverb)) {
                    Toast.makeText(getActivity(), "Portuguese verb must not contain any special characters or spaces", Toast.LENGTH_SHORT).show();
                } else if (porverb.length() < 2) {
                    Toast.makeText(getActivity(), "Portuguese verb must contain three or more characters", Toast.LENGTH_SHORT).show();
                } else if (!porverb.substring(porverb.length() - 2).matches("(?i)ar") &&
                        !porverb.substring(porverb.length() - 2).matches("(?i)er") &&
                        !porverb.substring(porverb.length() - 2).matches("(?i)ir")) {
                    Toast.makeText(getActivity(), "Portuguese verb must end in 'ar','er' or 'ir'", Toast.LENGTH_SHORT).show();
                } else if (MainActivity.myAppDatabase.myDao().getPorVerbs().contains(porverb.toLowerCase())) {
                    Toast.makeText(getActivity(), "Verb already exists in the database", Toast.LENGTH_SHORT).show();
                } else if (engverb.trim().isEmpty()) {
                    Toast.makeText(getActivity(), "English verb is empty", Toast.LENGTH_SHORT).show();
                } else {

                    if (rbRegular.isChecked()) {
                        Verb verb = new Verb(String.join("", porverb.substring(0, 1).toUpperCase(), porverb.substring(1).toLowerCase()), engverb, false);
                        MainActivity.myAppDatabase.myDao().addVerb(verb);
                        Toast.makeText(getActivity(), "Verb added successfully", Toast.LENGTH_SHORT).show();
                        porVerb.setText("");
                        engVerb.setText("");
                        MainActivity.adapter.notifyDataSetChanged();
                    }
                    if (rbIrregular.isChecked()) {
                        MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new AddIrregularInfo(porverb,engverb)).addToBackStack(null).commit();
                    }

                }


            }
        });

        return view;
    }

    private void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        //TODO figure if this does anything?
       /* // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio_irregular:
                if (checked)
                    break;
            case R.id.radio_regular:
                if (checked)
                    break;
            default:
                break;
        } */
    }

    @Override
    public void onClick(View v) {

    }
}
