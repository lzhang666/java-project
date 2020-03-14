package _02arrays;

public class E6_1 {

    public static void main(String[] args) {

        //initialize an empty array
        int[] arr = new int[10];

        //fill array with random numbers
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*10);
        }


        //1) print elements @ even index
        System.out.println("Every element at an even index:");
        for (int i = 0; i < arr.length; i+=2) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        //2) print even elements
        System.out.println("Every even element:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2 == 0){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();

        //3) reverse order
        System.out.println("All elements in reverse order:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        //4) 1st and last
        System.out.println("Only the first and last element:");
        System.out.println(arr[0]+" "+arr[arr.length - 1]);
    }
}