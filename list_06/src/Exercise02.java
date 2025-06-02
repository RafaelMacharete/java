package list_06.src;
import java.util.*;

public class Exercise02 {
    static public void main(String... argv) {
        ArrayList<HashMap<String, Object>> people = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter the age of person " + (i + 1) + ": ");
            int age = scan.nextInt();

            System.out.println("Enter the height of person " + (i + 1) + ": ");
            double height = scan.nextDouble();

            System.out.println("Enter the weight of person " + (i + 1) + ": ");
            double weight = scan.nextDouble();

            HashMap<String, Object> person = new HashMap<>();
            person.put("age", age);
            person.put("height", height);
            person.put("weight", weight);

            people.add(person);
        }
        int olderThan50 = 0;
        int higherThan160 = 0;
        int lighterThan80 = 0;

        for (HashMap<String, Object> p : people) {
            if ((int) p.get("age") > 50) {
                olderThan50++;
            }
            if ((double) p.get("height") > 160) {
                higherThan160++;
            }
            if ((double) p.get("weight") < 80) {
                lighterThan80++;
            }
        }

        System.out.printf("%d People older than 50\n", olderThan50);
        System.out.printf("%d People taller than 160\n", higherThan160);
        System.out.printf("%d People lighter than 80\n", lighterThan80);

        scan.close();
    }
}
