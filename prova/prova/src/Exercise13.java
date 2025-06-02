import java.util.Scanner;

public class Exercise13 {
    static public void main(String... argv){
        Scanner scan = new Scanner(System.in);

        String userInput = scan.nextLine();

        String vowels = "aeiou";

        int vowelCount = 0;
        int consonantCount = 0;

        for (int idx = 0; idx < userInput.length(); idx++) {
            for (int idxChar = 0; idxChar < vowels.length(); idxChar++) {
                if (userInput.charAt(idx) == vowels.charAt(idxChar)){
                    vowelCount++;
                }else{
                    consonantCount++;
                }
            }
        }
        //System.out.println("Vowels: " + vowelCount + "\nConsonant: " + consonantCount);
    }
}
