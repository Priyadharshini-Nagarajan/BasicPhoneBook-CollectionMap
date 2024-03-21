import java.util.*;

public class MapJ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> phonebook = new HashMap<>();

        System.out.println("Welcome to Simple Phonebook!");

        while (true) {
            System.out.println("\n1. Add Contact");
            System.out.println("2. Search Contact");
            System.out.println("3. Display All Contacts");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter contact name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter contact number: ");
                    String number = scanner.nextLine();
                    phonebook.put(name, number);
                    System.out.println("Contact added successfully.");
                    break;
                case 2:
                    System.out.print("Enter contact name to search: ");
                    String searchName = scanner.nextLine();
                    String contactNumber = phonebook.get(searchName);
                    if (contactNumber != null) {
                        System.out.println("Contact found: " + searchName + " - " + contactNumber);
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;
                case 3:
                    if (phonebook.isEmpty()) {
                        System.out.println("Phonebook is empty.");
                    } else {
                        System.out.println("Phonebook:");
                        for (Map.Entry<String, String> entry : phonebook.entrySet()) {
                            System.out.println(entry.getKey() + " - " + entry.getValue());
                        }
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
