import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            // Krijimi i përdoruesve dhe kurseve
            Instruktori instruktori = new Instruktori("2", "Dr. Arben", "arben@shkolla.com");
            Administrator admin = new Administrator("1", "Zyra", "admin@shkolla.com");
            Studenti studenti = new Studenti("3", "Liri", "liri@shkolla.com");

            // Krijimi i kursit
            Kursi kursi = new Kursi("K1", "Matematika", instruktori);
            admin.shtoKurs(kursi);  // Administratorët mund të shtojnë kurse
            instruktori.krijoKurs(kursi);  // Instruktori krijon dhe menaxhon kursin

            // Përdoruesi hyn me ID dhe email
            Scanner scanner = new Scanner(System.in);
            System.out.print("Shkruani ID-në tuaj (1 për Administrator, 2 për Instruktor, 3 për Student): ");
            String userId = scanner.nextLine();

            if (userId.equals("1")) { // Administratori hyn me email
                System.out.print("Shkruani emailin tuaj si administrator: ");
                String email = scanner.nextLine();

                // Verifikimi i email-it të administratorit
                if (email.equals(admin.getEmail())) {
                    System.out.println("Ju jeni autentikuar si administrator.");
                    // Ofroni mundësi për administratoret
                    boolean running = true;
                    while (running) {
                        System.out.println("\nOpsionet e administratorit:");
                        System.out.println("1. Shiko përdoruesit");
                        System.out.println("2. Shto përdorues");
                        System.out.println("3. Fshij përdorues");
                        System.out.println("4. Shiko kurset");
                        System.out.println("5. Shto kurs");
                        System.out.println("6. Fshij kurs");
                        System.out.println("7. Dil");
                        System.out.print("Zgjidhni një opsion: ");
                        int option = scanner.nextInt();
                        scanner.nextLine();  // Konsumoni linjën e mbetur pas opsionit të përdoruesit

                        switch (option) {
                            case 1:
                                // Shfaqni listën e përdoruesve
                                System.out.println("Përdoruesit:");
                                break;
                            case 2:
                                // Shto përdorues
                                System.out.println("Shto përdoruesin:");
                                break;
                            case 3:
                                // Fshi përdorues
                                System.out.println("Fshi përdoruesin:");
                                break;
                            case 4:
                                // Shiko kurset
                                System.out.println("Kursët:");
                                break;
                            case 5:
                                // Shto kurs
                                System.out.println("Shto kursin:");
                                break;
                            case 6:
                                // Fshi kurs
                                System.out.println("Fshi kursin:");
                                break;
                            case 7:
                                running = false;
                                System.out.println("Dalim nga platforma.");
                                break;
                            default:
                                System.out.println("Opsion i pasaktë. Provoni përsëri.");
                        }
                    }
                } else {
                    System.out.println("Emaili i dhënë është i pasaktë.");
                }
            } else {
                System.out.println("Ju nuk jeni administrator.");
                // Logjika për përdoruesit tjerë (Instruktori dhe Student) mund të vendoset këtu
            }

        } catch (Exception e) {
            System.out.println("Gabim: " + e.getMessage());
        }
    }


}