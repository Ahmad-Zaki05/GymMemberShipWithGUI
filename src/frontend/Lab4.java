package frontend;

import backend.AdminRole;
import backend.Class;
import backend.TrainerRole;

import java.util.Scanner;
import java.time.LocalDate;

public class Lab4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AdminRole adminRole = new AdminRole();
        TrainerRole trainerRole = new TrainerRole();

        label:
        while (true) {
            System.out.println("Choose operation mode\n (1) Admin\n (2) backend.Trainer\n (3) Quit");
            String mode = scanner.nextLine();

            switch (mode) {
                case "1":
                    handleAdminMode(scanner, adminRole);
                    break;
                case "2":
                    handleTrainerMode(scanner, trainerRole);
                    break;
                case "3":
                    System.out.println("Exiting program...");
                    break label;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }

        scanner.close();
    }

    private static void handleAdminMode(Scanner scanner, AdminRole adminRole) {
        label:
        while (true) {
            System.out.println("Admin Menu: (1. Add backend.Trainer, 2. Remove backend.Trainer, 3. List Trainers, 4. Logout)");
            String action = scanner.nextLine();
            switch (action) {
                case "1": {
                    System.out.println("Enter trainer details (id, name, email, specialty, phone):");
                    String trainerId = scanner.nextLine();
                    String name = scanner.nextLine();
                    String email = scanner.nextLine();
                    String specialty = scanner.nextLine();
                    String phone = scanner.nextLine();
                    adminRole.addTrainer(trainerId, name, email, specialty, phone);
                    break;
                }
                case "2": {
                    System.out.println("Enter trainer ID to remove:");
                    String trainerId = scanner.nextLine();
                    adminRole.removeTrainer(trainerId);
                    break;
                }
                case "3":
                    for (backend.Record trainer : adminRole.getListOfTrainers()) {
                        System.out.println(trainer.lineRepresentation());
                    }
                    break;
                case "4":
                    adminRole.logout();
                    break label;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }

    private static void handleTrainerMode(Scanner scanner, TrainerRole trainerRole) {
        label:
        while (true) {
            System.out.println("backend.Trainer Menu: (1. Add backend.Member, 2. Add backend.Class, 3. Register backend.Member, 4. Cancel Registration, 5. List Registrations, 6. List Members, 7. List Classes ,8. Logout)");
            String action = scanner.nextLine();

            switch (action) {
                case "1": {
                    System.out.println("Enter member details (id, name, membershipType, email, phone, status):");
                    String memberId = scanner.nextLine();
                    String name = scanner.nextLine();
                    String membershipType = scanner.nextLine();
                    String email = scanner.nextLine();
                    String phone = scanner.nextLine();
                    String status = scanner.nextLine();
                    trainerRole.addMember(memberId, name, membershipType, email, phone, status);
                    break;
                }
                case "2": {
                    System.out.println("Enter class details (id, name, trainerId, duration, maxParticipants):");
                    String classId = scanner.nextLine();
                    String className = scanner.nextLine();
                    String trainerId = scanner.nextLine();
                    int duration = Integer.parseInt(scanner.nextLine());
                    int maxParticipants = Integer.parseInt(scanner.nextLine());
                    trainerRole.addClass(classId, className, trainerId, duration, maxParticipants);
                    break;
                }
                case "3": {
                    System.out.println("Enter registration details (memberId, classId)");
                    String memberId = scanner.nextLine();
                    String classId = scanner.nextLine();
                    LocalDate registrationDate = LocalDate.now();
                    trainerRole.registerMemberForClass(memberId, classId, registrationDate);
                    break;
                }
                case "4": {
                    System.out.println("Enter registration details (memberId, classId):");
                    String memberId = scanner.nextLine();
                    String classId = scanner.nextLine();
                    trainerRole.cancelRegistration(memberId, classId);
                    break;
                }
                case "5":
                    for (backend.Record registration : trainerRole.getListOfRegistrations()) {
                        System.out.println(registration.lineRepresentation());
                    }
                    break;
                case "6":
                    for (backend.Record member : trainerRole.getListOfMembers()) {
                        System.out.println(member.lineRepresentation());
                    }
                    break;
                case "7":
                    for (Class class1 : trainerRole.getListOfClasses()) {
                        System.out.println(class1.lineRepresentation());
                    }
                    break;
                case "8":
                    trainerRole.logout();
                    break label;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }
}