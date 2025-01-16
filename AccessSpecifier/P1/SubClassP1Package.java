package com.sgtest.JavaPart2.AccessSpecifier.P1;

public class SubClassP1Package extends Protection
{
    public SubClassP1Package()
    {
        System.out.println("Its a SubClassInP1Package Constructor..");
        //System.out.println("Private_a:"+private_a);
        //System.out.println("Default_b:"+dafault_b);
        System.out.println("Protected_c:"+protected_c);
        System.out.println("Public_c:"+public_d);
    }
}
