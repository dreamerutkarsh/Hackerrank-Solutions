package javaapplication1;
import java.util.*;
public class Encryption {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String a=s.next();
        int rows,columns,i,j,k;
        if(Math.sqrt(a.length())-(int)Math.sqrt(a.length())==0)
            rows=columns=(int)Math.sqrt(a.length());
        else
        {
            rows=(int)Math.sqrt(a.length());
            columns=(int)Math.sqrt(a.length())+1;
        }
        if((rows*columns)<a.length())
            rows=rows+1;
        for(i=0;i<columns;i++)
        {
            String b=String.valueOf(a.charAt(i));
            k=i;
            for(j=1;j<rows;j++)
            {
                k=k+columns;
                if(k<a.length())
                    b=b+String.valueOf(a.charAt(k));
            }
            System.out.print(b+" ");
        }
    }
}