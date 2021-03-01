package com.maimai.tamagotchi.menu;

import com.maimai.tamagotchi.entities.UserEntity;
import com.maimai.tamagotchi.managers.MascotManager;
import com.maimai.tamagotchi.managers.UserManager;
import com.maimai.tamagotchi.utils.Cache;
import com.maimai.tamagotchi.utils.console.Colors;

import java.util.Scanner;

public class Menu {

    Scanner input = new Scanner(System.in);
    Colors color = new Colors();


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
            System.out.println("Seleccionaste la opción 1");

        } else if (option == 2) {
            System.out.println("Seleccionaste la opción 2");

        } else if (option == 3) {

            System.out.println("Seleccionaste la opción 3");
        }else{
            System.out.println("Ingresa una opción correcta.");
            displayMainMenu();
        }

    }

}
