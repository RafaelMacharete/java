package list_03.src;

import java.util.Scanner;
public class Exercise03 {
    static public void main(String... argv){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the A-team goals: ");
        int aTeamGoals = scan.nextInt();

        System.out.println("Enter the A-team goals: ");
        int bTeamGols = scan.nextInt();

        if(aTeamGoals == bTeamGols){
            System.out.println("Draw");
        }else if(aTeamGoals > bTeamGols){
            System.out.println("Winner: Team A");
        }else{
            System.out.println("Winner: Team B");
        }

        scan.close();
    }
}
