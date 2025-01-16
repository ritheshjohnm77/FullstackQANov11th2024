package com.sgtest.JavaPart2.AccessSpecifier.P1;

public class Protection
{
    private int private_a = 100;
    int default_b = 200;
    protected int protected_c = 300;
    public int public_d = 400;

    public Protection()
    {
        System.out.println("Its a Protection class Constructor");
        System.out.println("Private_a:" + private_a);
        System.out.println("Default_b:" + default_b);
        System.out.println("Protected_b:" + protected_c);
        System.out.println("Public_c:" + public_d);
    }
}
