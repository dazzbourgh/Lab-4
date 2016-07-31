import java.lang.annotation.*;

/**
 * Created by Leonid on 28.07.2016.
 */
public class AtomicSubmarine {
    class Engine{
        public void dive(){
            System.out.println("Diving...");
        }
    }

    @FielAnnotation(info = "This is the engine")
    private Engine engine;

    public Engine getEngine() {
        return engine;
    }

    public static void main(String[] args){
        AtomicSubmarine submarine = new AtomicSubmarine();
        submarine.engine = submarine.new Engine();
        submarine.getEngine().dive();
    }
}

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@interface FielAnnotation{
    String info() default "";
}