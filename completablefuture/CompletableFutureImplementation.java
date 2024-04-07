import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Supplier;

public class CompletableFutureImplementation {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Supplier<String> mysupplier = () -> {
            try {
                Thread.sleep(3000); // Simulate some computation
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "I am a hunter u want to see my gun";
        };


        CompletableFuture<String> completableFuture1 = CompletableFuture.
                supplyAsync(mysupplier, executorService);
        completableFuture1.thenAccept(res -> System.out.println(res));

        CompletableFuture<String> completableFuture2 = CompletableFuture.
                supplyAsync(mysupplier, executorService);
        completableFuture2 = completableFuture2.thenApply(res -> res + ". I have bullets loaded");
        completableFuture2.thenAccept(res -> System.out.println(res));


        CompletableFuture<String> completableFuture3 = CompletableFuture.
                supplyAsync(mysupplier, executorService);
        completableFuture3.thenAccept(res -> System.out.println(res));


        CompletableFuture<String> completableFuture4 = completableFuture3.thenCombine(completableFuture2,
                (res1, res2) -> res1 + " " + res2);
        //System.out.println(completableFuture4.get());
        completableFuture4.thenAccept(res -> System.out.println(res));

        System.out.println("LOLI SEXY HAI");
        executorService.shutdown();

    }
}
