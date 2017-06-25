package javaapplication1;
import java.util.*;
public class BreadLoaves {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),i,count=0,c=0;
        int a[]=new int[n];
        for(i=0;i<n;i++)
            a[i]=s.nextInt();
        for(i=0;i<n-1;i++)
        {
            if(a[i]%2!=0)
            {
                a[i]++;
                a[i+1]++;
                count+=2;
            }
        }
        for(i=0;i<n;i++)
        {
            if(a[i]%2!=0)
            {
                c=1;
                break;
            }
        }
        if(c==1)
            System.out.println("NO");
        else
            System.out.println(count);
    }
}