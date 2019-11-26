package com.example.myapplication;


import android.os.Bundle;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;


/**
 * A simple {@link Fragment} subclass.
 */
public class DisplayVerbInfo extends Fragment {

    private TextView title;
    private TextView subTitle;
    private int mClickPosition;

    //region Variables
    private TextView eu_present;
    private TextView ele_present;
    private TextView nos_present;
    private TextView eles_present;

    private TextView eu_simplePast;
    private TextView ele_simplePast;
    private TextView nos_simplePast;
    private TextView eles_simplePast;

    private TextView eu_imperfectPast;
    private TextView ele_imperfectPast;
    private TextView nos_imperfectPast;
    private TextView eles_imperfectPast;

    private TextView eu_conditional;
    private TextView ele_conditional;
    private TextView nos_conditional;
    private TextView eles_conditional;

    private TextView eu_futureSub;
    private TextView ele_futureSub;
    private TextView nos_futureSub;
    private TextView eles_futureSub;

    private TextView eu_gerund;
    private TextView ele_gerund;
    private TextView nos_gerund;
    private TextView eles_gerund;

    private TextView ele_imperative;
    private TextView eles_imperative;

    private TextView eu_simpleFuture;
    private TextView ele_simpleFuture;
    private TextView nos_simpleFuture;
    private TextView eles_simpleFuture;
    //endregion Variables


    public DisplayVerbInfo() {
        // Required empty public constructor
    }

    public DisplayVerbInfo(int position){
        mClickPosition = position;

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_display_verb_info, container, false);

        title = view.findViewById(R.id.selectedVerb);
        subTitle = view.findViewById(R.id.selectedVerbEng);

        //region Impliment all text boxes
        eu_present = view.findViewById(R.id.eu_present);
        ele_present = view.findViewById(R.id.ele_present);
        nos_present = view.findViewById(R.id.nos_present);
        eles_present = view.findViewById(R.id.eles_present);

        eu_simplePast = view.findViewById(R.id.eu_simplepast);
        ele_simplePast = view.findViewById(R.id.ele_simplepast);
        nos_simplePast = view.findViewById(R.id.nos_simplepast);
        eles_simplePast = view.findViewById(R.id.eles_simplepast);

        eu_imperfectPast = view.findViewById(R.id.eu_imperfectpast);
        ele_imperfectPast = view.findViewById(R.id.ele_imperfectpast);
        nos_imperfectPast = view.findViewById(R.id.nos_imperfectpast);
        eles_imperfectPast = view.findViewById(R.id.eles_imperfectpast);

        eu_conditional = view.findViewById(R.id.eu_conditional);
        ele_conditional = view.findViewById(R.id.ele_conditional);
        nos_conditional = view.findViewById(R.id.nos_conditional);
        eles_conditional = view.findViewById(R.id.eles_conditional);

        eu_futureSub = view.findViewById(R.id.eu_futureSub);
        ele_futureSub = view.findViewById(R.id.ele_futureSub);
        nos_futureSub = view.findViewById(R.id.nos_futureSub);
        eles_futureSub = view.findViewById(R.id.eles_futureSub);

        eu_gerund = view.findViewById(R.id.eu_gerund);
        ele_gerund = view.findViewById(R.id.ele_gerund);
        nos_gerund = view.findViewById(R.id.nos_gerund);
        eles_gerund = view.findViewById(R.id.eles_gerund);

        ele_imperative = view.findViewById(R.id.ele_imperative);
        eles_imperative = view.findViewById(R.id.eles_imperative);

        eu_simpleFuture = view.findViewById(R.id.eu_futureSimple);
        ele_simpleFuture = view.findViewById(R.id.ele_futureSimple);
        nos_simpleFuture = view.findViewById(R.id.nos_futureSimple);
        eles_simpleFuture = view.findViewById(R.id.eles_futureSimple);
        //endregion Impliment all text boxes

        title.setText(((MainActivity)getActivity()).verbList.get(mClickPosition).getPorVerb());
        subTitle.setText(((MainActivity)getActivity()).verbList.get(mClickPosition).getEngVerb());

        ((MainActivity)getActivity()).getSupportActionBar().setTitle("Verb Info");
        ((MainActivity)getActivity()).setHideMenu(false);

        //region Set all text boxes
        eu_present.setText("Eu " + ((MainActivity)getActivity()).verbList.get(mClickPosition).getPresent_eu().toLowerCase());
        ele_present.setText("Você/Ele/Ela " + ((MainActivity)getActivity()).verbList.get(mClickPosition).getPresent_ele().toLowerCase());
        nos_present.setText("Nós " + ((MainActivity)getActivity()).verbList.get(mClickPosition).getPresent_nos().toLowerCase());
        eles_present.setText("Vocês/Eles/Elas " + ((MainActivity)getActivity()).verbList.get(mClickPosition).getPresent_eles().toLowerCase());

