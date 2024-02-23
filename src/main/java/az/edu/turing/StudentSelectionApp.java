package az.edu.turing;

import java.util.Random;

public class StudentSelectionApp {
    public static void main(String[] args) {
        String[] students = populate();
        int[] seats = new int[17];

        int size = students.length;
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            int seat;
            do {
                seat = random.nextInt(seats.length);
            } while (seats[seat] != 0);
            seats[seat] = i + 1;
        }
        print(students, seats);
    }

    private static String[] populate() {
        return new String[]{
                "Aybəniz",
                "Aydan",
                "Bəhruz",
                "Bəşir",
                "Eldar",
                "Fərid.H",
                "Fərid.K",
                "Kənan",
                "Leyla",
                "Nurlan",
                "Nəzrin",
                "Selen",
                "Taleh",
                "Vüsal",
                "İlham",
                "İsmayıl",
                "Əli"
        };
    }

    private static void print(String[] students, int[] seats) {
        for (int i = 0; i < students.length; i++) {
            System.out.printf("%s \t-->\t %d\n", students[i], seats[i]);
        }
    }
}