package com.example.myapplication;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;

@Entity(tableName = "verbs")
public class Verb {

    @PrimaryKey(autoGenerate = true)
    private int id;

    private String porVerb;
    private String engVerb;

    private boolean isProtected;

    @TypeConverters(Converters.class)
    private Tense Present;
    @TypeConverters(Converters.class)
    private Tense PerfectPast;
    @TypeConverters(Converters.class)
    private Tense ImperfectPerfectPast;
    @TypeConverters(Converters.class)
    private Tense Conditional;
    @TypeConverters(Converters.class)
    private Tense FutureSubjunctive;
    @TypeConverters(Converters.class)
    private Tense PresentParticiple;
    @TypeConverters(Converters.class)
    private Tense Imperative;
    @TypeConverters(Converters.class)
    private Tense SimpleFuture;


    @Ignore
    //Use for regular verbs.
    public Verb(String porVerb, String engVerb, boolean isProtected) {
        this.porVerb = porVerb;
        this.engVerb = engVerb;
        this.isProtected = isProtected;

        ConjugateVerb cr = new ConjugateVerb(porVerb);

        this.Present = cr.conjugatePresent();
        this.PerfectPast = cr.conjugatePerfectPast();
        this.ImperfectPerfectPast = cr.conjugateImperfectPast();
        this.Conditional = cr.conjugateConditional();
        this.FutureSubjunctive = cr.conjugateFutureSubjunctive();
        this.PresentParticiple = cr.conjugatePresentParticiple();
        this.Imperative = cr.conjugateImperative();
        this.SimpleFuture = cr.conjugateSimpleFuture();
    }

    public Verb(int id)
    {
        this.id = id;
    }

    public Verb(String porVerb, String engVerb, boolean isProtected,
                Tense present, Tense perfectPast, Tense imperfectPast, Tense simpleFuture, Tense conditional, Tense futureSubjunctive, Tense presentParticiple, Tense imperative) {
        this.porVerb = porVerb;
        this.engVerb = engVerb;
        this.isProtected = isProtected;
        this.Present = present;
        this.PerfectPast = perfectPast;
        this.ImperfectPerfectPast = imperfectPast;
        this.Conditional = conditional;
        this.FutureSubjunctive = futureSubjunctive;
        this.PresentParticiple = presentParticiple;
        this.Imperative = imperative;
        this.SimpleFuture = simpleFuture;
    }

