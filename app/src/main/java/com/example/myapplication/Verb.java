package com.example.myapplication;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import java.util.ArrayList;
import java.util.List;

@Entity(tableName = "verbs")
public class Verb {

    @PrimaryKey(autoGenerate = true)
    private int id;

    private String porVerb;
    private String engVerb;

    private boolean isProtected;

    private String[] Present; //1
    private String[] PerfectPast; //2
    private String[] ImperfectPast; //3
    private String[] MTPPast; //4
    private String[] PerfectPastCompound; //5
    private String[] MTPPastCompound; //6
    private String[] PastMTPPast; //7
    private String[] SimpleFuture; //8
    private String[] FutureCompound; //9
    private String[] ConSubPresent; //10
    private String[] ConSubPerfectPast; //11
    private String[] ConSubImperfectPast; //12
    private String[] ConSubMTPCompound; //13
    private String[] ConSubFuture; //14
    private String[] ConSubFutureCompound; //15
    private String[] ConditionalFuture; //16
    private String[] ConditionalFutureOfPast; //17
    private String[] Imperative; //18
    private String[] NegImperative; //19




    @Ignore
    public Verb(String porVerb, String engVerb, boolean isProtected) {
        this.porVerb = porVerb;
        this.engVerb = engVerb;
        this.isProtected = isProtected;

        ConjugateVerb cr = new ConjugateVerb(porVerb);

        List<String[]> listOfVerbs = cr.getConjVerbs();

        this.Present = listOfVerbs.get(0);
        this.PerfectPast = listOfVerbs.get(1);
        this.ImperfectPast = listOfVerbs.get(2);
        this.MTPPast = listOfVerbs.get(3);
        this.PerfectPastCompound = listOfVerbs.get(4);
        this.MTPPastCompound = listOfVerbs.get(5);
        this.PastMTPPast = listOfVerbs.get(6);
        this.SimpleFuture = listOfVerbs.get(7);
        this.FutureCompound = listOfVerbs.get(8);
        this.ConSubPresent = listOfVerbs.get(9);
        this.ConSubPerfectPast = listOfVerbs.get(10);
        this.ConSubImperfectPast = listOfVerbs.get(11);
        this.ConSubMTPCompound = listOfVerbs.get(12);
        this.ConSubFuture = listOfVerbs.get(13);
        this.ConSubFutureCompound = listOfVerbs.get(14);
        this.ConditionalFuture = listOfVerbs.get(15);
        this.ConditionalFutureOfPast = listOfVerbs.get(16);
        this.Imperative = listOfVerbs.get(17);
        this.NegImperative = listOfVerbs.get(18);


    }

    public Verb(String porVerb, String engVerb, boolean isProtected, String[] present, String[] perfectPast, String[] imperfectPast, String[] MTPPast, String[] perfectPastCompound, String[] MTPPastCompound, String[] pastMTPPast, String[] simpleFuture, String[] futureCompound, String[] conSubPresent, String[] conSubPerfectPast, String[] conSubImperfectPast, String[] conSubMTPCompound, String[] conSubFuture, String[] conSubFutureCompound, String[] conditionalFuture, String[] conditionalFutureOfPast, String[] imperative, String[] negImperative) {
        this.porVerb = porVerb;
        this.engVerb = engVerb;
        this.isProtected = isProtected;
        Present = present;
        PerfectPast = perfectPast;
        ImperfectPast = imperfectPast;
        this.MTPPast = MTPPast;
        PerfectPastCompound = perfectPastCompound;
        this.MTPPastCompound = MTPPastCompound;
        PastMTPPast = pastMTPPast;
        SimpleFuture = simpleFuture;
        FutureCompound = futureCompound;
        ConSubPresent = conSubPresent;
        ConSubPerfectPast = conSubPerfectPast;
        ConSubImperfectPast = conSubImperfectPast;
        ConSubMTPCompound = conSubMTPCompound;
        ConSubFuture = conSubFuture;
        ConSubFutureCompound = conSubFutureCompound;
        ConditionalFuture = conditionalFuture;
        ConditionalFutureOfPast = conditionalFutureOfPast;
        Imperative = imperative;
        NegImperative = negImperative;
    }

