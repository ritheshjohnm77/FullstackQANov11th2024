package org.example.LoopingStatements.DoWhileLoop;

public class DoWhileFifteenthTableFromRev
{
    public static void main(String[] args)
    {
         int z=0;
         int x=15;
         int i=10;
         do
         {
             z=x*i;
             System.out.println(x+"*"+i+"="+z);
             i--;
         }
         while(i>=1);
    }
}
