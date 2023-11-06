/*
    Uppgift5_1
    
    
    Alissa Pandikow, 23alpa03@hig.se
    2023-11-06
*/

public class ArgumentList
{
    public static void main (String[] args)
    {
        for (int i = 0; i < args.length; i++) {
            int position = i + 1;
            String argument = args[i];
            System.out.println(position + ": " + argument);
        }
    }
}
