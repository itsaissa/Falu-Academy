package main.java;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[]args){
        Teacher john = new Teacher("John","Smith",1,500 );
        Teacher michael = new Teacher("Michael","Von",2,500 );
        Teacher tamil = new Teacher("Tamil","Gurayva",3,500 );

        List<Teacher> teacherList = new ArrayList<Teacher>();
        teacherList.add(john);
        teacherList.add(michael);
        teacherList.add(tamil);

        Student amy = new Student("Amy","Whitehouse",1, 5);
        Student ronald = new Student("Ronald","Lionel",2, 1);
        Student yusuf = new Student("Yusuf","Stevens",3, 2);

        List<Student> studentList = new ArrayList<Student>();
        studentList.add(amy);
        studentList.add(ronald);
        studentList.add(yusuf);

        School falu = new School("Falu Academy", teacherList, studentList);
        System.out.println(falu.getTotalMoneyEarned());

        amy.payFees(5000);
        yusuf.payFees(6000);
        System.out.println("Falu School has $" + falu.getTotalMoneyEarned());
        john.receiveSalary(john.getSalary());
        System.out.println("Falu School now has $" + falu.getTotalMoneyEarned());

        System.out.println(michael);
    }
}
