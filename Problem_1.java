import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class Problem_1 {
    public static void main(String[] args)
    {
        double a;
        double b;
        String ope;

        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        b = sc.nextDouble();
        sc.nextLine(); 
        ope = sc.nextLine();
        

        if(ope.equals("+") )
        {
            System.out.println("The sum of two number is "+(a+b));
        }
        else if(ope.equals("-"))
        {
            System.out.println("The substraction of two number is "+(a-b));
        }
        else if(ope.equals("*"))
        {
            System.out.println("The Multiply of two number is "+(a*b));
        }
        else if(b>0)
        {
            System.out.println("The divission of two number is "+(a/b));
            
        }
        else
        {
            System.out.println("b Should be greater than zero");
        }
    }
}
