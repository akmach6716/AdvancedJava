package LambdaConcepts;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class SequentialStreams {
    public static void main(String[] args) {
        Stream stream1=Stream.of("Anil", "Aviansh","Surya","Ravi","Virat","Rohit");
        //stream1.forEach(System.out::println);
       // Arrays.asList("a4","a2","a3").stream().findFirst().ifPresent(System.out::println);
        //intstream with range
        //IntStream.range(1,5).forEach(System.out::println);
        //Directing passing newly created arrays to the stream and print them by applying condition
        System.out.println(Arrays.stream(new int[] {1,2,3,4,5,8}).map(x -> 2*x +1).count());





    }
}
