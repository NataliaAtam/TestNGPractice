package HomeWorkPerson;



    public class Student extends Person {

        int Mark;
        int Grade;
        int HasHomeWork;

        //behavior

        public void CanBePromoted(){
            System.out.println("Student transfers to another class");
        }


        @Override
        public void daywork(){
            System.out.println("Student: unemployed");

        }
        @Override
        public void shop() {
            System.out.println("Student: shops Walmart");

        }

        @Override
        public void eat() {
            System.out.println("Student: eats at Mackdonalds");

        }

        @Override
        public void rest(){
            System.out.println("persons: rests at dorm");

        }


    }




