package com.maimai.tamagotchi.menu;


import java.util.Scanner;

public class Menu {

    Scanner input = new Scanner(System.in);


    public void displayMainMenu() {
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("     Menú Principal.");
        System.out.println(" ");
        System.out.println("1. Seleccionar mascota.");
        System.out.println("2. Información de mascotas.");
        System.out.println("3. Tienda.");
        System.out.print("Por favor seleccione una opción: ");
        int option = input.nextInt();

        if (option == 1) {
            System.out.println("Seleccionaste la opción 1, test");

        } else if (option == 2) {
            System.out.println("Seleccionaste la opción 2, test");

        } else if (option == 3) {

            System.out.println("Seleccionaste la opción 3, test");
        }else{
            System.out.println("Ingresa una opción correcta.");
            displayMainMenu();
        }

    }

}
