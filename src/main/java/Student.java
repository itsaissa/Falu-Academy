package main.java;

/*
* This class is used to keep track of a student's name, grade, and fees
* */
public class Student {

    /**
     * @param id - the student's school id number
     * @param firstName - the student's first name
     * @param lastName - the student's last name
     * @param currentGrade - the student's current grade
     * @param feesPaid - the amount the student paid to the school
     * @param feesTotal - the amount the student currently needs to pay
     */
    private int id;
    private String firstName;
    private String lastName;
    private int currentGrade;
    private int feesPaid;
    private int feesTotal;

    /**
     * Initialize a new student
     * @param firstName - the student's first name
     * @param lastName - the student's last name
     * @param currentGrade - the student's current grade
     * A new student hasn't paid any fees, so the feesPaid is 0
     * The tuition for the schoolyear is $15,000, so the totalFees is 15000
     */
    public Student(String firstName, String lastName, int id, int currentGrade){
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.currentGrade = currentGrade;
        feesPaid = 0;
        feesTotal = 15000;
    }



    /**
     * Get the student's id number
     * @return the student's id number
     */
    public int getId() {
        return id;
    }
    /**
     * Get the student's full name
     * @return the student's first name and last name
     */
    public String getName() {
        return firstName + " " + lastName;
    }
    /**
     * Get the student's grade
     * @return the student's grade
     */
    public int getCurrentGrade() {
        return currentGrade;
    }
    /**
     * Get the student's paid fees
     * @return the student's paid fees
     */
    public int getFeesPaid() {
        return feesPaid;
    }
    /**
     * Get the student's total fees
     * @return the student's total fees
     */
    public int getFeesTotal() {
        return feesTotal;
    }
    /**
     * Used to update a student's grade
     * @param updatedGrade - the student's updated school grade
     */
    public void setCurrentGrade(int updatedGrade) {
        this.currentGrade = updatedGrade;
    }

    /**
     * Used to update a student's amount of fees paid
     * @param fees - the amount of money the student paid in fees
     */
    public void setFeesPaid(int fees) {
        feesPaid += fees;
    }

    /**
     * Increases the amount of fees paid
     * @param fees - the amount of fees the student is paying currently
     */
    public void payFees(int fees) {
        feesPaid += fees;
        School.updateTotalMoneyEarned(fees);
    }

    @Override
    public String toString() {
        return "Student's name: " + this.getName() + "\n" +
                "Total fees paid: $" +this.getFeesPaid();
    }
}
