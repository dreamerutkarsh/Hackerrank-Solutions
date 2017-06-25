package javaapplication1;
import java.util.*;
public class EqualizeArray {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),i,deletions=0,max,index;
        int a[]=new int[n];
        for(i=0;i<n;i++)
            a[i]=s.nextInt();
        int count[]=new int[100];
        for(i=0;i<100;i++)
            count[i]=0;
        for(i=0;i<n;i++)
        {
            count[a[i]-1]++;
        }
        max=count[0];
        index=0;
        for(i=0;i<100;i++)
        {
            if(max<count[i])
            {
                max=count[i];
                index=i;
            }
        }
        for(i=0;i<100;i++)
        {
            if(i==index)
                continue;
            deletions=deletions+count[i];
        }
        System.out.println(deletions);
    }
}