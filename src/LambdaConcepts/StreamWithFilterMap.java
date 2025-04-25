package LambdaConcepts;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamWithFilterMap {

    public static void main(String[] args) {
        List<Customer> customers = Arrays.asList(new Customer("Sachin", 52),
                new Customer("Tom", 53),
                new Customer("Chivers", 52),
                new Customer("Anil", 36),
                new Customer("Ananth", 35),
                new Customer("Swamy", 54));
        //customers.forEach(System.out::println);
        customers.forEach(x -> System.out.println("Name "+x.getName()+"  Age "+x.getAge()));
        System.out.println(customers.stream().map(Customer::getName).collect(Collectors.toList()));
        System.out.println(customers.stream().map(Customer::getAge).collect(Collectors.toList()));

    }
}