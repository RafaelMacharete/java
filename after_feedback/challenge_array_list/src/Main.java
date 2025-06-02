import java.text.Normalizer;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static String normalizeName(String name) {
        return Normalizer.normalize(name, Normalizer.Form.NFD)
                .replaceAll("[^\\p{ASCII}]", "")
                .toLowerCase();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int continue_playing;
        ArrayList<String> names = new ArrayList<>();

        do {
            String[] names_list = new String[5];
            int[] repeated_times_names = new int[names_list.length];

            /*
            Store the names on "names_list" array.
            */
            for (int idx = 0; idx < names_list.length; idx++) {
                System.out.print("Insert the " + (idx + 1) + "°" + " name: ");
                names_list[idx] = scan.next().toLowerCase();
            }

            /*
            Count how many times the names were repeated.
            */
            for (int idx_i = 0; idx_i < names_list.length; idx_i++) {
                repeated_times_names[idx_i] = 0;
                for (String comparative_name : names_list) {
                    if (normalizeName(names_list[idx_i]).equals(normalizeName(comparative_name))) {
                        repeated_times_names[idx_i]++;
                    }
                }
            }

            // Find the greather counting
            int max = repeated_times_names[0];
            for (int i = 1; i < repeated_times_names.length; i++) {
                if (repeated_times_names[i] > max) {
                    max = repeated_times_names[i];
                }
            }

            // List names with the greather counting (without repeating)
            System.out.println("\nNomes that most appeared (" + max + " vezes):");
            for (int i = 0; i < names_list.length; i++) {
                boolean alreadyShown = false;
                for (int j = 0; j < i; j++) {
                    if (normalizeName(names_list[i]).equals(normalizeName(names_list[j]))) {
                        alreadyShown = true;
                        break;
                    }
                }
                if (!alreadyShown && repeated_times_names[i] == max) {
                    System.out.println("- " + names_list[i]);
                    names.add(names_list[i]);
                }
            }

            System.out.println("Do you want continue playing?\n[0] - No\n[1] - Yes");
            continue_playing = scan.nextInt();


        } while(continue_playing == 1);
        System.out.println("The names that appeared on the rounds was:" + names);
    }
}