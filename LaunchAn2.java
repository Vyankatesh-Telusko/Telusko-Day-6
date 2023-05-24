// Lambda Expression

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@FunctionalInterface
interface Demo{
    void disp(); // Method is by default Public and
    // void add();
    // Using @FunctionalInterface, defines that this is called by Lambda Function.
    // Not use any extra Abstract Method (Not more than one Method).
}


class Animal{
    public void eat(){
        System.out.println("Animal Eats");
    }
    public void animalAlwaysHuntsAndEat(){
        System.out.println("Hunt and Eat in Animal");
    }
}

class Tiger extends Animal{
    public void eat(){
        System.out.println("Tiger Hunts and Eat");
    }
    @Override
    public void animalAlwaysHuntsAndEat(){
        System.out.println("Hunt and Eat in Tiger");
    }
}

public class LaunchAn2 {
    public static void main(String[] args) {
        System.out.println("Hello");
        Demo d = ()->{
            // Require only one method, more than one may give error
            System.out.println("Lambda");
        };
        System.out.println(d);
        System.out.println();
//        @FunctionalInterface // Error : Retention Policy
//        void disp2(){
//
//        };

    }
}
