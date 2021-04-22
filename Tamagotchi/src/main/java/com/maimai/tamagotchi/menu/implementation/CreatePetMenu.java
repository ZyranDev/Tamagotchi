package com.maimai.tamagotchi.menu.implementation;

import com.maimai.tamagotchi.mascot.entity.EntityType;
import com.maimai.tamagotchi.mascot.entity.MascotEntity;
import com.maimai.tamagotchi.menu.SimpleMenu;
import com.maimai.tamagotchi.util.console.Console;
import lombok.Getter;

import javax.inject.Inject;
import java.util.Scanner;
import java.util.function.Consumer;

public class CreatePetMenu extends SimpleMenu {

    @Getter
    private static final MascotEntity mascotEntity = new MascotEntity();
    private final Scanner scanner = new Scanner(System.in);

    @Inject
    private SelectionMenu selectionMenu;

    private void pet(String owner, String name, EntityType type) {
        mascotEntity.setOwner(owner);
        mascotEntity.setName(name);
        mascotEntity.setType(type);
    }

    @Override
    public void displayMenu() {
        Console.clearConsole();
        Console.print(
                "",
                "&b1&l. &dHoliwis &b\\（＾－＾）/&d, escribe tu nombre para comenzar: &r",
                "");
        String ownerName = scanner.nextLine();
        Console.print("",
                "&cEstupendo, tu nombre es &d&l" + ownerName + "&r",
                "&cNunca antes había visto un nombre tan bonito (´▽`ʃ♡ƪ)",
                "&r");

        Console.print(
                "",
                "&b&l2. &dEntonces dale un hermoso nombre para tu mascota! ╰(*°▽°*)╯:&r",
                "");
        String petName = scanner.nextLine();
        Console.print(
                "",
                "&cExcelente! ahora tu mascota se llama: &d&l" + petName + " &r&cヽ(✿ﾟ▽ﾟ)ノ",
                "&r");

        Console.print(
                "",
                "&b&l3. &dAhora, selecciona que tipo de mascota quieres: (. ❛ ᴗ ❛.)&r",
                "",
                "&1&lDog, Cat, Lion, Parrot, Rabbit&r",
                "");
        String petType = scanner.nextLine().toUpperCase();
        Console.print(
                "",
                "&cFabuloso! &d&l" + petName + "&r&c, ha nacido como un: &d&l" + petType + "&r&c!&r",
                "");

        switch (petType) {
            case "CAT":
                pet(ownerName, petName, EntityType.CAT);
                selectionMenu.displayMenu();
                break;
            case "LION":
                pet(ownerName, petName, EntityType.LION);
                selectionMenu.displayMenu();
                break;
            case "DOG":
                pet(ownerName, petName, EntityType.DOG);
                selectionMenu.displayMenu();
                break;
            case "PARROT":
                pet(ownerName, petName, EntityType.PARROT);
                selectionMenu.displayMenu();
                break;
            case "RABBIT":
                pet(ownerName, petName, EntityType.RABBIT);
                selectionMenu.displayMenu();
                break;
            default:
                Console.clearConsole();
                Console.print(
                        "",
                        "&1&n&l-----------------------------&r",
                        "&c&oPorfis, selecciona una opción valida!&r",
                        "&1&n&l-----------------------------&r",
                        "");

                displayMenu();
        }
    }

    @Override
    public Consumer<String> listener() {
        return null;
    }
}
