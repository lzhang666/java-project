package _04interfaces.E9_11;

public class Student extends Person {
    private String major;

    public Student(){
        major = "";
    }

    public Student(String fullName, int year, String curMajor){
        super.setName(fullName);
        super.setBirthYear(year);
        major = curMajor;
    }

    public void setMajor(String curMajor) {
        major = curMajor;
    }

    public String getMajor(){
        return major;
    }

    @Override
    public String toString(){
        return getName() + " is a " + getMajor() + " major student. He was born in "+getBirthYear();
    }

}
