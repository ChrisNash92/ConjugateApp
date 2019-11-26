package com.example.myapplication;

public class ConjugateVerb {

    private String mVerb;

    public ConjugateVerb(String verb){
        mVerb = verb;
    }

    public String[] getConjVerbs(){
        String[] toReturn = new String[30];

        String verbType = mVerb.substring(mVerb.length()-2);
        String verbBody = mVerb.substring(0,mVerb.length()-2);

        if(verbType.matches("(?i)ar")){
            //Present
            toReturn[0] = verbBody + "o";
            toReturn[1] = verbBody + "a";
            toReturn[2] = verbBody + "amos";
            toReturn[3] = verbBody + "am";

            //Perfect past
            if(String.valueOf(verbBody.charAt(verbBody.length() - 1)).matches("(?i)g"))
            {
                toReturn[4] = verbBody + "uei";
            }
            else if(String.valueOf(verbBody.charAt(verbBody.length() - 1)).matches("(?i)c"))
            {
                toReturn[4] = verbBody.substring(0,verbBody.length()-1) + "quei";
            }
            else{
                toReturn[4] = verbBody + "ei";
            }

            toReturn[5] = verbBody + "ou";
            toReturn[6] = verbBody + "amos";
            toReturn[7] = verbBody + "aram";

            //Imperfect Past
            toReturn[8] = verbBody + "ava";
            toReturn[9] = verbBody + "ava";
            toReturn[10] = verbBody + "ávamos";
            toReturn[11] = verbBody + "avam";

            //Conditional
            toReturn[12] = verbBody + "aria";
            toReturn[13] = verbBody + "aria";
            toReturn[14] = verbBody + "aríamos";
            toReturn[15] = verbBody + "ariam";

            //Future Subjunctive
            toReturn[16] = verbBody + "ar";
            toReturn[17] = verbBody + "ar";
            toReturn[18] = verbBody + "armos";
            toReturn[19] = verbBody + "arem";

            //Present Participle
            toReturn[20] = verbBody + "ando";
            toReturn[21] = verbBody + "ando";
            toReturn[22] = verbBody + "ando";
            toReturn[23] = verbBody + "ando";

            //Imperitive
            toReturn[24] = verbBody + "e";
            toReturn[25] = verbBody + "em";

            //Future Subjunctive
            toReturn[26] = verbBody + "arei";
            toReturn[27] = verbBody + "ará";
            toReturn[28] = verbBody + "aremos";
            toReturn[29] = verbBody + "arão";

        }

        if(verbType.matches("(?i)er")){
            //Present
            toReturn[0] = verbBody + "o";
            toReturn[1] = verbBody + "e";
            toReturn[2] = verbBody + "emos";
            toReturn[3] = verbBody + "em";

            //Perfect past
            toReturn[4] = verbBody + "i";
            toReturn[5] = verbBody + "eu";
            toReturn[6] = verbBody + "emos";
            toReturn[7] = verbBody + "eram";

            //Imperfect Past
            toReturn[8] = verbBody + "ia";
            toReturn[9] = verbBody + "ia";
            toReturn[10] = verbBody + "íamos";
            toReturn[11] = verbBody + "iam";

            //Conditional
            toReturn[12] = verbBody + "eria";
            toReturn[13] = verbBody + "eria";
            toReturn[14] = verbBody + "eríamos";
            toReturn[15] = verbBody + "eriam";

            //Future Subjunctive
            toReturn[16] = verbBody + "er";
            toReturn[17] = verbBody + "er";
            toReturn[18] = verbBody + "ermos";
            toReturn[19] = verbBody + "erem";

            //Present Participle
            toReturn[20] = verbBody + "endo";
            toReturn[21] = verbBody + "endo";
            toReturn[22] = verbBody + "endo";
            toReturn[23] = verbBody + "endo";

            //Imperitive
            toReturn[24] = verbBody + "a";
            toReturn[25] = verbBody + "am";

            //Future Subjunctive
            toReturn[26] = verbBody + "erei";
            toReturn[27] = verbBody + "erá";
            toReturn[28] = verbBody + "eremos";
            toReturn[29] = verbBody + "erão";


        }

        if(verbType.matches("(?i)ir")){

            //Present
            toReturn[0] = verbBody + "o";
            toReturn[1] = verbBody + "e";
            toReturn[2] = verbBody + "imos";
            toReturn[3] = verbBody + "em";

            //Perfect past
            toReturn[4] = verbBody + "i";
            toReturn[5] = verbBody + "iu";
            toReturn[6] = verbBody + "imos";
            toReturn[7] = verbBody + "iram";

            //Imperfect Past
            toReturn[8] = verbBody + "ia";
            toReturn[9] = verbBody + "ia";
            toReturn[10] = verbBody + "íamos";
            toReturn[11] = verbBody + "iam";

            //Conditional
            toReturn[12] = verbBody + "iria";
            toReturn[13] = verbBody + "iria";
            toReturn[14] = verbBody + "iríamos";
            toReturn[15] = verbBody + "iriam";

            //Future Subjunctive
            toReturn[16] = verbBody + "ir";
            toReturn[17] = verbBody + "ir";
            toReturn[18] = verbBody + "irmos";
            toReturn[19] = verbBody + "irem";

            //Present Participle
            toReturn[20] = verbBody + "indo";
            toReturn[21] = verbBody + "indo";
            toReturn[22] = verbBody + "indo";
            toReturn[23] = verbBody + "indo";

            //Imperitive
            toReturn[24] = verbBody + "a";
            toReturn[25] = verbBody + "am";

            //Future Subjunctive
            toReturn[26] = verbBody + "irei";
            toReturn[27] = verbBody + "irá";
            toReturn[28] = verbBody + "iremos";
            toReturn[29] = verbBody + "irão";

        }




        return toReturn;
    }
}
