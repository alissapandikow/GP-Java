/*
    Uppgift5_4
    
    
    Alissa Pandikow, 23alpa03@hig.se
    2023-11-06
*/

public class Problem61 {
    public static void printStringArray(String[] values) {
        for (int i = 0; i < values.length; i++) {
            int position = i + 1;
            String argument = values[i];
            System.out.println(position + ": " + argument);
        }
    }

    public static void main(String[] args) {
        printStringArray(args);
    }
}