    public List<String[]> getVerbInfo()
    {
        List<String[]> toReturn = new ArrayList<>();
        toReturn.add(Present); //1
        toReturn.add(PerfectPast); //2
        toReturn.add(ImperfectPast); //3
        toReturn.add(MTPPast); //4
        toReturn.add(PerfectPastCompound); //5
        toReturn.add(MTPPastCompound); //6
        toReturn.add(PastMTPPast); //7
        toReturn.add(SimpleFuture); //8
        toReturn.add(FutureCompound); //9
        toReturn.add(ConSubPresent); //10
        toReturn.add(ConSubPerfectPast); //11
        toReturn.add(ConSubImperfectPast); //12
        toReturn.add(ConSubMTPCompound); //13
        toReturn.add(ConSubFuture); //14
        toReturn.add(ConSubFutureCompound); //15
        toReturn.add(ConditionalFuture); //16
        toReturn.add(ConditionalFutureOfPast); //17
        toReturn.add(Imperative); //18
        toReturn.add(NegImperative); //19

        return toReturn;
    }

    //region Getter Setter
    public Verb(int id)
    {
        this.id = id;
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

    public String[] getPresent() {
        return Present;
    }

    public void setPresent(String[] present) {
        Present = present;
    }

    public String[] getPerfectPast() {
        return PerfectPast;
    }

    public void setPerfectPast(String[] perfectPast) {
        PerfectPast = perfectPast;
    }

    public String[] getImperfectPast() {
        return ImperfectPast;
    }

    public void setImperfectPast(String[] imperfectPast) {
        ImperfectPast = imperfectPast;
    }

    public String[] getMTPPast() {
        return MTPPast;
    }

    public void setMTPPast(String[] MTPPast) {
        this.MTPPast = MTPPast;
    }

    public String[] getPerfectPastCompound() {
        return PerfectPastCompound;
    }

    public void setPerfectPastCompound(String[] perfectPastCompound) {
        PerfectPastCompound = perfectPastCompound;
    }

    public String[] getMTPPastCompound() {
        return MTPPastCompound;
    }

    public void setMTPPastCompound(String[] MTPPastCompound) {
        this.MTPPastCompound = MTPPastCompound;
    }

    public String[] getPastMTPPast() {
        return PastMTPPast;
    }

    public void setPastMTPPast(String[] pastMTPPast) {
        PastMTPPast = pastMTPPast;
    }

    public String[] getSimpleFuture() {
        return SimpleFuture;
    }

    public void setSimpleFuture(String[] simpleFuture) {
        SimpleFuture = simpleFuture;
    }

    public String[] getFutureCompound() {
        return FutureCompound;
    }

    public void setFutureCompound(String[] futureCompound) {
        FutureCompound = futureCompound;
    }

    public String[] getConSubPresent() {
        return ConSubPresent;
    }

    public void setConSubPresent(String[] conSubPresent) {
        ConSubPresent = conSubPresent;
    }

    public String[] getConSubPerfectPast() {
        return ConSubPerfectPast;
    }

    public void setConSubPerfectPast(String[] conSubPerfectPast) {
        ConSubPerfectPast = conSubPerfectPast;
    }

    public String[] getConSubImperfectPast() {
        return ConSubImperfectPast;
    }

    public void setConSubImperfectPast(String[] conSubImperfectPast) {
        ConSubImperfectPast = conSubImperfectPast;
    }

    public String[] getConSubMTPCompound() {
        return ConSubMTPCompound;
    }

    public void setConSubMTPCompound(String[] conSubMTPCompound) {
        ConSubMTPCompound = conSubMTPCompound;
    }

    public String[] getConSubFuture() {
        return ConSubFuture;
    }

    public void setConSubFuture(String[] conSubFuture) {
        ConSubFuture = conSubFuture;
    }

    public String[] getConSubFutureCompound() {
        return ConSubFutureCompound;
    }

    public void setConSubFutureCompound(String[] conSubFutureCompound) {
        ConSubFutureCompound = conSubFutureCompound;
    }

    public String[] getConditionalFuture() {
        return ConditionalFuture;
    }

    public void setConditionalFuture(String[] conditionalFuture) {
        ConditionalFuture = conditionalFuture;
    }

    public String[] getConditionalFutureOfPast() {
        return ConditionalFutureOfPast;
    }

    public void setConditionalFutureOfPast(String[] conditionalFutureOfPast) {
        ConditionalFutureOfPast = conditionalFutureOfPast;
    }

    public String[] getImperative() {
        return Imperative;
    }

    public void setImperative(String[] imperative) {
        Imperative = imperative;
    }

    public String[] getNegImperative() {
        return NegImperative;
    }

    public void setNegImperative(String[] negImperative) {
        NegImperative = negImperative;
    }

    //endregion

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


                //TODO add more verbs
        };
    }
}
