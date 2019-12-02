package com.example.myapplication;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class AddIrregularInfo extends Fragment {

    private int mPosition;
    private String porVerb;
    private String engVerb;
    private boolean editOrAdd; //true for edit, false for add.

    private TextView title;
    private TextView subTitle;

    private EditText eu_present_edit;
    private EditText ele_present_edit;
    private EditText nos_present_edit;
    private EditText eles_present_edit;

    private EditText eu_simplePast_edit;
    private EditText ele_simplePast_edit;
    private EditText nos_simplePast_edit;
    private EditText eles_simplePast_edit;

    private EditText eu_imperfectPast_edit;
    private EditText ele_imperfectPast_edit;
    private EditText nos_imperfectPast_edit;
    private EditText eles_imperfectPast_edit;

    private EditText eu_conditional_edit;
    private EditText ele_conditional_edit;
    private EditText nos_conditional_edit;
    private EditText eles_conditional_edit;

    private EditText eu_futureSub_edit;
    private EditText ele_futureSub_edit;
    private EditText nos_futureSub_edit;
    private EditText eles_futureSub_edit;

    private EditText eu_gerund_edit;
    private EditText ele_gerund_edit;
    private EditText nos_gerund_edit;
    private EditText eles_gerund_edit;

    private EditText ele_imperative_edit;
    private EditText eles_imperative_edit;

    private EditText eu_simpleFuture_edit;
    private EditText ele_simpleFuture_edit;
    private EditText nos_simpleFuture_edit;
    private EditText eles_simpleFuture_edit;

    private Button saveButton;

    public AddIrregularInfo() {
        // Required empty public constructor
    }

    public AddIrregularInfo(int position)
    {
        this.mPosition = position;
        this.editOrAdd = true;
    }

    public AddIrregularInfo(String porverb, String engverb)
    {
        this.porVerb = porverb;
        this.engVerb = engverb;
        this.editOrAdd = false;
    }





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_add_irregular_info, container, false);

        title = view.findViewById(R.id.selectedVerb_edit);
        subTitle = view.findViewById(R.id.selectedVerbEng_edit);

        eu_present_edit = view.findViewById(R.id.eu_present_edit_txtedit);
        ele_present_edit = view.findViewById(R.id.ele_present_edit_txtedit);
        nos_present_edit = view.findViewById(R.id.nos_present_edit_txtedit);
        eles_present_edit = view.findViewById(R.id.eles_present_edit_txtedit);

        eu_simplePast_edit = view.findViewById(R.id.eu_simplepast_edit_txtedit);
        ele_simplePast_edit = view.findViewById(R.id.ele_simplepast_edit_txtedit);
        nos_simplePast_edit = view.findViewById(R.id.nos_simplepast_edit_txtedit);
        eles_simplePast_edit = view.findViewById(R.id.eles_simplepast_edit_txtedit);

        eu_imperfectPast_edit = view.findViewById(R.id.eu_imperfectpast_edit_txtedit);
        ele_imperfectPast_edit = view.findViewById(R.id.ele_imperfectpast_edit_txtedit);
        nos_imperfectPast_edit = view.findViewById(R.id.nos_imperfectpast_edit_txtedit);
        eles_imperfectPast_edit = view.findViewById(R.id.eles_imperfectpast_edit_txtedit);

        eu_conditional_edit = view.findViewById(R.id.eu_conditional_edit_txtedit);
        ele_conditional_edit = view.findViewById(R.id.ele_conditional_edit_txtedit);
        nos_conditional_edit = view.findViewById(R.id.nos_conditional_edit_txtedit);
        eles_conditional_edit = view.findViewById(R.id.eles_conditional_edit_txtedit);

        eu_futureSub_edit = view.findViewById(R.id.eu_futureSub_edit_txtedit);
        ele_futureSub_edit = view.findViewById(R.id.ele_futureSub_edit_txtedit);
        nos_futureSub_edit = view.findViewById(R.id.nos_futureSub_edit_txtedit);
        eles_futureSub_edit = view.findViewById(R.id.eles_futureSub_edit_txtedit);

        eu_gerund_edit = view.findViewById(R.id.eu_gerund_edit_txtedit);
        ele_gerund_edit = view.findViewById(R.id.ele_gerund_edit_txtedit);
        nos_gerund_edit = view.findViewById(R.id.nos_gerund_edit_txtedit);
        eles_gerund_edit = view.findViewById(R.id.eles_gerund_edit_txtedit);

        ele_imperative_edit = view.findViewById(R.id.ele_imperative_edit_txtedit);
        eles_imperative_edit = view.findViewById(R.id.eles_imperative_edit_txtedit);

        eu_simpleFuture_edit = view.findViewById(R.id.eu_futureSimple_edit_txtedit);
        ele_simpleFuture_edit = view.findViewById(R.id.ele_futureSimple_edit_txtedit);
        nos_simpleFuture_edit = view.findViewById(R.id.nos_futureSimple_edit_txtedit);
        eles_simpleFuture_edit = view.findViewById(R.id.eles_futureSimple_edit_txtedit);

        saveButton = view.findViewById(R.id.saveIrregularInfoBn);

        ((MainActivity)getActivity()).getSupportActionBar().setTitle("Add Irregular Verb Info");
        ((MainActivity)getActivity()).setHideMenu(true);

        if(editOrAdd) //Information is being edited
        {

            final int ID = ((MainActivity)getActivity()).verbList.get(mPosition).getId();

            title.setText(((MainActivity)getActivity()).verbList.get(mPosition).getPorVerb());
            subTitle.setText(((MainActivity)getActivity()).verbList.get(mPosition).getEngVerb());

            eu_present_edit.setText(((MainActivity)getActivity()).verbList.get(mPosition).getPresent_eu());
            ele_present_edit.setText(((MainActivity)getActivity()).verbList.get(mPosition).getPresent_ele());
            nos_present_edit.setText(((MainActivity)getActivity()).verbList.get(mPosition).getPresent_nos());
            eles_present_edit.setText(((MainActivity)getActivity()).verbList.get(mPosition).getPresent_eles());

            eu_simplePast_edit.setText(((MainActivity)getActivity()).verbList.get(mPosition).getPerfectpast_eu());
            ele_simplePast_edit.setText(((MainActivity)getActivity()).verbList.get(mPosition).getPerfectpast_ele());
            nos_simplePast_edit.setText(((MainActivity)getActivity()).verbList.get(mPosition).getPerfectpast_nos());
            eles_simplePast_edit.setText(((MainActivity)getActivity()).verbList.get(mPosition).getPerfectpast_eles());

            eu_imperfectPast_edit.setText(((MainActivity)getActivity()).verbList.get(mPosition).getImperfectpast_eu());
            ele_imperfectPast_edit.setText(((MainActivity)getActivity()).verbList.get(mPosition).getImperfectpast_ele());
            nos_imperfectPast_edit.setText(((MainActivity)getActivity()).verbList.get(mPosition).getImperfectpast_nos());
            eles_imperfectPast_edit.setText(((MainActivity)getActivity()).verbList.get(mPosition).getImperfectpast_eles());

            eu_conditional_edit.setText(((MainActivity)getActivity()).verbList.get(mPosition).getConditional_eu());
            ele_conditional_edit.setText(((MainActivity)getActivity()).verbList.get(mPosition).getConditional_ele());
            nos_conditional_edit.setText(((MainActivity)getActivity()).verbList.get(mPosition).getConditional_nos());
            eles_conditional_edit.setText(((MainActivity)getActivity()).verbList.get(mPosition).getConditional_eles());

            eu_futureSub_edit.setText(((MainActivity)getActivity()).verbList.get(mPosition).getFutureSub_eu());
            ele_futureSub_edit.setText(((MainActivity)getActivity()).verbList.get(mPosition).getFutureSub_ele());
            nos_futureSub_edit.setText(((MainActivity)getActivity()).verbList.get(mPosition).getFutureSub_nos());
            eles_futureSub_edit.setText(((MainActivity)getActivity()).verbList.get(mPosition).getFutureSub_eles());

            eu_gerund_edit.setText(((MainActivity)getActivity()).verbList.get(mPosition).getPresentPart_eu());
            ele_gerund_edit.setText(((MainActivity)getActivity()).verbList.get(mPosition).getPresentPart_ele());
            nos_gerund_edit.setText(((MainActivity)getActivity()).verbList.get(mPosition).getPresentPart_nos());
            eles_gerund_edit.setText(((MainActivity)getActivity()).verbList.get(mPosition).getPresentPart_eles());

            ele_imperative_edit.setText(((MainActivity)getActivity()).verbList.get(mPosition).getImperitive_ele());
            eles_imperative_edit.setText(((MainActivity)getActivity()).verbList.get(mPosition).getImperitive_eles());

            eu_simpleFuture_edit.setText(((MainActivity)getActivity()).verbList.get(mPosition).getFuture_eu());
            ele_simpleFuture_edit.setText(((MainActivity)getActivity()).verbList.get(mPosition).getFuture_ele());
            nos_simpleFuture_edit.setText(((MainActivity)getActivity()).verbList.get(mPosition).getFuture_nos());
            eles_simpleFuture_edit.setText(((MainActivity)getActivity()).verbList.get(mPosition).getFuture_eles());

            saveButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Verb updatedVerb = new Verb(ID,title.getText().toString(),subTitle.getText().toString(),false,
                            eu_present_edit.getText().toString(), ele_present_edit.getText().toString(),
                            nos_present_edit.getText().toString(),eles_present_edit.getText().toString(),
                            eu_simplePast_edit.getText().toString(),ele_simplePast_edit.getText().toString(),
                            nos_simplePast_edit.getText().toString(), eles_simplePast_edit.getText().toString(),
                            eu_imperfectPast_edit.getText().toString(),ele_imperfectPast_edit.getText().toString(),
                            nos_imperfectPast_edit.getText().toString(),eles_imperfectPast_edit.getText().toString(),
                            eu_conditional_edit.getText().toString(), ele_conditional_edit.getText().toString(),
                            nos_conditional_edit.getText().toString(), eles_conditional_edit.getText().toString(),
                            eu_futureSub_edit.getText().toString(), ele_futureSub_edit.getText().toString(),
                            nos_futureSub_edit.getText().toString(), eles_futureSub_edit.getText().toString(),
                            eu_gerund_edit.getText().toString(), ele_gerund_edit.getText().toString(),
                            nos_gerund_edit.getText().toString(), eles_gerund_edit.getText().toString(),
                            ele_imperative_edit.getText().toString(), eles_imperative_edit.getText().toString(),
                            eu_simpleFuture_edit.getText().toString(), ele_simpleFuture_edit.getText().toString(),
                            nos_simpleFuture_edit.getText().toString(), eles_simpleFuture_edit.getText().toString()
                            );

                    MainActivity.myAppDatabase.myDao().updateVerb(updatedVerb);
                    MainActivity.adapter.notifyDataSetChanged();


                }
            });



        }
        else //Information is being added
        {
            title.setText(porVerb.substring(0, 1).toUpperCase() + porVerb.substring(1).toLowerCase());
            subTitle.setText(engVerb);


            saveButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(eu_present_edit.getText().toString().trim().isEmpty()|| ele_present_edit.getText().toString().trim().isEmpty()||
                            nos_present_edit.getText().toString().trim().isEmpty() || eles_present_edit.getText().toString().trim().isEmpty()||
                            eu_simplePast_edit.getText().toString().trim().isEmpty() || ele_simplePast_edit.getText().toString().trim().isEmpty()||
                            nos_simplePast_edit.getText().toString().trim().isEmpty() || eles_simplePast_edit.getText().toString().trim().isEmpty()||
                            eu_imperfectPast_edit.getText().toString().trim().isEmpty() || ele_imperfectPast_edit.getText().toString().trim().isEmpty()||
                            nos_imperfectPast_edit.getText().toString().trim().isEmpty() ||eles_imperfectPast_edit.getText().toString().trim().isEmpty()||
                            eu_conditional_edit.getText().toString().trim().isEmpty() || ele_conditional_edit.getText().toString().trim().isEmpty()||
                            nos_conditional_edit.getText().toString().trim().isEmpty() || eles_conditional_edit.getText().toString().trim().isEmpty()||
                            eu_futureSub_edit.getText().toString().trim().isEmpty() || ele_futureSub_edit.getText().toString().trim().isEmpty()||
                            nos_futureSub_edit.getText().toString().trim().isEmpty() || eles_futureSub_edit.getText().toString().trim().isEmpty()||
                            eu_gerund_edit.getText().toString().trim().isEmpty() || ele_gerund_edit.getText().toString().trim().isEmpty()||
                            nos_gerund_edit.getText().toString().trim().isEmpty() || eles_gerund_edit.getText().toString().trim().isEmpty()||
                            ele_imperative_edit.getText().toString().trim().isEmpty() || eles_imperative_edit.getText().toString().trim().isEmpty()||
                            eu_simpleFuture_edit.getText().toString().trim().isEmpty() || ele_simpleFuture_edit.getText().toString().trim().isEmpty()||
                            nos_simpleFuture_edit.getText().toString().trim().isEmpty() || eles_simpleFuture_edit.getText().toString().trim().isEmpty())
                    {
                        Toast.makeText(getActivity(), "Ensure all sections have been filled.", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Verb newVerb = new Verb(title.getText().toString(),subTitle.getText().toString(),false,
                                eu_present_edit.getText().toString(), ele_present_edit.getText().toString(),
                                nos_present_edit.getText().toString(),eles_present_edit.getText().toString(),
                                eu_simplePast_edit.getText().toString(),ele_simplePast_edit.getText().toString(),
                                nos_simplePast_edit.getText().toString(), eles_simplePast_edit.getText().toString(),
                                eu_imperfectPast_edit.getText().toString(),ele_imperfectPast_edit.getText().toString(),
                                nos_imperfectPast_edit.getText().toString(),eles_imperfectPast_edit.getText().toString(),
                                eu_conditional_edit.getText().toString(), ele_conditional_edit.getText().toString(),
                                nos_conditional_edit.getText().toString(), eles_conditional_edit.getText().toString(),
                                eu_futureSub_edit.getText().toString(), ele_futureSub_edit.getText().toString(),
                                nos_futureSub_edit.getText().toString(), eles_futureSub_edit.getText().toString(),
                                eu_gerund_edit.getText().toString(), ele_gerund_edit.getText().toString(),
                                nos_gerund_edit.getText().toString(), eles_gerund_edit.getText().toString(),
                                ele_imperative_edit.getText().toString(), eles_imperative_edit.getText().toString(),
                                eu_simpleFuture_edit.getText().toString(), ele_simpleFuture_edit.getText().toString(),
                                nos_simpleFuture_edit.getText().toString(), eles_simpleFuture_edit.getText().toString()
                        );

                        MainActivity.myAppDatabase.myDao().addVerb(newVerb);
                        MainActivity.adapter.notifyDataSetChanged();

                        ((MainActivity)getActivity()).verbList = MainActivity.myAppDatabase.myDao().getVerbs();
                        Toast.makeText(getActivity(), "Verb added successfully", Toast.LENGTH_SHORT).show();

                        MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new HomeFragment()).commit();
                        MainActivity.fragmentManager.popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);

                    }


                }
            });



        }

        return view;
    }

}
