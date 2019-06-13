package Lesson_4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckPass {

    public static void main(String[] args) {
        String string = "1wQ1@23456";
        Pattern numOfChar = Pattern.compile(".{8,}");
        Matcher mnumOfChar = numOfChar.matcher(string);
        Pattern smallLetter = Pattern.compile(".*[a-z]+.*");
        Matcher msmallLetter = smallLetter.matcher(string);
        Pattern bigLetter = Pattern.compile(".*[A-Z]+.*");
        Matcher mbigLetter = bigLetter.matcher(string);
        Pattern isNum = Pattern.compile(".*[0-9]+.*");
        Matcher misNum = isNum.matcher(string);
        Pattern spSymbol = Pattern.compile(".*[!@#$%^&*]+.*");
        Matcher mspSymbol = spSymbol.matcher(string);
        Pattern all = Pattern.compile("(.*[!@#$%^&*]+.*)(.*[a-z]+.*)(.*[A-Z]+.*)(.*[0-9]+.*).{8,}");
        Matcher mall = all.matcher(string);
        System.out.println(
                "Праверка пароля "+string+
                ":\n> 8 символов - "+mnumOfChar.matches()+
                "\nмаленькая буква - "+msmallLetter.matches()+
                "\nбольшая буква - "+mbigLetter.matches()+
                "\nесть цифра - "+misNum.matches()+
                "\nспецсимвол - "+mspSymbol.matches()+
                "\nИтого - "+mall.matches()
        );
    }
}
