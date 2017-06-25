package javaapplication1;
import java.util.*;
public class SequenceEquation {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),i,j,k;
        int p_x[]=new int[n+1];
        p_x[0]=0;
        for(i=1;i<n+1;i++)
            p_x[i]=s.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<n+1;j++)
            {
                if(i==p_x[j])
                {
                    for(k=1;k<n+1;k++)
                        if(j==p_x[k])
                            System.out.println(k);
                }
            }
        }
    }
}
