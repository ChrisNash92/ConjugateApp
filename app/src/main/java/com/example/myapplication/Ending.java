package com.example.myapplication;

public enum  Ending
{
    AR,
    ER,
    IR;

    public static Ending getEnumFromEnding(String verbEnding)
    {
        switch (verbEnding)
        {
            case("ar"):
                return Ending.AR;
            case ("er"):
                return Ending.ER;
            case ("ir"):
                return Ending.IR;
            default:
                throw new IllegalStateException("Unexpected value: " + verbEnding);
        }
    }
}
