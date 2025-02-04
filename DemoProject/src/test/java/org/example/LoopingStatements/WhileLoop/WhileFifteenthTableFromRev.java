package org.example.LoopingStatements.WhileLoop;

public class WhileFifteenthTableFromRev
{
    public static void main(String[] args)
    {
        int z=0;
        int x=15;
        int i=10;
        while(i>=1)
        {
            z=x*i;
            System.out.println(x+"*"+i+"="+z);
            i--;
        }
    }
}
