package javaapplication1;
import java.util.*;
public class ContainerOfBalls {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int q=s.nextInt(),k=0;
        while(k<q)
        {
        int n=s.nextInt(),i,j,c=0;
        int a[][]=new int[n][n];
        for(i=0;i<n;i++)
            for(j=0;j<n;j++)
                a[i][j]=s.nextInt();
        if(n==1)
            System.out.println("Possible");
        else
        {
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(a[i][j]==a[j][i])
                    continue;
                else
                    c++;
            }
        }
        if(c==0)
            System.out.println("Possible");
        else
            System.out.println("Impossible");
        }
        k++;
        }
    }
}
