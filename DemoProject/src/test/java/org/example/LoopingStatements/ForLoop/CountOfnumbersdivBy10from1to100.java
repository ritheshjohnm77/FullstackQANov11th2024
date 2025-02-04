package org.example.LoopingStatements.ForLoop;

public class CountOfnumbersdivBy10from1to100
{
    public static void main(String[] args)
    {
        int count=0;
        System.out.println("The numbers which are div by10 from 1 to 100 are:");
        for(int i=0;i<=100;i++)
        {
            if(i%10==0)
            {
                count=count+1;
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println("The count of numbers which are div by 1 to 100 is:"+count);
    }
}
