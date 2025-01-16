package com.sgtest.JavaPart2.AccessSpecifier.P2;

import com.sgtest.JavaPart2.AccessSpecifier.P1.Protection;

public class IndependentClassInP2Package
{
    Protection o=new Protection();
    public IndependentClassInP2Package()
    {
        System.out.println("Its a IndependentClassInP2Package Constructor..!!!");
        //System.out.println("Private_a:"+o.private_a);
        //System.out.println("Default_b:"+o.default_b);
        //System.out.println("Protected_c:"+o.protected_c);
        System.out.println("Public_d:"+o.public_d);
    }
}
