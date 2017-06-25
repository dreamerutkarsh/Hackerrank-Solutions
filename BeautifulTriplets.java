package javaapplication1;
import java.util.*;
public class BeautifulTriplets {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),i,j,k,count=0;
        int d=s.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
            a[i]=s.nextInt();
        for(i=0;i<n-1;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(a[j]-a[i]==d)
                {
                    for(k=j+1;k<n;k++)
                        if(a[k]-a[j]==d)
                            count++;
                }
            }
        }
        System.out.println(count);
    }
}
