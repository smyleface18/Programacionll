/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programacionll;

import people.Character;
/**
 *
 * @author SCIS2PC08
 */
public class Programacionll {

//    Error: LinkageError occurred while loading main class com.mycompany.javau.feb_29 java.lang.UnsupportedClassVersionError:
//            com/mycompany/javau/feb_29 has been compiled by a more recent version of the Java Runtime (class file version 63.0),
//            this version of the Java Runtime only recognizes class file versions up to 60.0 Command execution failed.
    
    public static void main(String[] args) {
        
        Character homero = new Character("homero",39,'M', "A la grande le puse cuca");
        Character bart = new Character("Barto",10,'M', "AY CARAMBA");
        
        homero.saySomething();
        bart.saySomething();
        
        Character apu = new Character();
        apu.setName("Apu");
        apu.setPhrase("Vuelvas Prontos");
        
        apu.saySomething();
    }
    
}
