import java.util.Scanner;

public class Problem_2 {
    public static void main(String[] args)
    {
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        for(int i = 1; i<=num+(num-1); i+=2)
        {
            System.out.print((i));
            if(i<num+(num-1))
            {
            System.out.print(",");
            }
            
        }

    }


}
