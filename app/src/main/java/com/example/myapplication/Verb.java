package com.example.myapplication;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "verbs")
public class Verb {

    @PrimaryKey(autoGenerate = true)
    private int id;

    private String porVerb;
    private String engVerb;

    private boolean isProtected;

    //Present
    private String present_eu;
    private String present_ele;
    private String present_nos;
    private String present_eles;

    //Perfect Past
    private String perfectpast_eu;
    private String perfectpast_ele;
    private String perfectpast_nos;
    private String perfectpast_eles;

    //Imperfect Past
    private String imperfectpast_eu;
    private String imperfectpast_ele;
    private String imperfectpast_nos;
    private String imperfectpast_eles;

    //Conditional Tense
    private String conditional_eu;
    private String conditional_ele;
    private String conditional_nos;
    private String conditional_eles;

    //Future Subjunctive Tense
    private String futureSub_eu;
    private String futureSub_ele;
    private String futureSub_nos;
    private String futureSub_eles;

    //Present Participle
    private String presentPart_eu;
    private String presentPart_ele;
    private String presentPart_nos;
    private String presentPart_eles;

    //Imperitive
    private String imperitive_ele;
    private String imperitive_eles;

    //Present Participle
    private String future_eu;
    private String future_ele;
    private String future_nos;
    private String future_eles;


    public Verb(String porVerb, String engVerb, boolean isProtected) {
        this.porVerb = porVerb;
        this.engVerb = engVerb;
        this.isProtected = isProtected;

        ConjugateVerb cr = new ConjugateVerb(porVerb);

        String[] listOfVerbs = cr.getConjVerbs();

        this.present_eu = listOfVerbs[0];
        this.present_ele = listOfVerbs[1];
        this.present_nos = listOfVerbs[2];
        this.present_eles = listOfVerbs[3];
        this.perfectpast_eu = listOfVerbs[4];
        this.perfectpast_ele = listOfVerbs[5];
        this.perfectpast_nos = listOfVerbs[6];
        this.perfectpast_eles = listOfVerbs[7];
        this.imperfectpast_eu = listOfVerbs[8];
        this.imperfectpast_ele = listOfVerbs[9];
        this.imperfectpast_nos = listOfVerbs[10];
        this.imperfectpast_eles = listOfVerbs[11];
        this.conditional_eu = listOfVerbs[12];
        this.conditional_ele = listOfVerbs[13];
        this.conditional_nos = listOfVerbs[14];
        this.conditional_eles = listOfVerbs[15];
        this.futureSub_eu = listOfVerbs[16];
        this.futureSub_ele = listOfVerbs[17];
        this.futureSub_nos = listOfVerbs[18];
        this.futureSub_eles = listOfVerbs[19];
        this.presentPart_eu = listOfVerbs[20];
        this.presentPart_ele = listOfVerbs[21];
        this.presentPart_nos = listOfVerbs[22];
        this.presentPart_eles = listOfVerbs[23];
        this.imperitive_ele = listOfVerbs[24];
        this.imperitive_eles = listOfVerbs[25];
        this.future_eu = listOfVerbs[26];
        this.future_ele = listOfVerbs[27];
        this.future_nos = listOfVerbs[28];
        this.future_eles = listOfVerbs[29];
    }


    @Ignore
    public Verb(String porVerb, String engVerb, boolean isProtected, String present_eu, String present_ele, String present_nos, String present_eles, String perfectpast_eu, String perfectpast_ele, String perfectpast_nos, String perfectpast_eles, String imperfectpast_eu, String imperfectpast_ele, String imperfectpast_nos, String imperfectpast_eles, String conditional_eu, String conditional_ele, String conditional_nos, String conditional_eles, String futureSub_eu, String futureSub_ele, String futureSub_nos, String futureSub_eles, String presentPart_eu, String presentPart_ele, String presentPart_nos, String presentPart_eles, String imperitive_ele, String imperitive_eles, String future_eu, String future_ele, String future_nos, String future_eles) {
        this.porVerb = porVerb;
        this.engVerb = engVerb;
        this.isProtected = isProtected;
        this.present_eu = present_eu;
        this.present_ele = present_ele;
        this.present_nos = present_nos;
        this.present_eles = present_eles;
        this.perfectpast_eu = perfectpast_eu;
        this.perfectpast_ele = perfectpast_ele;
        this.perfectpast_nos = perfectpast_nos;
        this.perfectpast_eles = perfectpast_eles;
        this.imperfectpast_eu = imperfectpast_eu;
        this.imperfectpast_ele = imperfectpast_ele;
        this.imperfectpast_nos = imperfectpast_nos;
        this.imperfectpast_eles = imperfectpast_eles;
        this.conditional_eu = conditional_eu;
        this.conditional_ele = conditional_ele;
        this.conditional_nos = conditional_nos;
        this.conditional_eles = conditional_eles;
        this.futureSub_eu = futureSub_eu;
        this.futureSub_ele = futureSub_ele;
        this.futureSub_nos = futureSub_nos;
        this.futureSub_eles = futureSub_eles;
        this.presentPart_eu = presentPart_eu;
        this.presentPart_ele = presentPart_ele;
        this.presentPart_nos = presentPart_nos;
        this.presentPart_eles = presentPart_eles;
        this.imperitive_ele = imperitive_ele;
        this.imperitive_eles = imperitive_eles;
        this.future_eu = future_eu;
        this.future_ele = future_ele;
        this.future_nos = future_nos;
        this.future_eles = future_eles;
    }


