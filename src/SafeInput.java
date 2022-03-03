import java.util.Scanner;

public class SafeInput
{
    /**
     * Gets a response from user
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return a String response that is not zero length
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString = "";  // Set this to zero length. Loop runs until it isn’t
        do
        {
            System.out.println("\n" + prompt + ": "); // show prompt add space
            retString = pipe.nextLine();
        }while(retString.length() == 0);

        return retString;

    }

    /**
     * Gets an integer from user
     * @param pipe
     * @param prompt
     * @return
     */
    public static int getInt(Scanner pipe, String prompt)
    {
        int retInteger = 0;
        boolean validInt = false;
        String trash = "";
        do
        {
            System.out.print("\n" + prompt);

            if(pipe.hasNextInt())
            {
                retInteger = pipe.nextInt();
                pipe.nextLine();
                validInt = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("Enter a valid integer, not \"" + trash + "\"");
            }


        }while(!validInt);

        return retInteger;
    }

    /**
     * gets a double from user
     * @param pipe
     * @param prompt
     * @return
     */
    public static double getDouble(Scanner pipe, String prompt)
    {
        double retDouble = 0;
        boolean validDouble = false;
        String trash = "";
        do
        {
            System.out.print("\n" + prompt);

            if(pipe.hasNextDouble())
            {
                retDouble = pipe.nextDouble();
                pipe.nextLine();
                validDouble = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("Enter a valid double, not \"" + trash + "\"");
            }


        }while(!validDouble);

        return retDouble;
    }

    /**
     * gets a ranged integer from user
     * @param pipe
     * @param prompt
     * @param low
     * @param high
     * @return
     */
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        int retInt = 0;
        boolean validInt = false;
        String trash = "";

        do
        {
            System.out.print("\n" + prompt);

            if (pipe.hasNextInt())
            {
                retInt = pipe.nextInt();
                if (retInt >= low && retInt <= high)
                {
                    validInt = true;
                }
                else
                {
                    System.out.println("You entered \"" + retInt + "\"");
                    System.out.println("Enter a valid integer [" + low + "-" + high + "]");
                }
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("Enter a valid integer not \"" + trash + "\"");
            }
        }while(!validInt);

        return retInt;
    }
}
