/*
* Make a program to read a set of people's names and their respective ages.
* The names should be stored in one vector, and the ages in another vector.
* Then show on the screen the name of the oldest person.
*/

import java.util.Scanner;

public class OldestOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberPeople, age;
        String name;

// getting number of people for the array
        System.out.print("How many people you will enter? ");
        numberPeople = scanner.nextInt();

// getting people's names and ages
        String[] nameArray = new String[numberPeople];
        int[] ageArray = new int[numberPeople];
        for (int i = 0; i < numberPeople; i++) {
            System.out.printf("%dnd person data: %n", i+1);
            System.out.print("Name: ");
            nameArray[i] = scanner.next();
            System.out.print("Age: ");
            ageArray[i] = scanner.nextInt();
        }
// discovering the older person
        age = 0;
        name = " ";
        for (int i = 0; i < ageArray.length; i++) {
            if (ageArray[i] > age) {
                age = ageArray[i];
                name = nameArray[i];
            }
        }
        /*
        for (int j : ageArray) {
            if(ageArray[j] > age){
                age = ageArray[j];
                name = nameArray[j];
            }
        }
        */

// printing result
            System.out.printf("Oldest person: %s %d%n", name, age);
    }
}