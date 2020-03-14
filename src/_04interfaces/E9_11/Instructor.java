package _04interfaces.E9_11;

public class Instructor extends Person {
    private int salary;

    public Instructor(){
        salary = 0;
    }

    public Instructor (String fullName, int year, int curSalary){
        super.setName(fullName);
        super.setBirthYear(year);
        salary = curSalary;
    }

    public void setSalary(int curSalary) {
        salary = curSalary;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString(){
        return "The instructor "+getName()+" makes "+getSalary()+" dollars per month. He was born in "+getBirthYear();
    }

}
