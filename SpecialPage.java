package javaapplication1;
import java.util.*;
public class SpecialPage {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),i,j,p,c=0;
        int k=s.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
            a[i]=s.nextInt();
        /*int total_pages=0;
        for(i=0;i<n;i++)
        {
            if(a[i]%k==0)
            {
                total_pages+=(a[i]/k);
                continue;
            }
            if(a[i]<k)
                total_pages+=1;
            if(a[i]>k)
                total_pages+=((a[i]/k)+1);
        }*/
        i=1;
        for(p=0;p<n;p++)
            {
                for(j=0;j<a[p];j++)
                    {
                        if((j+1)==i)
                            c++;
                        if((j+1)%k==0)
                            i++;
                    }
                if(j%k!=0)
                    i=i+1;
                //System.out.println("i: "+i+" c:"+c);
            }
        System.out.println(c);
    }
}