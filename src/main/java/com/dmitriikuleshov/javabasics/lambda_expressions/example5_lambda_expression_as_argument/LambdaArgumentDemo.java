package com.dmitriikuleshov.javabasics.lambda_expressions.example5_lambda_expression_as_argument;

interface StringFunc {
    String func(String str);
}

public class LambdaArgumentDemo {
    static String changeStr(StringFunc fs, String s) {
        return fs.func(s);
    }

    static void main() {
        String inStr = "Lambda Expressions Expand Java";
        String outStr;

        System.out.println("Here is input string: " + inStr);

        StringFunc reverse = (str) -> {
            StringBuilder result = new StringBuilder();

            for(int i = str.length()-1; i >= 0; i--)
                result.append(str.charAt(i));

            return result.toString();
        };

        outStr = changeStr(reverse, inStr);
        System.out.println("The string reversed: " + outStr);

        outStr = changeStr((str) -> str.replace(' ', '-'), inStr);
        System.out.println("The string with spaces replaced: " + outStr);


        outStr = changeStr((str) -> {
            StringBuilder result = new StringBuilder();
            char ch;
            for(int i = 0; i < str.length(); i++ ) {
                ch = str.charAt(i);
                if(Character.isUpperCase(ch))
                    result.append(Character.toLowerCase(ch));
                else
                    result.append(Character.toUpperCase(ch));
            }
            return result.toString();
        }, inStr);
        System.out.println("The string in reversed case: " + outStr);

    }
}
