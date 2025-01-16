package com.sgtest.JavaPart2.AccessSpecifier.P2;

import com.sgtest.JavaPart2.AccessSpecifier.P1.Protection;

public class SubClassP2Package extends Protection
{
    public SubClassP2Package()
    {
        System.out.println("It is SubClassP2Package Constructor...");
        //System.out.println("Private_a:"+private_a);
        //System.out.println("Default_a:"+default_a);
        //System.out.println("Protected_a:"+protected_a);
        System.out.println("Public_a:"+public_d);
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
    }
}
