package _01control;

public class E4_1b {
    public static void main(String[] args) {
        int sumB = 0;
        for (int i = 1; i <= 100; i++) {
            sumB += Math.pow(i, 2);
        }
        System.out.println(sumB);
    }
}