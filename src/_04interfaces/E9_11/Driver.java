package _04interfaces.E9_11;



public class Driver {

    public static void main(String[] args) {

        Person p1 = new Person();

        p1.setName("Donald Duck");
        p1.setBirthYear(2000);
        System.out.println(p1);

        Student s1 = new Student("Justin", 1990, "Economics");
        System.out.println(s1);


        Instructor i1 = new Instructor();
        i1.setName("David");
        i1.setBirthYear(1980);
        i1.setSalary(20000);
        System.out.println(i1);
    }



}
