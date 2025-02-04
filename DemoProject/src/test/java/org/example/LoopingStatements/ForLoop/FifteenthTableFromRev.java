package org.example.LoopingStatements.ForLoop;

public class FifteenthTableFromRev
{
    public static void main(String[] args)
    {
        int z=0;
        int x=15;
        for(int i=10;i>=1;i--)
        {
            z=x*i;
            System.out.println(x+"*"+i+"="+z);
        }
    }
}
