package main.java;

/*
 * This class is used to keep track of a teacher's name, id, and salary
*/
public class Teacher {

    /**
     * @param id - the teacher's school id number
     * @param firstName - the teacher's first name
     * @param lastName - the teacher's last name
     * @param salary - the teacher's salary from the school
     * @param salaryEarned - the salary earned from the school
     */
    private int id;
    private String firstName;
    private String lastName;
    private int salary;
    private int salaryEarned;

    /**
     * Initialize a new teacher
     * @param firstName - the teacher's first name
     * @param lastName - the teacher's last name
     * @param id - the teacher's school id
     * @param initialSalary - the teacher's starting salary at the school
     */
    public Teacher(String firstName, String lastName, int id, int initialSalary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.salary = initialSalary;
        this.salaryEarned = 0;
    }

     /**
      * Get the teachers full name
      * @return the first and last name of a teacher
      */
    public String getName() {
        return firstName + " " + lastName;
    }

    /**
     * Get the teacher's id number
     * @return the teacher's id number
     */
    public int getID() {
        return id;
    }

    /**
     * Get the teacher's yearly salary
     * @return the teacher's salary
     */
    public int getSalary() {
        return salary;
    }

    /**
     * Update the teacher's yearly salary
     * @param newSalary - the teachers new salary
     */
    public void setNewSalary(int newSalary){
        this.salary = newSalary;
    }

    /**
     * Receive salary from school
     * @param salary - the salary received from the school
     */
    public void receiveSalary(int salary){
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        return "Teahcers's name: " + this.getName() + "\n" +
                "Yearly salary earned so far: $" + salaryEarned;
    }
}
