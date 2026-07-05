package day1;


public class RecurssionDemo { //methods should be declared inside the class but outside the main method

    public static void print(){
            System.out.println("Hello");
            print();
    }
    public static void main(String[] args) { // main method declared inside the class
        print();

        //main method runs without creating an object so it can only call methods which are static

    }
}



