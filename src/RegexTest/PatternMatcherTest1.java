package RegexTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest1 {
    public static void main(String[] args) {
        String regex = "ab";
        String text = "babababbbbbabaabaaaabbabbabababba";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        System.out.println("Text: " + text);
        System.out.println("Indices: 0123456789");
        System.out.println("Regex" + regex);
        System.out.println("Found positions");
        while (matcher.find()) {
            System.out.print(matcher.start()+" ");
        }
        }
    }

