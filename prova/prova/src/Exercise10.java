public class Exercise10 {
    static public void main(String... argv) {
        for (int idx = 1; idx <= 10; idx++) {
            if (idx == 5) {
                continue;
            }
            System.out.println(idx);
        }
    }
}
