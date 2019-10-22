package com.spartaglobal.RabbitExplosion;

import org.w3c.dom.ls.LSOutput;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Rabbit rabbit = new Rabbit(5);
        System.out.println(rabbit.randomPregnancy());
    }
}
