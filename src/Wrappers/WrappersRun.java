package Wrappers;

public class WrappersRun {
    public static void main(String[] args) {
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 100;
        char charP = 'W';
        boolean booleanP = false;

        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1;
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 100D;
        Character charW = 'W';
        Boolean booleanW = false;
        // Ctrl + F -> abre o campo de pesquisa
        // Ctrl + R -> sobrescreve o objeto

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.toLowerCase('A'));
        System.out.println(Character.toUpperCase('a'));

        String name = "sam ";
        name = name.concat("Helson");
        System.out.println(name);
    }



}
