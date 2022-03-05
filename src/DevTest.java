import java.util.Scanner;

public class DevTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        boolean YesNo = false;
        YesNo = SafeInput.getYNConfirm(in, "Enter Yes or No [Y/N]: ");

        System.out.println(YesNo);
    }
}

