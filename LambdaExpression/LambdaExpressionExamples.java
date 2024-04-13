import java.util.function.*;

public class LambdaExpressionExamples {

    public static void main(String[] args)
    {
        Consumer<String> consumerlambda = i ->{
                System.out.println(i);
                };
        consumerlambda.accept("Hello Bro");

        Supplier<String> supplierLambda = () -> "bye";
        System.out.println(supplierLambda.get());


        Function<Integer, String> functionLambda = (i)-> {
            return "function with "+ i + " argument";
        };
        System.out.println(functionLambda.apply(1));

        BiFunction<Integer, Integer, String> biFunctionLambda = (a,b)->{
            return "sum of two nums is "+ (a+b);
        };
        System.out.println(biFunctionLambda.apply(1,2));

        Predicate<Integer> predicateLambda = (a) -> {
            if(a > 10)
                return true;
            return false;
        };
        System.out.println("I am Greater than 10 "+predicateLambda.test(11));
    }
}
