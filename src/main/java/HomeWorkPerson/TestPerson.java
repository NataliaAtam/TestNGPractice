package HomeWorkPerson;


public class TestPerson extends Person {

    public static void main(String[] args) {

        Person p = new Person("Natalia",160, 5,25);
        Employee e = new Employee(120, 200.00, 3);
        System.out.println("This is the name of the person: " +p.name);
        System.out.println("This is the salary of the Employee: " + e.Salary);
        p.daywork();
        p.shop();
        p.eat();
        p.rest();



    }


}

