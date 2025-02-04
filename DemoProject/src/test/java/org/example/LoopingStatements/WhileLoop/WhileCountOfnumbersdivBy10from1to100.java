package org.example.LoopingStatements.WhileLoop;

public class WhileCountOfnumbersdivBy10from1to100
{
    public static void main(String[] args)
    {
        int count=0;
        int i=0;
        System.out.println("The numbers which are div by10 from 1 to 100 are:");
        while(i<=100)
        {
            if(i%10==0)
            {
                count = count + 1;
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();
        System.out.println("The count of numbers which are div by 1 to 100 is:"+count);
    }
}
