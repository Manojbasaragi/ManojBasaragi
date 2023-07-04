import java.util.Scanner;

public class Problem_4 {
    public static void main(String[] args)
    {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value");
        int n = sc.nextInt();
        int[] a = new int[n];
        int i, count=0;

        for( i=0; i<n; i++)
        {
           a[i] = sc.nextInt();
        }

        for( i=1; i<=9; i++)
        {
            count=0;
            for(int j=0;j<a.length; j++ )
            {
                if(a[j]>=i)
                {
                    if((a[j]%i)==0){
                       count++;
                    }
                }
            }
            System.out.println(i+" : "+count);
        }
        
    }
}
