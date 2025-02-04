package org.example.LoopingStatements.WhileLoop;

public class WhileOddNumsFrom91to61
{
    public static void main(String[] args)
    {
        int i=91;
        while(i>=61)
        {
            if(i%2!=0)
                System.out.println(i);
            i--;
        }
    }
}
