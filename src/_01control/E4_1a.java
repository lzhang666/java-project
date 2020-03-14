package _01control;

public class E4_1a {
    public static void main(String[] args) {
        int evenSum = 0;
        for (int i = 2; i <= 100; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            }
        }
        System.out.println(evenSum);
    }
}
