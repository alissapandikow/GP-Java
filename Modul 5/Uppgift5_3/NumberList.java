/*
    Uppgift5_3
    
    
    Alissa Pandikow, 23alpa03@hig.se
    2023-11-06
*/

public class NumberList
{
    public static void main (String[] args)
    {
    int[] numbers = new int[args.length];

    //Konverterar argument(en) till heltal och lagrar dem i arrayen "numbers"
      for (int i = 0; i < args.lenth; i++) {
        numbers[i] = Integer.parseInt(args[i]);

    //Skriver ut den osorterade listan
    System.out.print("Original: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ' ');
    System.out.println();
            
    //Sorterar listan i sorterad ordning och skriver ut den
    java.util.Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ' ');
        }
    System.out.println();

    //Hittar minsta och största värdet i arrayen
    int min = numbers[0];
    int max = numbers[numbers.length - 1];
    System.out.println("Min: " + min);
    System.out.println("Max: " + max);

    //Beräknar genomsnittet
    int sum = 0;
    for (int i = 0; i < numbers.length; i++) {
        sum += numbers[i];
    }
    double average = (double) sum / numbers.length;
    System.out.println("Avg: " + average);

        }
      }
    }
    
}
