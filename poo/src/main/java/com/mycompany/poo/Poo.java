
package com.mycompany.poo;


public class Poo {

    public static void main(String[] args) {
        Character homero = new Character("Homero", 39, 'M', "A LA GRANDE LE PUSE CUCA" );
        homero.saySomething();
        Character bart = new Character("bart", 12, 'M', "Ay caramba" );
        bart.saySomething();
    }
    
    static class Character{
        String name;
        int age;
        char gender;
        String phrase;

        public Character(String name, int age, char gender, String phrase) {
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.phrase = phrase;
        }
        
        void saySomething(){
            System.out.println(this.phrase);
        }
    }
}
