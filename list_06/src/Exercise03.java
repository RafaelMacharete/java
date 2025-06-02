package list_06.src;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise03 {
    static public void main(String... argv){
        Scanner scan = new Scanner(System.in);

        char toContinue = 'Y';

        int great_rate = 0;
        int good_rate = 0;
        int bad_rate = 0;

        int total_rate = 0;
        while (toContinue == 'Y' || toContinue == 'y'){
            System.out.println("Do you want rate the movie?\n[Y] - Yes\n[N] - No");
            toContinue = scan.next().charAt(0);

            if (toContinue == 'N' || toContinue == 'n'){
                break;
            }
            total_rate++;

            System.out.println("How was the movie?\n[3] - Great\n[2] - Good\n[1] - Bad");
            int rating = scan.nextInt();

            if (rating == 3){
                great_rate++;
            }else if(rating == 2){
                good_rate++;
            }else{
                bad_rate++;
            }
        }
        double percentage_great = (double)great_rate / total_rate * 100;
        double percentage_good = (double)good_rate / total_rate * 100;
        double percentage_bad = (double)bad_rate / total_rate * 100;

        DecimalFormat toFormat = new DecimalFormat("#.##");

        percentage_great = Double.parseDouble(toFormat.format(percentage_great));
        percentage_good = Double.parseDouble(toFormat.format(percentage_good));
        percentage_bad = Double.parseDouble(toFormat.format(percentage_bad));

        double avarege = (great_rate + good_rate * 2 + bad_rate * 3) / total_rate;

        System.out.println(great_rate + " people answered Great\n" + percentage_great + "%");
        System.out.println(good_rate + " people answered Good\n" + percentage_good + "%");
        System.out.println(bad_rate + " people answered Bad\n" + percentage_bad + "%");
        System.out.println(total_rate + " people answered");
        System.out.println(avarege + " of avarege");

        scan.close();
    }
}
