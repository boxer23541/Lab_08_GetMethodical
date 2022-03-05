import java.util.Scanner;

public class Reggie
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String SSN;

        SSN = SafeInput.getRegExString(in, "Enter SSN: ", "\\d{3}-\\d{2}-\\d{4}");

        System.out.println("Your SSN is " + SSN);
    }
}
