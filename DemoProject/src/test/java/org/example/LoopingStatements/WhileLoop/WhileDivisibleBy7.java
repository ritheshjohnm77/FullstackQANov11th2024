package org.example.LoopingStatements.WhileLoop;

public class WhileDivisibleBy7
{
    public static void main(String[] args)
    {
        int i=0;
        while(i<=100)
        {
            if(i%7==0)
            System.out.print(i+" ");
            i++;
        }
    }
}
