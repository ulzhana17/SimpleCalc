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

    public static String GetStrFromInt(int num) throws Exception
    {
        String s = "";
        if(num >= 10){
            int d = num/10;
            switch (d) {
                case 1: s += "X";
                    break;
                case 2: s += "XX";
                    break;
                case 3: s += "XXX";
                    break;
                case 4: s += "XL";
                    break;
                case 5: s += "L";
                    break;
                case 6: s += "LX";
                    break;
                case 7: s += "LXX";
                    break;
                case 8: s += "LXXX";
                    break;
                case 9: s += "XC";
                    break;
                case 10: s += "C";
                    break;
                default:
                    throw  new Exception("если на входе оба числа 1-10, теоретически не должно выйти число больше 100");
            }
            num = num - d*10;
        }

        if(num < 10){
            switch (num) {
                case 0:
                    break;
                case 1: s += "I";
                    break;
                case 2: s += "II";
                    break;
                case 3: s += "III";
                    break;
                case 4: s += "IV";
                    break;
                case 5: s += "V";
                    break;
                case 6: s += "VI";
                    break;
                case 7: s += "VII";
                    break;
                case 8: s += "VIII";
                    break;
                case 9: s += "IX";
                    break;
                default:
                    throw  new Exception("ошибка конвертации в roman");
            }
        }
        return  s;
    }
}
