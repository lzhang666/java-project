package _06design.E12_4;

public abstract class Arithmetic {
    private int num1;
    private int num2;
    private int answer;
    private int score;
    private int count = 1;

    public void setNum1(int ranNum1){
        num1 = ranNum1;
    }

    public int getNum1(){
        return num1;
    }

    public void setNum2(int ranNum2){
        num2 = ranNum2;
    }

    public int getNum2(){
        return num2;
    }

    public void setAnswer(int ans) {
        answer = ans;
    }

    public int getAnswer(){
        return answer;
    }

//    public void setScore(int newScore){
//        score = newScore;
//    }
//
//    public void updateScore(){
//        score++;
//    }
//    public int getScore(){
//        return score;
//    }
//
//
//    public void setCount(int newCount){
//        count = newCount;
//    }
//    public void updateCount(){
//        count--;
//    }
//    public int getCount(){
//        return count;
//    }
//
//    public boolean compareResult(Arithmetic ques, int input){
//        if (input == answer) {
//            ques = new Level1Addition();
//            return true;
//        }
//        return false;
//    }



}
