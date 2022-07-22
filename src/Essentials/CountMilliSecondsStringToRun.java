package Essentials;

public class CountMilliSecondsStringToRun {
    public static void main(String[] args) {

        //String Performance...
        long start = System.currentTimeMillis();
        concatString(30_000);
        long end = System.currentTimeMillis();
        System.out.println("Time Spent to String: "+(end - start)+"ms");
        // More Fast...
        start = System.currentTimeMillis();
        concatStringBuilder(30_000);
        end = System.currentTimeMillis();
        System.out.println("Time Spent to StringBuilder: "+(end - start)+"ms");
        // using in multi threads
        start = System.currentTimeMillis();
        concatStringBuffer(30_000);
        end = System.currentTimeMillis();
        System.out.println("Time Spent to StringBuilder: "+(end - start)+"ms");
    }

    private static void concatString(int size) {
        String text = "";

        for (int i = 0; i < size; i++){
        text += i;
    }
}
    private static void concatStringBuilder(int size) {
        StringBuilder sb = new StringBuilder(size);

        for (int i = 0; i < size; i++){
            sb.append(i);
        }
    }

    private static void concatStringBuffer(int size) {
        StringBuffer sb = new StringBuffer(size);

        for (int i = 0; i < size; i++){
            sb.append(i);
        }
    }
}
