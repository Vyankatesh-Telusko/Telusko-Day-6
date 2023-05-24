import java.lang.annotation.*;

@Target({ElementType.FIELD, ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface CricketPlayer{
    int age() default 34;
    String country() default "India";

}

// Simple Comment

// @CricketPlayer(country = "India", age = 40)
@CricketPlayer
class Virat{

    @CricketPlayer // Use of ElementType.FIELD is there to use @ here.
    int runs;
    int innings;

    @CricketPlayer // Use of Element.Type.METHODS
    public void setRuns(int runs){
        this.runs = runs;
    }

    public void setInnings(int innings){
        this.innings = innings;
    }

    public int getRuns(){
        return runs;
    }

    public int getInnings(){
        return innings;
    }

}



class LaunchAn {

    public static void main(String[] args) {

        System.out.println("Hello");

        Virat v = new Virat();
        v.setRuns(15000);
        v.setInnings(250);

        System.out.println(v.getRuns());
        System.out.println(v.getInnings());
        System.out.println("===========");

        System.out.println("Get Annotations values fetched below using Reflection API");
        Class<?> c = v.getClass();
        Annotation annotation = c.getAnnotation(CricketPlayer.class);
        CricketPlayer cp = (CricketPlayer) annotation;
        System.out.println("Age: " + cp.age());
        System.out.println("Country: " + cp.country());



    }
}
