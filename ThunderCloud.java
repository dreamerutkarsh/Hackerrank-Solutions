package javaapplication1;
import java.util.*;
public class ThunderCloud {
    public static  void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),i,E=100;
        int k=s.nextInt();
        int c[]=new int[n];
        for(i=0;i<n;i++)
            c[i]=s.nextInt();
        i=k;
        while(i<n)
        {
            if(c[i]==1)
                E=E-3;
            else
                E=E-1;
            i=i+k;
        }
        if(c[0]==1)
            E=E-3;
        else
            E=E-1;
        System.out.println(E);
    }
}
