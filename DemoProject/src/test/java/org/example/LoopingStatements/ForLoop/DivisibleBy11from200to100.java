package org.example.LoopingStatements.ForLoop;

public class DivisibleBy11from200to100
{
    public static void main(String[] args)
    {
        for(int i=200;i>=100;i--)
        {
            if(i%11==0)
            {
                System.out.println(i+" ");
            }
        }
    }
}
