/*
    Uppgift5_3
    
    
    Alissa Pandikow, 23alpa03@hig.se
    2023-11-06
*/

public class NumberList {
    public static void main(String[] args) {
        int[] numbers = new int[args.length];

        // Konvertera argument(en) till heltal och lagra dem i arrayen "numbers"
        for (int i = 0; i < args.length; i++) {
            numbers[i] = Integer.parseInt(args[i]);
        }

        // Skriv ut den osorterade listan
        System.out.print("Original: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // Sortera listan i sorterad ordning och skriv ut den
        java.util.Arrays.sort(numbers);
        System.out.print("Sorted: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // Hitta minsta och största värdet i arrayen
        int min = numbers[0];
        int max = numbers[numbers.length - 1];
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);

        // Beräkna genomsnittet
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        double average = (double) sum / numbers.length;
        System.out.println("Avg: " + average);
    }
}
