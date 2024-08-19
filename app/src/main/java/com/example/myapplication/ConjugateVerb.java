package com.example.myapplication;

public class ConjugateVerb {

    private Ending _verbEnding;
    private String _verbBody;

    public ConjugateVerb(String verb) {

        _verbEnding = Ending.getEnumFromEnding(verb.substring(verb.length() - 2));
        _verbBody = verb.substring(0, verb.length() - 2);
    }

    //Present
    public Tense conjugatePresent() {
        switch(_verbEnding)
        {
            case AR:
                return new Tense(_verbBody + "o", _verbBody + "a", _verbBody + "amos", _verbBody + "am");
            case ER:
                return new Tense(_verbBody + "o", _verbBody + "e", _verbBody + "emos", _verbBody + "em");
            case IR:
                String presentEu;
                if (String.valueOf(_verbBody.charAt(1)).matches("(?i)o")) {
                    StringBuilder newVerbBody = new StringBuilder(_verbBody);
                    newVerbBody.setCharAt(1, 'u');
                    presentEu = newVerbBody + "o";
                } else {
                    presentEu = _verbBody + "o";
                }
                return new Tense(presentEu, _verbBody + "e", _verbBody + "imos", _verbBody + "em");
            default:
                throw new IllegalStateException("Unexpected value: " + _verbEnding);
        }
    }

    // Perfect Past
    public Tense conjugatePerfectPast() {
        switch (_verbEnding)
        {
            case AR:
                String pastEu;
                if (String.valueOf(_verbBody.charAt(_verbBody.length() - 1)).matches("g")) {
                    pastEu = _verbBody + "uei";
                } else if (String.valueOf(_verbBody.charAt(_verbBody.length() - 1)).matches("c")) {
                    pastEu = _verbBody.substring(0, _verbBody.length() - 1) + "quei";
                } else {
                    pastEu = _verbBody + "ei";
                }
                return new Tense(pastEu, _verbBody + "ou", _verbBody + "amos", _verbBody + "aram");
            case ER:
                return new Tense(_verbBody + "i", _verbBody + "eu", _verbBody + "emos", _verbBody + "eram");
            case IR:
                return new Tense(_verbBody + "i", _verbBody + "iu", _verbBody + "imos", _verbBody + "iram");
            default:
                throw new IllegalStateException("Unexpected value: " + _verbEnding);

        }
    }

    // Imperfect Past
    public Tense conjugateImperfectPast()
    {
        switch (_verbEnding)
        {
            case AR:
                return new Tense(_verbBody + "ava", _verbBody + "ava", _verbBody + "ávamos", _verbBody + "avam");
            case ER:
                return new Tense(_verbBody + "ia", _verbBody + "ia", _verbBody + "íamos", _verbBody + "iam");
            case IR:
                return new Tense(_verbBody + "ia", _verbBody + "ia", _verbBody + "íamos", _verbBody + "iam");
            default:
                throw new IllegalStateException("Unexpected value: " + _verbEnding);
        }
    }

    // Conditional
    public Tense conjugateConditional()
    {
        switch (_verbEnding)
        {
            case AR:
                return new Tense(_verbBody + "aria", _verbBody + "aria", _verbBody + "aríamos", _verbBody + "ariam");
            case ER:
                return new Tense(_verbBody + "eria", _verbBody + "eria", _verbBody + "eríamos", _verbBody + "eriam");
            case IR:
                return new Tense(_verbBody + "iria", _verbBody + "iria", _verbBody + "iríamos", _verbBody + "iriam");
            default:
                throw new IllegalStateException("Unexpected value: " + _verbEnding);
        }
    }

    // Simple Future
    public Tense conjugateSimpleFuture()
    {
        switch (_verbEnding)
        {
            case AR:
                return new Tense(_verbBody + "ar", _verbBody + "ar", _verbBody + "armos", _verbBody + "arem");
            case ER:
                return new Tense(_verbBody + "er", _verbBody + "er", _verbBody + "ermos", _verbBody + "erem");
            case IR:
                return new Tense(_verbBody + "ir", _verbBody + "ir", _verbBody + "irmos", _verbBody + "irem");
            default:
                throw new IllegalStateException("Unexpected value: " + _verbEnding);
        }
    }

    // Present Participle/Gerund
    public Tense conjugatePresentParticiple()
    {
        switch (_verbEnding)
        {
            case AR:
                return new Tense(_verbBody + "ando", _verbBody + "ando", _verbBody + "ando", _verbBody + "ando");
            case ER:
                return new Tense(_verbBody + "endo", _verbBody + "endo", _verbBody + "endo", _verbBody + "endo");
            case IR:
                return new Tense(_verbBody + "indo", _verbBody + "indo", _verbBody + "indo", _verbBody + "indo");
            default:
                throw new IllegalStateException("Unexpected value: " + _verbEnding);
        }
    }

    // Imperative
    public Tense conjugateImperative()
    {
        switch (_verbEnding)
        {
            case AR:
                return new Tense(null, _verbBody + "e", _verbBody + "emos", _verbBody + "em");
            case ER:
                return new Tense(null, _verbBody + "a", _verbBody + "amos", _verbBody + "am");
            case IR:
                return new Tense(null, _verbBody + "a", _verbBody + "amos", _verbBody + "am");
            default:
                throw new IllegalStateException("Unexpected value: " + _verbEnding);
        }
    }

    // Future subjunctive
    public Tense conjugateFutureSubjunctive()
    {
        switch (_verbEnding)
        {
            case AR:
                return new Tense(_verbBody + "arei", _verbBody + "ará", _verbBody + "aremos", _verbBody + "arão");
            case ER:
                return new Tense(_verbBody + "erei", _verbBody + "erá", _verbBody + "eremos", _verbBody + "erão");
            case IR:
                return new Tense(_verbBody + "irei", _verbBody + "irá", _verbBody + "iremos", _verbBody + "irão");
            default:
                throw new IllegalStateException("Unexpected value: " + _verbEnding);
        }
    }
}
