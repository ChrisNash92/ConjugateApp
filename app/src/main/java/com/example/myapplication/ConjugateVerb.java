package com.example.myapplication;

import java.util.ArrayList;
import java.util.List;

public class ConjugateVerb {

    private String mVerb;

    public ConjugateVerb(String verb){
        mVerb = verb;
    }

    public List<String[]> getConjVerbs(){
        List<String[]> toReturn = new ArrayList<>();
        String verbRule;

        String verbType = mVerb.substring(mVerb.length()-2);
        String verbBody = mVerb.substring(0,mVerb.length()-2);

        if(verbType.matches("(?i)ar")){

            //1 Present
            toReturn.add(new String[]{"Indicativo Presente", "Present",
                    verbBody + "o",
                    verbBody + "a",
                    verbBody + "amos",
                    verbBody + "am"});

            //2 Perfect past
            if(String.valueOf(verbBody.charAt(verbBody.length() - 1)).matches("(?i)g"))
            {
                verbRule = verbBody + "uei";
            }
            else if(String.valueOf(verbBody.charAt(verbBody.length() - 1)).matches("(?i)c"))
            {
                verbRule = verbBody.substring(0,verbBody.length()-1) + "quei";
            }
            else{
                verbRule = verbBody + "ei";
            }

            toReturn.add(new String[]{"Indicativo Pretérito Perfeito","Perfect Past",
                    verbRule,
                    verbBody + "ou",
                    verbBody + "amos",
                    verbBody + "aram"});

            //3 Imperfect Past
            toReturn.add(new String[]{"Indicativo Pretérito Imperfeito","Imperfect Past",
                    verbBody + "ava",
                    verbBody + "ava",
                    verbBody + "ávamos",
                    verbBody + "avam"});

            //4 More than perfect past
            toReturn.add(new String[]{"Indicativo Pretérito Mais-Que-Perfeito","More-Than-Perfect Past",
                    verbBody + "ara",
                    verbBody + "ara",
                    verbBody + "áramos",
                    verbBody + "aram"});

            //5 Perfect Past Compound
            toReturn.add(new String[]{"Indicativo Pretérito Composto","Perfect Past Compound",
                    verbBody + "ado",
                    verbBody + "ado",
                    verbBody + "ado",
                    verbBody + "ado"});

            //6 MoreThanPerfect Past Compound
            toReturn.add(new String[]{"Indicativo Pretérito Mais-Que-Perfeito Composto","More-Than-Perfect Past Compound",
                    verbBody + "ado",
                    verbBody + "ado",
                    verbBody + "ado",
                    verbBody + "ado"});

            //7 Past More Than Perfect Past
            toReturn.add(new String[]{"Indicativo Pretérito Mais-Que-Perfeito Anterior","Past More-Than-Perfect Past",
                    verbBody + "ado",
                    verbBody + "ado",
                    verbBody + "ado",
                    verbBody + "ado"});

            //8 Simple Future
            toReturn.add(new String[]{"Indicativo Futuro Do Presente Simples","Simple Future",
                    verbBody + "arei",
                    verbBody + "ará",
                    verbBody + "aremos",
                    verbBody + "arão"});

            //9 Future present compound
            toReturn.add(new String[]{"Indicativo Futuro Do Presente Composto","Future Compound",
                    verbBody + "ado",
                    verbBody + "ado",
                    verbBody + "ado",
                    verbBody + "ado"});

            //10 Conjunctive/Subjunctive Present
            toReturn.add(new String[]{"Conjuntivo/Subjuntivo Presente","Conjunctive/Subjunctive Present",
                    verbBody + "ue",
                    verbBody + "ue",
                    verbBody + "uemos",
                    verbBody + "uem"});

            //11 Conjuctive/Subjuntive Perfect Past
            toReturn.add(new String[]{"Conjuntivo/Subjuntivo Pretérito Perfeito","Conjunctive / Subjunctive Past Present",
                    verbBody + "ado",
                    verbBody + "ado",
                    verbBody + "ado",
                    verbBody + "ado"});

            //12 Conjunctive/Subjunctive Imperfect Past
            toReturn.add(new String[]{"Conjuntivo/Subjuntivo Pretérito Imperfeito","Conjunctive/Subjunctive Imperfect Past",
                    verbBody + "asse",
                    verbBody + "asse",
                    verbBody + "ássemos",
                    verbBody + "assem"});


            //13 Conjunctive/Subjunctive More-than-perfect Compound
            toReturn.add(new String[]{"Conjuntivo/Subjuntivo Pretérito Mais-Que-Perfeito Composto","Conjunctive/Subjunctive More-Than-Perfect Past Compound",
                    verbBody + "ado",
                    verbBody + "ado",
                    verbBody + "ado",
                    verbBody + "ado"});

            //14 Conjunctive/Subjunctive Future
            toReturn.add(new String[]{"Conjuntivo/Subjuntivo Futuro","Conjunctive/Subjunctive Future",
                    verbBody + "ar",
                    verbBody + "ar",
                    verbBody + "armos",
                    verbBody + "arem"});

            //15 Conjunctive/Subjunctive Future Compound
            toReturn.add(new String[]{"Conjuntivo/Subjuntivo Futuro","Conjunctive/Subjunctive Future",
                    verbBody + "ado",
                    verbBody + "ado",
                    verbBody + "ado",
                    verbBody + "ado"});

            //16 Conditional Future Simple
            toReturn.add(new String[]{"Condicional Futuro Do Pretérito Simples","Conditional Future Simple",
                    verbBody + "aria",
                    verbBody + "aria",
                    verbBody + "aríamos",
                    verbBody + "ariam"});


            //17 Conditional Future Of Past Compound
            toReturn.add(new String[]{"Condicional Futuro Do Pretérito Composto","Conditional Future Of Past Compound",
                    verbBody + "ado",
                    verbBody + "ado",
                    verbBody + "ado",
                    verbBody + "ado"});

            //18 Imperative
            toReturn.add(new String[]{"Imperativo","Imperative",
                    verbBody + "a",
                    verbBody + "ue",
                    verbBody + "uemos",
                    verbBody + "uem"});

            //19 Negative Imperative
            toReturn.add(new String[]{"Imperativo Negativo","Negative Imperative",
                    verbBody + "ues",
                    verbBody + "ue",
                    verbBody + "uemos",
                    verbBody + "uem"});
        }

        //TODO Change er and ir rules

        if(verbType.matches("(?i)er")) {

            //1 Present
            toReturn.add(new String[]{"Indicativo Presente", "Present",
                    verbBody + "o",
                    verbBody + "a",
                    verbBody + "amos",
                    verbBody + "am"});

            //2 Perfect past
            if (String.valueOf(verbBody.charAt(verbBody.length() - 1)).matches("(?i)g")) {
                verbRule = verbBody + "uei";
            } else if (String.valueOf(verbBody.charAt(verbBody.length() - 1)).matches("(?i)c")) {
                verbRule = verbBody.substring(0, verbBody.length() - 1) + "quei";
            } else {
                verbRule = verbBody + "ei";
            }

            toReturn.add(new String[]{"Indicativo Pretérito Perfeito", "Perfect Past",
                    verbRule,
                    verbBody + "ou",
                    verbBody + "amos",
                    verbBody + "aram"});

            //3 Imperfect Past
            toReturn.add(new String[]{"Indicativo Pretérito Imperfeito", "Imperfect Past",
                    verbBody + "ava",
                    verbBody + "ava",
                    verbBody + "ávamos",
                    verbBody + "avam"});

            //4 More than perfect past
            toReturn.add(new String[]{"Indicativo Pretérito Mais-Que-Perfeito", "More-Than-Perfect Past",
                    verbBody + "ara",
                    verbBody + "ara",
                    verbBody + "áramos",
                    verbBody + "aram"});

            //5 Perfect Past Compound
            toReturn.add(new String[]{"Indicativo Pretérito Composto", "Perfect Past Compound",
                    verbBody + "ado",
                    verbBody + "ado",
                    verbBody + "ado",
                    verbBody + "ado"});

            //6 Perfect Past Compound
            toReturn.add(new String[]{"Indicativo Pretérito Mais-Que-Perfeito Composto", "More-Than-Perfect Past Compound",
                    verbBody + "ado",
                    verbBody + "ado",
                    verbBody + "ado",
                    verbBody + "ado"});

            //7 Perfect Past Compound
            toReturn.add(new String[]{"Indicativo Pretérito Mais-Que-Perfeito Anterior", "Past More-Than-Perfect Past",
                    verbBody + "ado",
                    verbBody + "ado",
                    verbBody + "ado",
                    verbBody + "ado"});

            //8 Simple Future
            toReturn.add(new String[]{"Indicativo Futuro Do Presente Simples", "Simple Future",
                    verbBody + "arei",
                    verbBody + "ará",
                    verbBody + "aremos",
                    verbBody + "arão"});

            //9 Future present compound
            toReturn.add(new String[]{"Indicativo Futuro Do Presente Composto", "Future Compound",
                    verbBody + "ado",
                    verbBody + "ado",
                    verbBody + "ado",
                    verbBody + "ado"});

            //10 Conjunctive/Subjunctive Present
            toReturn.add(new String[]{"Conjuntivo/Subjuntivo Presente", "Conjunctive/Subjunctive Present",
                    verbBody + "ue",
                    verbBody + "ue",
                    verbBody + "uemos",
                    verbBody + "uem"});

            //11 Conjuctive/Subjuntive Perfect Past
            toReturn.add(new String[]{"Conjuntivo/Subjuntivo Pretérito Perfeito", "Conjunctive / Subjunctive Past Present",
                    verbBody + "ado",
                    verbBody + "ado",
                    verbBody + "ado",
                    verbBody + "ado"});

            //12 Conjunctive/Subjunctive Imperfect Past
            toReturn.add(new String[]{"Conjuntivo/Subjuntivo Pretérito Imperfeito", "Conjunctive/Subjunctive Imperfect Past",
                    verbBody + "asse",
                    verbBody + "asse",
                    verbBody + "ássemos",
                    verbBody + "assem"});


            //13 Conjunctive/Subjunctive More-than-perfect Compound
            toReturn.add(new String[]{"Conjuntivo/Subjuntivo Pretérito Mais-Que-Perfeito Composto", "Conjunctive/Subjunctive More-Than-Perfect Past Compound",
                    verbBody + "ado",
                    verbBody + "ado",
                    verbBody + "ado",
                    verbBody + "ado"});

            //14 Conjunctive/Subjunctive Future
            toReturn.add(new String[]{"Conjuntivo/Subjuntivo Futuro", "Conjunctive/Subjunctive Future",
                    verbBody + "ar",
                    verbBody + "ar",
                    verbBody + "armos",
                    verbBody + "arem"});

            //15 Conjunctive/Subjunctive Future Compound
            toReturn.add(new String[]{"Conjuntivo/Subjuntivo Futuro", "Conjunctive/Subjunctive Future",
                    verbBody + "ado",
                    verbBody + "ado",
                    verbBody + "ado",
                    verbBody + "ado"});

            //16 Conditional Future Simple
            toReturn.add(new String[]{"Condicional Futuro Do Pretérito Simples", "Conditional Future Simple",
                    verbBody + "aria",
                    verbBody + "aria",
                    verbBody + "aríamos",
                    verbBody + "ariam"});


            //17 Conditional Future Of Perfect Compound
            toReturn.add(new String[]{"Condicional Futuro Do Pretérito Composto", "Conditional Future Compound",
                    verbBody + "ado",
                    verbBody + "ado",
                    verbBody + "ado",
                    verbBody + "ado"});

            //18 Imperative
            toReturn.add(new String[]{"Imperativo", "Imperative",
                    verbBody + "a",
                    verbBody + "ue",
                    verbBody + "uemos",
                    verbBody + "uem"});

            //19 Negative Imperative
            toReturn.add(new String[]{"Imperativo Negativo", "Negative Imperative",
                    verbBody + "ues",
                    verbBody + "ue",
                    verbBody + "uemos",
                    verbBody + "uem"});
        }

        if(verbType.matches("(?i)ir")){


            //1 Present
            toReturn.add(new String[]{"Indicativo Presente", "Present",
                    verbBody + "o",
                    verbBody + "a",
                    verbBody + "amos",
                    verbBody + "am"});

            //2 Perfect past
            if(String.valueOf(verbBody.charAt(verbBody.length() - 1)).matches("(?i)g"))
            {
                verbRule = verbBody + "uei";
            }
            else if(String.valueOf(verbBody.charAt(verbBody.length() - 1)).matches("(?i)c"))
            {
                verbRule = verbBody.substring(0,verbBody.length()-1) + "quei";
            }
            else{
                verbRule = verbBody + "ei";
            }

            toReturn.add(new String[]{"Indicativo Pretérito Perfeito","Perfect Past",
                    verbRule,
                    verbBody + "ou",
                    verbBody + "amos",
                    verbBody + "aram"});

            //3 Imperfect Past
            toReturn.add(new String[]{"Indicativo Pretérito Imperfeito","Imperfect Past",
                    verbBody + "ava",
                    verbBody + "ava",
                    verbBody + "ávamos",
                    verbBody + "avam"});

            //4 More than perfect past
            toReturn.add(new String[]{"Indicativo Pretérito Mais-Que-Perfeito","More-Than-Perfect Past",
                    verbBody + "ara",
                    verbBody + "ara",
                    verbBody + "áramos",
                    verbBody + "aram"});

            //5 Perfect Past Compound
            toReturn.add(new String[]{"Indicativo Pretérito Composto","Perfect Past Compound",
                    verbBody + "ado",
                    verbBody + "ado",
                    verbBody + "ado",
                    verbBody + "ado"});

            //6 Perfect Past Compound
            toReturn.add(new String[]{"Indicativo Pretérito Mais-Que-Perfeito Composto","More-Than-Perfect Past Compound",
                    verbBody + "ado",
                    verbBody + "ado",
                    verbBody + "ado",
                    verbBody + "ado"});

            //7 Perfect Past Compound
            toReturn.add(new String[]{"Indicativo Pretérito Mais-Que-Perfeito Anterior","Past More-Than-Perfect Past",
                    verbBody + "ado",
                    verbBody + "ado",
                    verbBody + "ado",
                    verbBody + "ado"});

            //8 Simple Future
            toReturn.add(new String[]{"Indicativo Futuro Do Presente Simples","Simple Future",
                    verbBody + "arei",
                    verbBody + "ará",
                    verbBody + "aremos",
                    verbBody + "arão"});

            //9 Future present compound
            toReturn.add(new String[]{"Indicativo Futuro Do Presente Composto","Future Compound",
                    verbBody + "ado",
                    verbBody + "ado",
                    verbBody + "ado",
                    verbBody + "ado"});

            //10 Conjunctive/Subjunctive Present
            toReturn.add(new String[]{"Conjuntivo/Subjuntivo Presente","Conjunctive/Subjunctive Present",
                    verbBody + "ue",
                    verbBody + "ue",
                    verbBody + "uemos",
                    verbBody + "uem"});

            //11 Conjuctive/Subjuntive Perfect Past
            toReturn.add(new String[]{"Conjuntivo/Subjuntivo Pretérito Perfeito","Conjunctive / Subjunctive Past Present",
                    verbBody + "ado",
                    verbBody + "ado",
                    verbBody + "ado",
                    verbBody + "ado"});

            //12 Conjunctive/Subjunctive Imperfect Past
            toReturn.add(new String[]{"Conjuntivo/Subjuntivo Pretérito Imperfeito","Conjunctive/Subjunctive Imperfect Past",
                    verbBody + "asse",
                    verbBody + "asse",
                    verbBody + "ássemos",
                    verbBody + "assem"});


            //13 Conjunctive/Subjunctive More-than-perfect Compound
            toReturn.add(new String[]{"Conjuntivo/Subjuntivo Pretérito Mais-Que-Perfeito Composto","Conjunctive/Subjunctive More-Than-Perfect Past Compound",
                    verbBody + "ado",
                    verbBody + "ado",
                    verbBody + "ado",
                    verbBody + "ado"});

            //14 Conjunctive/Subjunctive Future
            toReturn.add(new String[]{"Conjuntivo/Subjuntivo Futuro","Conjunctive/Subjunctive Future",
                    verbBody + "ar",
                    verbBody + "ar",
                    verbBody + "armos",
                    verbBody + "arem"});

            //15 Conjunctive/Subjunctive Future Compound
            toReturn.add(new String[]{"Conjuntivo/Subjuntivo Futuro","Conjunctive/Subjunctive Future",
                    verbBody + "ado",
                    verbBody + "ado",
                    verbBody + "ado",
                    verbBody + "ado"});

            //16 Conditional Future Simple
            toReturn.add(new String[]{"Condicional Futuro Do Pretérito Simples","Conditional Future Simple",
                    verbBody + "aria",
                    verbBody + "aria",
                    verbBody + "aríamos",
                    verbBody + "ariam"});


            //17 Conditional Future Of Perfect Compound
            toReturn.add(new String[]{"Condicional Futuro Do Pretérito Composto","Conditional Future Compound",
                    verbBody + "ado",
                    verbBody + "ado",
                    verbBody + "ado",
                    verbBody + "ado"});

            //18 Imperative
            toReturn.add(new String[]{"Imperativo","Imperative",
                    verbBody + "a",
                    verbBody + "ue",
                    verbBody + "uemos",
                    verbBody + "uem"});

            //19 Negative Imperative
            toReturn.add(new String[]{"Imperativo Negativo","Negative Imperative",
                    verbBody + "ues",
                    verbBody + "ue",
                    verbBody + "uemos",
                    verbBody + "uem"});

        }

        return toReturn;
    }
}
