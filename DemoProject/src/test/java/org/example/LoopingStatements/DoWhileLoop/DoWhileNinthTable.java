package org.example.LoopingStatements.DoWhileLoop;

public class DoWhileNinthTable
{
    public static void main(String[] args)
    {
        int z=0;
        int x=9;
        int i=1;
        do
        {
            z=x*i;
            System.out.println(x+"*"+i+"="+z);
            i++;
        }
        while(i<=10);
    }
}
