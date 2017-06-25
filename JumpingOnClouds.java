package javaapplication1;
import java.util.*;
public class JumpingOnClouds {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),i,jump=0;
        int c[]=new int[n];
        for(i=0;i<n;i++)
            c[i]=s.nextInt();
        i=0;
        if(n==2)
            System.out.println("1");
        else
        {
            while(i!=n-1)
                {
                    if(i+2<n&&c[i+2]==0)
                    {
                        jump++;
                        i=i+2;
                    }
                    else
                    {
                        jump++;
                        i=i+1;
                    }
                }
            System.out.println(jump);
        }
    }
}