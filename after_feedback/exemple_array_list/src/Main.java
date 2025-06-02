import java.io.FilterOutputStream;
import java.util.ArrayList;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList<String> friendsList = new ArrayList<>();

        friendsList.add("Rafael");
        friendsList.add("Leafar");
        friendsList.add("Farlea");

        System.out.println("Friends going to party");

        for (String amigo : friendsList){
            System.out.println(amigo);
        }

        System.out.println("Total of friends: " + friendsList.size());

        System.out.println("Second friend of list is: " + friendsList.get(1));

        friendsList.remove(1);
        System.out.println("Farlea não vai mais para a festa. Lista atualizada: ");

        for (String amigo : friendsList){
            System.out.println(amigo);
        }
    }
}