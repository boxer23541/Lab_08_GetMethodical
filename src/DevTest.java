import java.util.Scanner;

public class DevTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int value = 0;

        value = SafeInput.getRangedInt(in, "Enter a number [5-12]: ", 5, 12);
        System.out.println("Your number is " + value);
    }
}

