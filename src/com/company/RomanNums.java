package com.company;

public class RomanNums {

    public static int GetIntFromStr(String num) throws Exception
    {
        int result;
        switch (num) {
            case "I": result = 1;
                break;
            case "II": result = 2;
                break;
            case "III": result = 3;
                break;
            case "IV": result = 4;
                break;
            case "V": result = 5;
                break;
            case "VI": result = 6;
                break;
            case "VII": result = 7;
                break;
            case "VIII": result = 8;
                break;
            case "IX": result = 9;
                break;
            case "X": result = 10;
                break;
            default:
                throw  new Exception("не является римским цифром от I до X");
        }

        return result;
    }
}
