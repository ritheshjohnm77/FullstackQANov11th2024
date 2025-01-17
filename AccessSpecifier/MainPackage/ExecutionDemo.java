package com.sgtest.JavaPart2.AccessSpecifier.MainPackage;

import com.sgtest.JavaPart2.AccessSpecifier.P1.IndependentClassInP1Package;
import com.sgtest.JavaPart2.AccessSpecifier.P1.Protection;
import com.sgtest.JavaPart2.AccessSpecifier.P1.SubClassP1Package;
import com.sgtest.JavaPart2.AccessSpecifier.P2.IndependentClassInP2Package;
import com.sgtest.JavaPart2.AccessSpecifier.P2.SubClassP2Package;

import java.lang.reflect.Constructor;

public class ExecutionDemo
{
    public static void main(String[] args)
    {
        //Execution Protection class Constructor
        Protection o1=new Protection();
        //Execution SubClassInP1Package Constructor
        SubClassP1Package o2=new SubClassP1Package();
        //Execution IndependentClassInP1Package Constructor
        IndependentClassInP1Package o3=new IndependentClassInP1Package();
        //Execution Protection class Constructor
        Protection o=new Protection();
        //Execution SubClassInP1Package Constructor
        SubClassP2Package o4=new SubClassP2Package();
       // Execution IndependentClassInP1Package Constructor
        IndependentClassInP2Package o6=new IndependentClassInP2Package();
    }
}
