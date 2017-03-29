package com.sdajava.builder_constructor_wzorce_projektowe_2;

public class Main {

    public static void main(String[] args) {

        User student = new User.Builder().age(32).address("adres").name("Marta").surname("Ostrowska").telephone("223000000").build();
        System.out.println(student);

        User student2 = new User.Builder().age(33).address("adres2").name("Nikodem").surname("Kowalski").telephone("223111111").build();
        System.out.println(student2);

        User student3 = new User.Builder().age(34).address("adres3").name("Anna").surname("Nowak").telephone("223222222").build();
        System.out.println(student3);
    }
}
