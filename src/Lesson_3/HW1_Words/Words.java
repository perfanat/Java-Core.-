package Lesson_3.HW1_Words;

import java.util.Arrays;
import java.util.HashSet;

public class Words {
    public static void main(String[] args) {
        String [] strings = {
                "диван",
                "стол",
                "стул",
                "диван",
                "кресло",
                "кресло",
                "диван",
                "стул",
                "диван",
                "стул"
        };
        HashSet<String> hashStrings = new HashSet<>(Arrays.asList(strings));
        System.out.println(hashStrings);
        for (String s:hashStrings
             ) {
            int sum = 0;
            for (String string : strings) {
                if (s.equals(string)) sum++;
            }
            System.out.println(s+" - "+sum);
        }
    }
}
