package HomeWorkPerson;

public class Person {
    int age;
    int height;
    int weight;
    String name;

    public Person(String name, int height, int weight, int age){

        this.name=name;
        this.age=age;
        this.height=height;
        this.weight=weight;

    }
    public Person(){

    }

    //behavior

    public static void describe(){
        System.out.println("I am a person");
    }

    public void daywork(){
        System.out.println("Person: has a job");

    }

    public void shop() {
        System.out.println("person: shops at Target");

    }


    public void eat() {
        System.out.println("person: eats at pizza");

    }
    public void rest(){
        System.out.println("persons: rests at home");

    }


}







