package list_06.src;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Exercise07 {
    static public void main(String... argv){
        Scanner scan = new Scanner(System.in);
        ArrayList<HashMap<String, Object>> peopleList = new ArrayList<>();

        int count = 1;

        while (count <= 6){
            System.out.println("Enter the name of person " + count);
            String name = scan.next();

            System.out.println("Enter the height of person " + count);
            double height = scan.nextDouble();

            System.out.println("Enter the weight of person " + count);
            double weight = scan.nextDouble();

            HashMap<String, Object> person = new HashMap<>();
            person.put("name", name);
            person.put("height", height);
            person.put("weight", weight);

            peopleList.add(person);

            count++;
        }

        double mostHigher = 0;
        String nameOfMostHigher = "";

        double mostHeavier = 0;
        String nameOfMostHeavier = "";

        for (HashMap<String, Object> p : peopleList) {
            if ((double)p.get("height") > mostHigher){
                mostHigher = (double)p.get("height");
                nameOfMostHigher = (String)p.get("name");
            }

            if ((double)p.get("weight") > mostHeavier){
                mostHeavier = (double)p.get("height");
                nameOfMostHeavier = (String)p.get("name");
            }
        }

        System.out.println("The most higher is: " + nameOfMostHigher);
        System.out.println("The most heavier is: " + nameOfMostHeavier);

        scan.close();
    }
}
