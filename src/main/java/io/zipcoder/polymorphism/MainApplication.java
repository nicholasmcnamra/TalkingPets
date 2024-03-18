package io.zipcoder.polymorphism;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class MainApplication {

    public static void main(String[] args) {
        getPets();
    }

    public static LinkedHashMap<String, String> getPets() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many pets do you have?");
        int numberOfPets = scanner.nextInt();
        scanner.nextLine();

        LinkedHashMap<String, String> petMap = new LinkedHashMap<>();

        for (int i = 0; i < numberOfPets; i++) {
            System.out.println("What type of pet?");
            String petType = scanner.nextLine();

            System.out.printf("What is your %s's name?\n", petType);
            String petName = scanner.nextLine();
            petMap.put(petType, petName);

        }
        System.out.println(petMap.toString());
        return petMap;
    }
}
