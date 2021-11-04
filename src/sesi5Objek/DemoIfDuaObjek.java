/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesi5Objek;

/**
 *
 * @author riseloka
 */
public class DemoIfDuaObjek {
    public void checkBilangan(int bilangan) {
        if (bilangan < 0 )
            System.out.println(bilangan + " Merupakan bilangan NEGATIF.");
        else if (bilangan == 0) 
            System.out.println("Nilai yang dimasukan adalah NOL");
        else 
            System.out.println(bilangan + " Merupakan bilangan POSITIF.");
    }
}
