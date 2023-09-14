package applicationVetores;

import entitiesVetores.Rent;

import java.util.Locale;
import java.util.Scanner;

public class DesPensionato {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();
        Rent[] allRent = new Rent[10];

        for (int i = 0; i< n; i++){
            sc.nextLine();
            System.out.printf("Rent #%d%n", i +1);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            allRent[room] = new Rent(name, email, room);
        }

        System.out.println("Busy rooms: ");
        for (int i = 0; i < allRent.length; i++){
            if (allRent[i] != null){
                System.out.println(allRent[i]);
            }
        }



        sc.close();
    }
}
