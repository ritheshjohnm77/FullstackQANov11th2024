package org.example.LoopingStatements.DoWhileLoop;

public class DoWhileOddNumsFrom91to61
{
    public static void main(String[] args)
    {
        int i=91;
        do
        {
            if(i%2!=0)
                System.out.println(i);
            i--;
        }
        while(i>=61);
    }
}
