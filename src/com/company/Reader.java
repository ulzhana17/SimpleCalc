package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reader {
        final static String ARAB_PATTERN = "(\\b\\d\\b|10)(\\+|-|\\*|\\/)(\\b\\d\\b|10)";
        final static String ROMAN_PATTERN = "\\b(I{1,3}|IV|VI{0,3}|IX|X)\\b(\\+|-|\\*|\\/)\\b(I{1,3}|IV|VI{0,3}|IX|X)\\b";

    public static double Check(String input) throws Exception
    {
        boolean isArabic = input.matches(ARAB_PATTERN);
        boolean isRoman = input.matches(ROMAN_PATTERN);

        if (!isArabic && !isRoman)
            throw new Exception("Wrong input string!");

        return GetResult(input, isArabic);

    }

    private static double GetResult(String input, boolean isArabic) throws Exception
    {
        String regex = isArabic ? ARAB_PATTERN : ROMAN_PATTERN;

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        int x,y;
        String a,b,operation;
        if(matcher.find()){
            a = matcher.group(1);
            operation = matcher.group(2);
            b = matcher.group(3);
        }
        else
            throw  new Exception("No match found!");

        if (isArabic)
        {
            x = Integer.parseInt(a);
            y = Integer.parseInt(b);
            if (x > 10 || y > 10)
                throw new Exception("Числа должны быть от 1 до 10 вкл");
        }
        else
        {
            x = RomanNums.GetIntFromStr(a);
            y = RomanNums.GetIntFromStr(b);
        }

        Operation op = GetOperation(operation);

        return op.action(x,y);
    }

    private static Operation GetOperation(String op) throws Exception
    {
        Operation operation;
        switch(op){
            case "+":
                operation = Operation.SUM;
                break;
            case "-":
                operation = Operation.SUBTRACT;
                break;
            case "*":
                operation = Operation.MULTIPLY;
                break;
            case "/":
                operation = Operation.DIVISION;
                break;
            default:
                throw  new Exception("не является операцией сложения, вычитания, умножения или деления");
        }

        return operation;
    }
}
