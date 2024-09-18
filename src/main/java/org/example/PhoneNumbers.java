package org.example;
import java.util.Scanner;

    public class PhoneNumbers {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            String[] names = new String[30];
            String[] phoneNumbers = new String[30];
            int count = 10;

            // Initialize the first 10 entries
            names[0] = "Alice";
            phoneNumbers[0] = "555-1234";
            names[1] = "Bob";
            phoneNumbers[1] = "555-5678";
            names[2] = "Charlie";
            phoneNumbers[2] = "555-8765";
            names[3] = "David";
            phoneNumbers[3] = "555-4321";
            names[4] = "Eva";
            phoneNumbers[4] = "555-1357";
            names[5] = "Frank";
            phoneNumbers[5] = "555-2468";
            names[6] = "Grace";
            phoneNumbers[6] = "555-3698";
            names[7] = "Hannah";
            phoneNumbers[7] = "555-4826";
            names[8] = "Ivy";
            phoneNumbers[8] = "555-5793";
            names[9] = "Jack";
            phoneNumbers[9] = "555-6801";

            while (true) {
                System.out.print("Enter a name (or 'quit' to exit): ");
                String name = input.nextLine().trim();

                if (name.equalsIgnoreCase("quit")) {
                    System.out.println("Exiting...");
                    break;
                }

                int index = findNameIndex(names, name, count);

                if (index != -1) {
                    System.out.println("Phone number for " + name + ": " + phoneNumbers[index]);
                } else {
                    if (count >= names.length) {
                        System.out.println("Directory is full. Cannot add more entries.");
                        break;
                    }
                    System.out.print("Name not found. Enter phone number for " + name + ": ");
                    String phoneNumber = input.nextLine().trim();
                    names[count] = name;
                    phoneNumbers[count] = phoneNumber;
                    count++;
                    System.out.println("Entry added for " + name + ".");
                }
            }

            input.close();
        }

        // Method to find the index of a name in the names array
        private static int findNameIndex(String[] names, String name, int count) {
            for (int i = 0; i < count; i++) {
                if (names[i].equalsIgnoreCase(name)) {
                    return i;
                }
            }
            return -1;
        }
    }


