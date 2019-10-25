package com.spartaglobal.RabbitExplosion;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
   //     GlobalTimer globalTimer = new GlobalTimer(5);
    StartReproduction rabbitReproduction = new StartReproduction();
    rabbitReproduction.startProcreation(10);
    }
}
