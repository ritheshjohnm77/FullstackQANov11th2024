package org.example.LoopingStatements.DoWhileLoop;

public class DoWhileDivisibleBy7
{
    public static void main(String[] args)
    {
        int i=0;
        do
        {
            if(i%7==0)
            System.out.print(i+" ");
            i++;
        }
        while(i<=100);
    }
}