        eu_simplePast.setText("Eu " + ((MainActivity)getActivity()).verbList.get(mClickPosition).getPerfectpast_eu().toLowerCase());
        ele_simplePast.setText("Você/Ele/Ela " + ((MainActivity)getActivity()).verbList.get(mClickPosition).getPerfectpast_ele().toLowerCase());
        nos_simplePast.setText("Nós " + ((MainActivity)getActivity()).verbList.get(mClickPosition).getPerfectpast_nos().toLowerCase());
        eles_simplePast.setText("Vocês/Eles/Elas " + ((MainActivity)getActivity()).verbList.get(mClickPosition).getPerfectpast_eles().toLowerCase());

        eu_imperfectPast.setText("Eu " + ((MainActivity)getActivity()).verbList.get(mClickPosition).getImperfectpast_eu().toLowerCase());
        ele_imperfectPast.setText("Você/Ele/Ela " + ((MainActivity)getActivity()).verbList.get(mClickPosition).getImperfectpast_ele().toLowerCase());
        nos_imperfectPast.setText("Nós " + ((MainActivity)getActivity()).verbList.get(mClickPosition).getImperfectpast_nos().toLowerCase());
        eles_imperfectPast.setText("Vocês/Eles/Elas " + ((MainActivity)getActivity()).verbList.get(mClickPosition).getImperfectpast_eles().toLowerCase());

        eu_conditional.setText("Eu " + ((MainActivity)getActivity()).verbList.get(mClickPosition).getConditional_eu().toLowerCase());
        ele_conditional.setText("Você/Ele/Ela " + ((MainActivity)getActivity()).verbList.get(mClickPosition).getConditional_ele().toLowerCase());
        nos_conditional.setText("Nós " + ((MainActivity)getActivity()).verbList.get(mClickPosition).getConditional_nos().toLowerCase());
        eles_conditional.setText("Vocês/Eles/Elas " + ((MainActivity)getActivity()).verbList.get(mClickPosition).getConditional_eles().toLowerCase());

        eu_futureSub.setText("Se/Quando eu " + ((MainActivity)getActivity()).verbList.get(mClickPosition).getFutureSub_eu().toLowerCase());
        ele_futureSub.setText("Se/Quando você/ele/ela " + ((MainActivity)getActivity()).verbList.get(mClickPosition).getFutureSub_ele().toLowerCase());
        nos_futureSub.setText("Se/Quando nós " + ((MainActivity)getActivity()).verbList.get(mClickPosition).getFutureSub_nos().toLowerCase());
        eles_futureSub.setText("Se/Quando vocês/eles/elas " + ((MainActivity)getActivity()).verbList.get(mClickPosition).getFutureSub_eles().toLowerCase());

        eu_gerund.setText("Eu estou " + ((MainActivity)getActivity()).verbList.get(mClickPosition).getPresentPart_eu().toLowerCase());
        ele_gerund.setText("Você/Ele/Ela está " + ((MainActivity)getActivity()).verbList.get(mClickPosition).getPresentPart_ele().toLowerCase());
        nos_gerund.setText("Nós estamos " + ((MainActivity)getActivity()).verbList.get(mClickPosition).getPresentPart_nos().toLowerCase());
        eles_gerund.setText("Vocês/Eles/Elas estão " + ((MainActivity)getActivity()).verbList.get(mClickPosition).getPresentPart_eles().toLowerCase());

        ele_imperative.setText("Ele " + ((MainActivity)getActivity()).verbList.get(mClickPosition).getImperitive_ele().toLowerCase());
        eles_imperative.setText("Eles " + ((MainActivity)getActivity()).verbList.get(mClickPosition).getImperitive_eles().toLowerCase());

        eu_simpleFuture.setText("Eu (vou) " + ((MainActivity)getActivity()).verbList.get(mClickPosition).getFuture_eu().toLowerCase());
        ele_simpleFuture.setText("Você/Ele/Ela (vai) " + ((MainActivity)getActivity()).verbList.get(mClickPosition).getFuture_ele().toLowerCase());
        nos_simpleFuture.setText("Nós (vamos) " + ((MainActivity)getActivity()).verbList.get(mClickPosition).getFuture_nos().toLowerCase());
        eles_simpleFuture.setText("Vocês/Eles/Elas (vão) " + ((MainActivity)getActivity()).verbList.get(mClickPosition).getFuture_eles().toLowerCase());

        //endregion Set all text boxes


        return view;
    }

}
