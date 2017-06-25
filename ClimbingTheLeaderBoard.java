package javaapplication1;
import java.util.*;
public class ClimbingTheLeaderBoard {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),i,j,a=1,k=0;
        int score[]=new int[n];
        int rank[]=new int[n];
        for(i=0;i<n;i++)
            score[i]=s.nextInt();
        int m=s.nextInt();
        int alice[]=new int[m],alice_rank=0;
        for(i=0;i<m;i++)
            alice[i]=s.nextInt();
        rank[0]=a;
        //check=score[0];
        for(i=1;i<n;i++)
        {
            if(score[i]==score[i-1])
                rank[i]=a;
            else
                rank[i]=++a;
        }
        for(i=0;i<m;i++)
        {
            for(j=n-1;j>=0;j--)
            {
                if(score[j]>alice[i])
                {
                    alice_rank=rank[j]+1;
                    break;
                }
                if(score[j]==alice[i])
                {
                    alice_rank=rank[j];
                    break;
                }
                if(score[j]<alice[i])
                {
                    alice_rank=rank[j];
                    continue;
                }
            }
            System.out.println(alice_rank);
        }
    }
}
