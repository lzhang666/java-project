package _02arrays;

public class P5_24 {

    public static int value(Character romNum){
        if(romNum == 'M')
            return 1000;
        else if(romNum == 'D')
            return 500;
        else if(romNum == 'C')
            return 100;
        else if(romNum == 'L')
            return 50;
        else if(romNum == 'X')
            return 10;
        else if(romNum == 'V')
            return 5;
        else if(romNum == 'I')
            return 1;
        return 0;
    }

    public static void main(String[] args) {
        int total = 0;
        String rom = "MCMLXXVIII";
        String str = rom;

        while (str.length()>0){
            if (str.length()==1 || value(str.charAt(0)) >= value(str.charAt(1))){
                total += value(str.charAt(0));
                str = str.substring(1);
            }
            else{
                int diff = value(str.charAt(1)) - value(str.charAt(0));
                total += diff;
                str = str.substring(2);
            }
        }
        System.out.println("the Roman number "+ rom + " converts to decimal number: " + total);
    }
}