    @Ignore
    public Verb(int id, String porVerb, String engVerb, boolean isProtected, String present_eu, String present_ele, String present_nos, String present_eles, String perfectpast_eu, String perfectpast_ele, String perfectpast_nos, String perfectpast_eles, String imperfectpast_eu, String imperfectpast_ele, String imperfectpast_nos, String imperfectpast_eles, String conditional_eu, String conditional_ele, String conditional_nos, String conditional_eles, String futureSub_eu, String futureSub_ele, String futureSub_nos, String futureSub_eles, String presentPart_eu, String presentPart_ele, String presentPart_nos, String presentPart_eles, String imperitive_ele, String imperitive_eles, String future_eu, String future_ele, String future_nos, String future_eles) {
        this.id = id;
        this.porVerb = porVerb;
        this.engVerb = engVerb;
        this.isProtected = isProtected;
        this.present_eu = present_eu;
        this.present_ele = present_ele;
        this.present_nos = present_nos;
        this.present_eles = present_eles;
        this.perfectpast_eu = perfectpast_eu;
        this.perfectpast_ele = perfectpast_ele;
        this.perfectpast_nos = perfectpast_nos;
        this.perfectpast_eles = perfectpast_eles;
        this.imperfectpast_eu = imperfectpast_eu;
        this.imperfectpast_ele = imperfectpast_ele;
        this.imperfectpast_nos = imperfectpast_nos;
        this.imperfectpast_eles = imperfectpast_eles;
        this.conditional_eu = conditional_eu;
        this.conditional_ele = conditional_ele;
        this.conditional_nos = conditional_nos;
        this.conditional_eles = conditional_eles;
        this.futureSub_eu = futureSub_eu;
        this.futureSub_ele = futureSub_ele;
        this.futureSub_nos = futureSub_nos;
        this.futureSub_eles = futureSub_eles;
        this.presentPart_eu = presentPart_eu;
        this.presentPart_ele = presentPart_ele;
        this.presentPart_nos = presentPart_nos;
        this.presentPart_eles = presentPart_eles;
        this.imperitive_ele = imperitive_ele;
        this.imperitive_eles = imperitive_eles;
        this.future_eu = future_eu;
        this.future_ele = future_ele;
        this.future_nos = future_nos;
        this.future_eles = future_eles;
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

    public String getPresent_eu() {
        return present_eu;
    }

    public void setPresent_eu(String present_eu) {
        this.present_eu = present_eu;
    }

    public String getPresent_ele() {
        return present_ele;
    }

    public void setPresent_ele(String present_ele) {
        this.present_ele = present_ele;
    }

    public String getPresent_nos() {
        return present_nos;
    }

    public void setPresent_nos(String present_nos) {
        this.present_nos = present_nos;
    }

    public String getPresent_eles() {
        return present_eles;
    }

    public void setPresent_eles(String present_eles) {
        this.present_eles = present_eles;
    }

    public String getPerfectpast_eu() {
        return perfectpast_eu;
    }

    public void setPerfectpast_eu(String perfectpast_eu) {
        this.perfectpast_eu = perfectpast_eu;
    }

    public String getPerfectpast_ele() {
        return perfectpast_ele;
    }

    public void setPerfectpast_ele(String perfectpast_ele) {
        this.perfectpast_ele = perfectpast_ele;
    }

    public String getPerfectpast_nos() {
        return perfectpast_nos;
    }

    public void setPerfectpast_nos(String perfectpast_nos) {
        this.perfectpast_nos = perfectpast_nos;
    }

    public String getPerfectpast_eles() {
        return perfectpast_eles;
    }

    public void setPerfectpast_eles(String perfectpast_eles) {
        this.perfectpast_eles = perfectpast_eles;
    }

    public String getImperfectpast_eu() {
        return imperfectpast_eu;
    }

    public void setImperfectpast_eu(String imperfectpast_eu) {
        this.imperfectpast_eu = imperfectpast_eu;
    }

    public String getImperfectpast_ele() {
        return imperfectpast_ele;
    }

    public void setImperfectpast_ele(String imperfectpast_ele) {
        this.imperfectpast_ele = imperfectpast_ele;
    }

    public String getImperfectpast_nos() {
        return imperfectpast_nos;
    }

    public void setImperfectpast_nos(String imperfectpast_nos) {
        this.imperfectpast_nos = imperfectpast_nos;
    }

    public String getImperfectpast_eles() {
        return imperfectpast_eles;
    }

    public void setImperfectpast_eles(String imperfectpast_eles) {
        this.imperfectpast_eles = imperfectpast_eles;
    }

    public String getConditional_eu() {
        return conditional_eu;
    }

    public void setConditional_eu(String conditional_eu) {
        this.conditional_eu = conditional_eu;
    }

    public String getConditional_ele() {
        return conditional_ele;
    }

    public void setConditional_ele(String conditional_ele) {
        this.conditional_ele = conditional_ele;
    }

    public String getConditional_nos() {
        return conditional_nos;
    }

    public void setConditional_nos(String conditional_nos) {
        this.conditional_nos = conditional_nos;
    }

    public String getConditional_eles() {
        return conditional_eles;
    }

    public void setConditional_eles(String conditional_eles) {
        this.conditional_eles = conditional_eles;
    }

    public String getFutureSub_eu() {
        return futureSub_eu;
    }

    public void setFutureSub_eu(String futureSub_eu) {
        this.futureSub_eu = futureSub_eu;
    }

    public String getFutureSub_ele() {
        return futureSub_ele;
    }

    public void setFutureSub_ele(String futureSub_ele) {
        this.futureSub_ele = futureSub_ele;
    }

    public String getFutureSub_nos() {
        return futureSub_nos;
    }

    public void setFutureSub_nos(String futureSub_nos) {
        this.futureSub_nos = futureSub_nos;
    }

    public String getFutureSub_eles() {
        return futureSub_eles;
    }

    public void setFutureSub_eles(String futureSub_eles) {
        this.futureSub_eles = futureSub_eles;
    }

    public String getPresentPart_eu() {
        return presentPart_eu;
    }

    public void setPresentPart_eu(String presentPart_eu) {
        this.presentPart_eu = presentPart_eu;
    }

    public String getPresentPart_ele() {
        return presentPart_ele;
    }

    public void setPresentPart_ele(String presentPart_ele) {
        this.presentPart_ele = presentPart_ele;
    }

    public String getPresentPart_nos() {
        return presentPart_nos;
    }

    public void setPresentPart_nos(String presentPart_nos) {
        this.presentPart_nos = presentPart_nos;
    }

    public String getPresentPart_eles() {
        return presentPart_eles;
    }

    public void setPresentPart_eles(String presentPart_eles) {
        this.presentPart_eles = presentPart_eles;
    }

    public String getImperitive_ele() {
        return imperitive_ele;
    }

    public void setImperitive_ele(String imperitive_ele) {
        this.imperitive_ele = imperitive_ele;
    }

    public String getImperitive_eles() {
        return imperitive_eles;
    }

    public void setImperitive_eles(String imperitive_eles) {
        this.imperitive_eles = imperitive_eles;
    }

    public String getFuture_eu() {
        return future_eu;
    }

    public void setFuture_eu(String future_eu) {
        this.future_eu = future_eu;
    }

    public String getFuture_ele() {
        return future_ele;
    }

    public void setFuture_ele(String future_ele) {
        this.future_ele = future_ele;
    }

    public String getFuture_nos() {
        return future_nos;
    }

    public void setFuture_nos(String future_nos) {
        this.future_nos = future_nos;
    }

    public String getFuture_eles() {
        return future_eles;
    }

    public void setFuture_eles(String future_eles) {
        this.future_eles = future_eles;
    }

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
                new Verb("Pegar","To Catch/Pick Up",true)
        };
    }
}