    @Ignore
    public Verb(int id, String porVerb, String engVerb, boolean isProtected,
                String present_eu, String present_ele, String present_nos, String present_eles,
                String perfectpast_eu, String perfectpast_ele, String perfectpast_nos, String perfectpast_eles,
                String imperfectpast_eu, String imperfectpast_ele, String imperfectpast_nos, String imperfectpast_eles,
                String conditional_eu, String conditional_ele, String conditional_nos, String conditional_eles,
                String futureSub_eu, String futureSub_ele, String futureSub_nos, String futureSub_eles,
                String presentPart_eu, String presentPart_ele, String presentPart_nos, String presentPart_eles,
                String imperative_ele, String imperative_nos, String imperative_eles,
                String simpleFuture_eu, String simpleFuture_ele, String simpleFuture_nos, String simpleFuture_eles) {
        this.id = id;
        this.porVerb = porVerb;
        this.engVerb = engVerb;
        this.isProtected = isProtected;

        this.Present = new Tense(present_eu, present_ele, present_nos, present_eles);
        this.PerfectPast = new Tense(perfectpast_eu, perfectpast_ele, perfectpast_nos, perfectpast_eles);
        this.ImperfectPerfectPast = new Tense(imperfectpast_eu, imperfectpast_ele, imperfectpast_nos, imperfectpast_eles);
        this.Conditional = new Tense(conditional_eu, conditional_ele, conditional_nos, conditional_eles);
        this.FutureSubjunctive = new Tense(futureSub_eu, futureSub_ele, futureSub_nos, futureSub_eles);
        this.PresentParticiple = new Tense(presentPart_eu, presentPart_ele, presentPart_nos, presentPart_eles);
        this.Imperative = new Tense(null, imperative_ele, imperative_nos, imperative_eles);
        this.SimpleFuture = new Tense(simpleFuture_eu, simpleFuture_ele, simpleFuture_nos, simpleFuture_eles);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPorVerb() {
        return porVerb;
    }

    public void setPorVerb(String porVerb) {
        this.porVerb = porVerb;
    }

    public String getEngVerb() {
        return engVerb;
    }

    public void setEngVerb(String engVerb) {
        this.engVerb = engVerb;
    }

    public boolean isProtected() {
        return isProtected;
    }

    public void setProtected(boolean aProtected) {
        isProtected = aProtected;
    }

    public Tense getPresent(){ return  this.Present;}
    public void setPresent(String present) {this.Present = Converters.fromString(present);}
    public void setPresent(Tense present) {this.Present = present;}

    public Tense getPerfectPast() {return  this.PerfectPast;}
    public void setPerfectPast(String perfectPast) {this.PerfectPast = Converters.fromString(perfectPast);}
    public void setPerfectPast(Tense perfectPast) {this.PerfectPast = perfectPast;}

    public Tense getImperfectPerfectPast() {return this.ImperfectPerfectPast; }
    public void setImperfectPerfectPast(String imperfectPerfectPast) {this.ImperfectPerfectPast = Converters.fromString(imperfectPerfectPast);}
    public void setImperfectPerfectPast(Tense imperfectPerfectPast) {this.ImperfectPerfectPast = imperfectPerfectPast;}

    public Tense getConditional() {return this.Conditional; }
    public void setConditional(String conditional){this.Conditional = Converters.fromString(conditional);}
    public void setConditional(Tense conditional){this.Conditional = conditional;}

    public Tense getFutureSubjunctive() {return this.FutureSubjunctive; }
    public void setFutureSubjunctive(String futureSubjunctive){this.FutureSubjunctive = Converters.fromString(futureSubjunctive);}
    public void setFutureSubjunctive(Tense futureSubjunctive){this.FutureSubjunctive = futureSubjunctive;}

    public Tense getPresentParticiple() {return this.PresentParticiple; }
    public void setPresentParticiple(String presentParticiple){this.PresentParticiple = Converters.fromString(presentParticiple);}
    public void setPresentParticiple(Tense presentParticiple) {this.PresentParticiple = presentParticiple;}

    public Tense getImperative() {return this.Imperative; }
    public void setImperative(String imperative){this.Imperative = Converters.fromString(imperative);}
    public void setImperative(Tense imperative){this.Imperative = imperative;}

    public Tense getSimpleFuture() {return this.SimpleFuture;}
    public void setSimpleFuture(String simpleFuture) {this.SimpleFuture = Converters.fromString(simpleFuture);}
    public void setSimpleFuture(Tense simpleFuture){this.SimpleFuture = simpleFuture;}

    public static Verb[] preloadVerbs(){
        return new Verb[] {
                new Verb("Achar","To Find",true),
                new Verb("Amarrar","To Tie",true),
                new Verb("Apagar","To Turn Off",true),
                new Verb("Arrumar","To Tidy Up/Fix",true),
                new Verb("Atravessar","To Cross",true),
                new Verb("Cantar","To Sing",true),
                new Verb("Chamar","To Call",true),
                new Verb("Chorar","To Cry",true),
                new Verb("Começar","To Begin/Start",true),
                new Verb("Consertar","To Repair/Fix",true),
                new Verb("Cortar","To Cut",true),
                new Verb("Costurar","To Sew",true),
                new Verb("Cozinhar","To Cook",true),
                new Verb("Encontrar","To Meet/Find",true),
                new Verb("Esperar","To Wait/Hope/Expect",true),
                new Verb("Esquentar","To Warm/Heat",true),
                new Verb("Ganhar","To Win/Earn",true),
                new Verb("Leventar","To Stand",true),
                new Verb("Levar","To Take/Carry",true),
                new Verb("Ligar","To Turn On/Connect",true),
                new Verb("Limpar","To Clean",true),
                new Verb("Mandar","To Command/Send/Order",true),
                new Verb("Misturar","To Mix",true),
                new Verb("Nadar","To Swim",true),
                new Verb("Olhar","To Look",true),
                new Verb("Pagar","To Pay",true),
                new Verb("Pegar","To Catch/Pick Up",true),
                new Verb("Dançar","To Dance",true),
                new Verb("Pendurar","To Hang",true),
                new Verb("Derrubar","To Drop",true),
                new Verb("Procurar","To Look For",true),
                new Verb("Desamarrar","To Untie",true),
                new Verb("Terminar","To Finish/End",true),
                new Verb("Embrulhar","To Wrap",true),
                new Verb("Virar","To Turn/Turn Into",true),
                new Verb("Emprestar","To Borrow",true),
                new Verb("Escrever","To Write",true),
                new Verb("Correr","To Run",true),
                new Verb("Vender","To Sell",true),
                new Verb("Acender","To Illuminate",true),
                new Verb("Esquecer","To Forget",true),
                new Verb("Entender","To Understand",true),
                new Verb("Morrer","To Die",true),
                new Verb("Perder","To Lose",true),
                new Verb("Resolver","To Decide",true),
                new Verb("Descer","To Descend",true),
                new Verb("Chover","To Rain",true),
                new Verb("Pretender","To Intend",true),
                new Verb("Beber","To Drink",true),
                new Verb("Conhencer","To Know",true),
                new Verb("Comer","To Eat",true),
                new Verb("Escolher","To Choose",true),
                new Verb("Viver","To Live",true),
                new Verb("Receber","To Receive",true),
                new Verb("Estabelecer","To Establish",true),
                new Verb("Assistir","To Watch",true),
                new Verb("Decidir","To Decide",true),
                new Verb("Reunir","To Gather",true),
                new Verb("Permitir","To Permit",true),
                new Verb("Dormir","To Sleep",true),
                new Verb("Cobrir","To Cover",true),
                new Verb("Tossir","To Cough",true),
                //Fix
                //new Verb("Ir","To Go",true,"Vou","Vai","Vamos","Vão","Fui","Foi","Fomos","Foram","Ia","Ia","Íamos","Iam","Iria","Iria","Iríamos","Iriam","For","For","Formos","Forem","Indo","Indo","Indo","Indo","Vá","Vão","Irei","Irá","Iremos","Irão")

                //TODO add more verbs
        };
    }
}
