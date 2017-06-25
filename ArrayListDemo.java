/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.*;
public class ArrayListDemo {
    public static void main(String args[])
    {
        ArrayList a1=new ArrayList();
        for(int i=0;i<10;i++)
            a1.add(i);
        Object arr[]=a1.toArray();
        int sum=0;
        for(int i=0;i<10;i++)
        {
            sum=sum+(Integer)arr[i];
        }
        System.out.println("Sum = "+sum);
    }
}
