package HomeWorkPerson;

import java.util.Scanner;

public class Employee extends Person {

    double Salary;
    double Bonus;
    int Years;

    public Employee(double Salary, double Bonus, int Years) {

        super();
        this.Salary = Salary;
        this.Bonus = Bonus;
        this.Years = Years;

    }





    public void getMerritRaise(double salary) {
        System.out.println("Please enter the number of years of experience: ");
        Scanner give = new Scanner(System.in);
        int years = give.nextInt();
        double meritraise = years * 0.1 * salary;
        System.out.println("Employee merittraise is " + meritraise);




    }

}

