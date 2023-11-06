/*
    Uppgift5_4
    
    
    Alissa Pandikow, 23alpa03@hig.se
    2023-11-06
*/

import java.util.Arrays;

public class DiceSim {
    public static void main(String[] args) {
        int rolls = Integer.parseInt(args[0]);
        int[] diceResults = new int[rolls];
        int[] histogram = new int[6];
        int median;

        for (int i = 0; i < rolls; i++) {
            int oneRoll = (int) (Math.random() * 6) + 1;
            diceResults[i] = oneRoll;
            histogram[oneRoll - 1]++;
        }

        // Bestäm genomsnittet av alla tärningskast
        int sum = 0;
        for (int i = 0; i < rolls; i++) {
            sum += diceResults[i];
        }
        double avg = (double) sum / rolls;
        System.out.println("Average: " + avg)


        // Bestäm medianen av alla resultat
        Arrays.sort(diceResults);
        if (rolls % 2 == 0) {
            int lowerMidIndex = rolls / 2 - 1;
            int higherMidIndex = rolls / 2;
            median = (diceResults[lowerMidIndex] + diceResults[higherMidIndex]) / 2;
        } else {
            int medianIndex = rolls / 2;
            median = diceResults[medianIndex];
        }
        System.out.println("Median: " + median)

        //Skriver ut histogrammet
        System.out.println("Histogram:");
        for (int i = 0; i < 6; i++) {
            System.out.printf("%-6d", (i + 1));
        }
        System.out.println();

        int[] sums = new int[6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < histogram[i]; j++) {
                sums[i] += (i + 1);
            }
            System.out.printf("%-6d", sums[i]);
        }
        System.out.println();
    }
}
