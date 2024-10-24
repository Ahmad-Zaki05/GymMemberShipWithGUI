import java.util.Scanner;
import java.time.LocalDate;

public class Lab4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AdminRole adminRole = new AdminRole();
        TrainerRole trainerRole = new TrainerRole();

        while (true) {
            System.out.println("Choose operation mode\n (1) Admin\n (2) Trainer\n (3) Quit");
            String mode = scanner.nextLine();

            if (mode.equals("1")) {
                handleAdminMode(scanner, adminRole);
            } else if (mode.equals("2")) {
                handleTrainerMode(scanner, trainerRole);
            } else if (mode.equals("3")) {
                System.out.println("Exiting program...");
                break;
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }

    private static void handleAdminMode(Scanner scanner, AdminRole adminRole) {
        while (true) {
            System.out.println("Admin Menu: (1. Add Trainer, 2. Remove Trainer, 3. List Trainers, 4. Logout)");
            String action = scanner.nextLine();
            if (action.equals("1")) {
                System.out.println("Enter trainer details (id, name, email, specialty, phone):");
                String trainerId = scanner.nextLine();
                String name = scanner.nextLine();
                String email = scanner.nextLine();
                String specialty = scanner.nextLine();
                String phone = scanner.nextLine();
                adminRole.addTrainer(trainerId, name, email, specialty, phone);
            } else if (action.equals("2")) {
                System.out.println("Enter trainer ID to remove:");
                String trainerId = scanner.nextLine();
                adminRole.removeTrainer(trainerId);
            } else if (action.equals("3")) {
                for (Trainer trainer : adminRole.getListOfTrainers().returnAllRecords()) {
                    System.out.println(trainer.lineRepresentation());
                }
            } else if (action.equals("4")) {
                adminRole.logout();
                break;
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void handleTrainerMode(Scanner scanner, TrainerRole trainerRole) {
        while (true) {
            System.out.println("Trainer Menu: (1. Add Member, 2. Add Class, 3. Register Member, 4. Cancel Registration, 5. List Registrations, 6. List Members, 7. List Classes ,8. Logout)");
            String action = scanner.nextLine();

            if (action.equals("1")) {
                System.out.println("Enter member details (id, name, membershipType, email, phone, status):");
                String memberId = scanner.nextLine();
                String name = scanner.nextLine();
                String membershipType = scanner.nextLine();
                String email = scanner.nextLine();
                String phone = scanner.nextLine();
                String status = scanner.nextLine();
                trainerRole.addMember(memberId, name, membershipType, email, phone, status);
            } else if (action.equals("2")) {
                System.out.println("Enter class details (id, name, trainerId, duration, maxParticipants):");
                String classId = scanner.nextLine();
                String className = scanner.nextLine();
                String trainerId = scanner.nextLine();
                int duration = Integer.parseInt(scanner.nextLine());
                int maxParticipants = Integer.parseInt(scanner.nextLine());
                trainerRole.addClass(classId, className, trainerId, duration, maxParticipants);
            } else if (action.equals("3")) {
                System.out.println("Enter registration details (memberId, classId)");
                String memberId = scanner.nextLine();
                String classId = scanner.nextLine();
                LocalDate registrationDate = LocalDate.now();
                trainerRole.registerMemberForClass(memberId, classId, registrationDate);
            } else if (action.equals("4")) {
                System.out.println("Enter registration details (memberId, classId):");
                String memberId = scanner.nextLine();
                String classId = scanner.nextLine();
                trainerRole.cancelRegistration(memberId, classId);
            } else if (action.equals("5")) {
                for(MemberClassRegistration registration : trainerRole.getListOfRegistrations().returnAllRecords() ) {
                    System.out.println(registration.lineRepresentation());
                }
            }
            else if (action.equals("6")) {
                for(Member member : trainerRole.getListOfMembers().returnAllRecords() ) {
                    System.out.println(member.lineRepresentation());
                }
            }

            else if (action.equals("7")) {
                for (Class class1 : trainerRole.getListOfClasses().returnAllRecords()) {
                    System.out.println(class1.lineRepresentation());
                }
            }
            else if (action.equals("8")) {
                trainerRole.logout();
                break;
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }
    }
}