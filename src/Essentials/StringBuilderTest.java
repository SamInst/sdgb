package Essentials;

public class StringBuilderTest {
    public static void main(String[] args) {
        String name = "sam ";
        name.concat(" helson");
        name.substring(0, 3);
        System.out.println(name);
        StringBuilder sb = new StringBuilder("abc");
        sb.append("defghijklmnopqrstuvwxyz");
        sb.reverse();
        sb.delete(0,3);
        System.out.println(sb);

    }
}
