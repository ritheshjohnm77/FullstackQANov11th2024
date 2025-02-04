package org.example.LoopingStatements.DoWhileLoop;

public class DoWhileDivisibleBy11from200to100
{
    public static void main(String[] args)
    {
        int i=200;
        do
        {
            if (i % 11 == 0)
            System.out.print(i + " ");
            i--;
        }
        while(i>=100);
    }
}
