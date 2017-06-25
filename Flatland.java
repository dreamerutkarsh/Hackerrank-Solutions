package javaapplication1;
import java.util.*;
public class Flatland {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),i,j,min=0,c;
        int m=s.nextInt();
        int a[]=new int[m];
        int d[]=new int[n];
        for(i=0;i<m;i++)
            a[i]=s.nextInt();
        for(i=0;i<n;i++)
        {
            min=Math.abs(i-a[0]);
            for(j=1;j<m;j++)
            {
                c=Math.abs(i-a[j]);
                if(c<min)
                    min=c;
            }
            d[i]=min;
        }
        min=d[0];
        for(i=1;i<n;i++)
        {
            if(min<d[i])
                min=d[i];
        }
        System.out.println(min);
    }
}