package diferent.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        String stringPattern = "[a-z]+";
        String text = "code 2 learn java tutorial";
        Pattern pattern = Pattern.compile(stringPattern);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            System.out.println(text.substring(matcher.start(),matcher.end()));
            System.out.println(matcher.group());
            System.out.println(matcher.matches());//true or false. The matches method attempts to match the entire input sequence against the pattern.
            System.out.println(matcher.lookingAt());// true or false. The lookingAt method attempts to match the input sequence, starting at the beginning, against the pattern.
        }
    }
}