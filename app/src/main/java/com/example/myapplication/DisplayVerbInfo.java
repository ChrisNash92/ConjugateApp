package com.example.myapplication;


import android.os.Bundle;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Debug;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;


/**
 * A simple {@link Fragment} subclass.
 */
public class DisplayVerbInfo extends Fragment {

    private int mClickPosition;

    public DisplayVerbInfo() {
        // Required empty public constructor
    }

    public DisplayVerbInfo(int position){
        mClickPosition = position;

    }

    //TODO Make more modular
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        TextView title;
        TextView subTitle;

        //region Variables
        TextView eu_present;
        TextView ele_present;
        TextView nos_present;
        TextView eles_present;

        TextView eu_simplePast;
        TextView ele_simplePast;
        TextView nos_simplePast;
        TextView eles_simplePast;

        TextView eu_imperfectPast;
        TextView ele_imperfectPast;
        TextView nos_imperfectPast;
        TextView eles_imperfectPast;

        TextView eu_conditional;
        TextView ele_conditional;
        TextView nos_conditional;
        TextView eles_conditional;

        //TODO Figure out difference between Quando and Se and add another section (if required)
        TextView eu_futureSub;
        TextView ele_futureSub;
        TextView nos_futureSub;
        TextView eles_futureSub;

        TextView eu_gerund;
        TextView ele_gerund;
        TextView nos_gerund;
        TextView eles_gerund;

        TextView ele_imperative;
        TextView eles_imperative;

        TextView eu_simpleFuture;
        TextView ele_simpleFuture;
        TextView nos_simpleFuture;
        TextView eles_simpleFuture;
        //endregion Variables

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
        ((MainActivity)getActivity()).setClickPosition(mClickPosition);

        //region Set all text boxes

        Verb clickPosition = ((MainActivity)getActivity()).verbList.get(mClickPosition);

        Tense preset = clickPosition.getPresent();
        eu_present.setText("Eu " + preset.Eu.toLowerCase());
        ele_present.setText("Você/Ele/Ela " + preset.Ele.toLowerCase());
        nos_present.setText("Nós " + preset.Nos.toLowerCase());
        eles_present.setText("Vocês/Eles/Elas " + preset.Eles.toLowerCase());

        Tense simplePast = clickPosition.getPerfectPast();
        eu_simplePast.setText("Eu " + simplePast.Eu.toLowerCase());
        ele_simplePast.setText("Você/Ele/Ela " +  simplePast.Ele.toLowerCase());
        nos_simplePast.setText("Nós " +  simplePast.Nos.toLowerCase());
        eles_simplePast.setText("Vocês/Eles/Elas " +  simplePast.Eles.toLowerCase());

        Tense imperfectPast = clickPosition.getImperfectPerfectPast();
        eu_imperfectPast.setText("Eu " + imperfectPast.Eu.toLowerCase());
        ele_imperfectPast.setText("Você/Ele/Ela " + imperfectPast.Ele.toLowerCase());
        nos_imperfectPast.setText("Nós " + imperfectPast.Nos.toLowerCase());
        eles_imperfectPast.setText("Vocês/Eles/Elas " + imperfectPast.Eles.toLowerCase());

        Tense conditional = clickPosition.getConditional();
        eu_conditional.setText("Eu " + conditional.Eu.toLowerCase());
        ele_conditional.setText("Você/Ele/Ela " + conditional.Ele.toLowerCase());
        nos_conditional.setText("Nós " + conditional.Nos.toLowerCase());
        eles_conditional.setText("Vocês/Eles/Elas " + conditional.Eles.toLowerCase());

        Tense futureSub = clickPosition.getFutureSubjunctive();
        eu_futureSub.setText("Se/Quando eu " + futureSub.Eu.toLowerCase());
        ele_futureSub.setText("Se/Quando você/ele/ela " + futureSub.Ele.toLowerCase());
        nos_futureSub.setText("Se/Quando nós " + futureSub.Nos.toLowerCase());
        eles_futureSub.setText("Se/Quando vocês/eles/elas " + futureSub.Eles.toLowerCase());

        Tense gerund = clickPosition.getPresentParticiple();
        eu_gerund.setText("Eu estou " + gerund.Eu.toLowerCase());
        ele_gerund.setText("Você/Ele/Ela está " + gerund.Ele.toLowerCase());
        nos_gerund.setText("Nós estamos " + gerund.Nos.toLowerCase());
        eles_gerund.setText("Vocês/Eles/Elas estão " + gerund.Eles.toLowerCase());

        Tense imperative = clickPosition.getImperative();
        ele_imperative.setText("Ele " + imperative.Ele.toLowerCase());
        eles_imperative.setText("Eles " + imperative.Eles.toLowerCase());

        Tense simpleFuture = clickPosition.getSimpleFuture();
        eu_simpleFuture.setText("Eu (vou) " + simpleFuture.Eu.toLowerCase());
        ele_simpleFuture.setText("Você/Ele/Ela (vai) " + simpleFuture.Ele.toLowerCase());
        nos_simpleFuture.setText("Nós (vamos) " + simpleFuture.Nos.toLowerCase());
        eles_simpleFuture.setText("Vocês/Eles/Elas (vão) " + simpleFuture.Eles.toLowerCase());

        //endregion Set all text boxes

        return view;
    }

}
