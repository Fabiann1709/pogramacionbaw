
package com.mycompany.poo;

import people.Character;

public class Poo {

    public static void main(String[] args) {
        Character homero = new Character("Homero", 39, 'M', "A LA GRANDE LE PUSE CUCA" );
        homero.saySomething();
        Character bart = new Character("bart", 12, 'M', "Ay caramba" );
        bart.saySomething();
        
        Character apu = new Character();
        apu.setName("apu");
        apu.setPhrase("vuelvas prontos");
        
        apu.saySomething();
    }
    }

