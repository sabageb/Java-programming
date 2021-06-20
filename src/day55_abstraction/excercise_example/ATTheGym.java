package day55_abstraction.excercise_example;

public class ATTheGym {
    public static void main(String[] args) {
     Exercise exercise = new Running();
     Swimming swimming = new Swimming();
     FreeWeight freeWeight = new FreeWeight();


     exercise.start();
     exercise.perform();
        System.out.println("Running 30 min - colories  = " +exercise.getCaloriesCount(30));

        Exercise running = null;
        running.start();
        running.perform();
        System.out.println("Running 30 mins - calories = " + running.getCaloriesCount(30) );

        swimming.start();
        swimming.perform();
        System.out.println("Swimming 30 mins - calories = " + swimming.getCaloriesCount(30) );

        freeWeight.start();
        freeWeight.perform();
        System.out.println("Freight 30 mins - calories = " + freeWeight.getCaloriesCount(30) );

    }




    }

