public class NumeroReverso {
    public static void main(String[] args) {
        for (int n = 100; n > 0; n--) {
            System.out.println(n);
        }
        System.out.println("\n-------------\n");
        int i = 100;
        while (i > 0) {
            System.out.println(i--);
        }
        System.out.println("\n-------------\n");
        int j = 100;
        do {
            System.out.println(j--);
        } while (j > 0);
    }
}
