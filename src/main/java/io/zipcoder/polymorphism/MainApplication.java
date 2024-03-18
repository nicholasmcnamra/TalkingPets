package io.zipcoder.polymorphism;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MainApplication {

    public static void main(String[] args) {
        LinkedHashMap<Pet, String> map = getPets();
        printPetsAndSpeak(map);
    }

    public static LinkedHashMap<Pet, String> getPets() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many pets do you have?");
        int numberOfPets = scanner.nextInt();
        scanner.nextLine();

        LinkedHashMap<Pet, String> petMap = new LinkedHashMap<>();

        for (int i = 0; i < numberOfPets; i++) {
            System.out.println("What type of pet?");
            String petType = scanner.nextLine();

            System.out.printf("What is your %s's name?\n", petType);
            String petName = scanner.nextLine();

            if(petType.toLowerCase().equals("cat")){
                Cat newCat = new Cat(petName);
                petMap.put(newCat, petName);
            }
            else if(petType.toLowerCase().equals("dog")){
                Dog newDog = new Dog(petName);
                petMap.put(newDog, petName);
            }
            else if(petType.toLowerCase().equals("macaw")){
                Macaw newMacaw = new Macaw(petName);
                petMap.put(newMacaw, petName);
            }
 
        }
        return petMap;
    }

    public static void printPetsAndSpeak(LinkedHashMap<Pet, String> lhm){
        for(Map.Entry<Pet, String> entry: lhm.entrySet()){
            System.out.println(entry.getKey().getName() + " says: " + entry.getKey().speak());
        }
    }
}
