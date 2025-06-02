import java.util.Scanner;

public class Exercise14 {
    static public void main(String... argv){
        Scanner scan = new Scanner(System.in);

        double angle = scan.nextDouble();

        double radianAngle = Math.toRadians(angle);

        System.out.println(angle + radianAngle);

        System.out.println("Sine: " + Math.sin(radianAngle));
        System.out.println("Cosine: " + Math.cos(radianAngle));
        System.out.println("Tangent: " + Math.tan(radianAngle));
    }
}
