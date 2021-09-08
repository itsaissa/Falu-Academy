package main.java;

import java.util.List;

/*
 * This class is used to keep track of the students, teachers, and finances of a school
 * */
public class School {

    /**
     * teachers - the school's list of teachers
     * students- the school's list of students
     * totalMoneyEarned - the amount of money earned by the school
     * totalMoneySpent - the amount of money spent by the school
     */
    private String name;
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;


    /**
     * Initialize a new schools
     * @param name - the school's name
     * @param teachers - the student's first name
     * @param students - the student's last name
     */
    public School(String name, List<Teacher> teachers, List<Student> students){
        this.name= name;
        this.teachers = teachers;
        this.students = students;
        this.totalMoneyEarned = 0;
        this.totalMoneySpent = 0;
    }
    /**
     * Get the school's name
     * @return the school's name
     */
    public String getName() {
        return name;
    }

    /**
     * Get the school's list of teahcers
     * @return the school's list of teachers
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * Get the school's lsit of students
     * @return the school's list of students
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * Get the school's total amount of money earned
     * @return the school's total amount of money earned
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * Get the school's total amount of money spent
     * @return the school's total amount of money spent
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * Add a teacher to the school
     * @param teacher - a new teacher to the school
     */
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     * Add a student to the school
     * @param student - a new student to the school
     */
    public void addStudent(Student student) {
        students.add(student);
    }


    /**
     * Update the money earned by the school
     * @param moneyEarned - the money earned by the school
     */
    public static void updateTotalMoneyEarned(int moneyEarned) {
        totalMoneyEarned += moneyEarned;
    }

    /**
     * Update the money spent by the school
     * @param moneySpent- the money spent by the school
     */
    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned -= moneySpent;
    }
}
