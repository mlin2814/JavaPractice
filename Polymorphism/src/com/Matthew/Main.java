package com.Matthew;

class Car{
    private String name;
    private int cylinders;
    private int wheels;
    private boolean engine;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;
    }

    public String startEngine(){
        return "Start Engine";
    }

    public String accelerate(){
        return "Accelerating";
    }

    public String brake(){
        return "Braking";
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

}

class Mustang extends Car{
    public Mustang(String name, int cylinders) {
        super("Mustang", 6);
    }

    @Override
    public String startEngine() {
        return getName() + ": Start Engine";
    }
}

class Impala extends Car{
    public Impala(String name, int cylinders) {
        super("Impala", 5);
    }

    @Override
    public String brake() {
        return "Braking";
    }
}

class Accord extends Car{
    public Accord(String name, int cylinders) {
        super("Accord", 2);
    }

    @Override
    public String startEngine() {
        return getName() + ": Start Engine";
    }

    @Override
    public String accelerate() {
        return "Accelerating";
    }

    @Override
    public String brake() {
        return "Braking";
    }
}

//class Movie{
//    private String name;
//
//    public Movie(String name) {
//        this.name = name;
//    }
//
//    public String plot(){
//        return "No plot here";
//    }
//
//    public String getName() {
//        return name;
//    }
//}
//
//class Jaws extends Movie{
//    public Jaws(){
//        super("Jaws!");
//    }
//    public String plot(){
//        return "Shark eats people";
//    }
//}
//
//class IndependenceDay extends Movie{
//    public IndependenceDay() {
//        super("Independence Day");
//    }
//
//    @Override
//    public String plot() {
//        return "Aliens try to take over earth";
//    }
//}
//
//class Her extends Movie{
//    public Her() {
//        super("Her");
//    }
//
//    @Override
//    public String plot() {
//        return "Man falls in love with OS";
//    }
//}
//
//class StarWars extends Movie{
//    public StarWars() {
//        super("Star Wars");
//    }
//
//    @Override
//    public String plot() {
//        return "Rebel forces try to defeat the Empire";
//    }
//}
//
//class ForgettableMovie extends Movie{
//    public ForgettableMovie() {
//        super("Trash");
//    }
//}

public class Main {

    public static void main(String[] args) {
        Car car = new Car("Base model", 3);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mustang mustang = new Mustang("Mustang", 6);
        System.out.println(mustang.startEngine());

        Accord accord = new Accord("Accord", 3);
        System.out.println(accord.startEngine());

//
// for (int i = 1; i<11; i++){
//            Movie movie = randomMovie();
//            System.out.println("Movie # is " + i + ": " + movie.getName() + "\n" + " Plot: " + movie.plot() + "\n");
//        }
//    }
//
//    public static Movie randomMovie(){
//        int randomNumber = (int) (Math.random() * 5) + 1;
//        System.out.println(randomNumber + " was generated");
//        switch (randomNumber){
//            case 1:
//                return new Jaws();
//
//            case 2:
//                return new IndependenceDay();
//
//            case 3:
//                return new Her();
//
//            case 4:
//                return new StarWars();
//
//            case 5:
//                return new ForgettableMovie();
//        }
//        return null;
    }
}
