package RegexTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest2 {
    public static void main(String[] args) {

        String regex = "\\D";
        // \\d -> All the digits
        // \\D -> !All the digits
        // \\s -> empty spaces
        // \\S -> All characters, deleting the empty spaces
        // range -> using the keys [] putting the characters [a-zA-C] a to z, and A to C
        String text = "babababbbbbabaabaaaabbabbabababba";
        String text2 = "12 0x 0X 0xFFABC 0x109 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text2);
        System.out.println("Text: " + text2);
        System.out.println("Indices: 0123456789");
        System.out.println("Regex" + regex);
        System.out.println("Found positions");
        while (matcher.find()) {
            System.out.print(matcher.start()+" " + matcher.group()+"\n ");
        }
        // return hexadecimal numbers:
        int hex = 0xFFFFFFF;
        System.out.println(hex);
        }
    }

