package Gym;
    import java.util.*;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ArrayList<String> members = new ArrayList<>();
            int choice;

            while (true) {
                System.out.println("\nGym Membership System");
                System.out.println("1. Add Member");
                System.out.println("2. Update Member Name");
                System.out.println("3. Remove Member");
                System.out.println("4. Display Members");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Enter new member name: ");
                        members.add(scanner.nextLine());
                        System.out.println("Member added successfully.");
                        break;
                    case 2:
                        System.out.print("Enter current member name: ");
                        String oldName = scanner.nextLine();
                        if (members.contains(oldName)) {
                            System.out.print("Enter new name: ");
                            members.set(members.indexOf(oldName), scanner.nextLine());
                            System.out.println("Member name updated successfully.");
                        } else {
                            System.out.println("Member not found.");
                        }
                        break;
                    case 3:
                        System.out.print("Enter member name to remove: ");
                        String removeName = scanner.nextLine();
                        if (members.remove(removeName)) {
                            System.out.println("Member removed successfully.");
                        } else {
                            System.out.println("Member not found.");
                        }
                        break;
                    case 4:
                        System.out.println("Current Members:");
                        if (members.isEmpty()) {
                            System.out.println("No members found.");
                        } else {
                            for (String member : members) {
                                System.out.println(member);
                            }
                        }
                        break;
                    case 5:
                        System.out.println("Exiting...\n");
                        return;
                    default:
                        System.out.println("Invalid choice, please try again.");
                }
            }
        }
    }