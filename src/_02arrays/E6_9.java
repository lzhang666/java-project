package _02arrays;

public class E6_9 {

    public static boolean equals(int[] a, int[] b){
        if (a.length != b.length){
            return false;
        }
        else{
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        int[] b = {1,2,3,4,5,6};

        if(equals(a, b)){
            System.out.println("The arrays are equal.");
        }
        else{
            System.out.println("The arrays are not equal.");
        }
    }
}
