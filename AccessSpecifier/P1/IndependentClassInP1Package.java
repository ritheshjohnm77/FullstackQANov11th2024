package com.sgtest.JavaPart2.AccessSpecifier.P1;

public class IndependentClassInP1Package extends Protection
{
    public IndependentClassInP1Package()
    {
        System.out.println("Its a IndependentClassInP1Package class Constructor");
        //System.out.println("Private_a:" + private_a);
        System.out.println("Default_b:" + default_b);
        System.out.println("Protected_b:" + protected_c);
        System.out.println("Public_c:" + public_d);
    }
}
