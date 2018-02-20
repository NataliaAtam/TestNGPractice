public class Manager {

private String name;
private int age;
private int salary;
private int exp;

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public Manager(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Manager(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;


    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public double getBonus(int exp){
        double bonus = 0;
        if(exp > 10){
            bonus = salary * .15;
        }else {
            bonus = salary * .10;
        }
        return bonus;
    }


}