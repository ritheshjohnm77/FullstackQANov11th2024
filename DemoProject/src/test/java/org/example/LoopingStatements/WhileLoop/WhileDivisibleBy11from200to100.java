package org.example.LoopingStatements.WhileLoop;

public class WhileDivisibleBy11from200to100
{
    public static void main(String[] args)
    {
        int i=200;
        while(i>=100)
        {
            if (i % 11 == 0)
                System.out.print(i + " ");
            i--;
        }
    }
}
