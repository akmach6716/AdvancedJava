package LambdaConcepts;

import java.util.Arrays;
import java.util.List;

public class LambdaFilter {
    public static void main (String[] args)
    {
        List<Customer> customersList =Arrays.asList(new Customer("Sachin", 52),
                new Customer("Sourav", 53) ,
                new Customer("Dravid", 52),
                new Customer("Rohit", 36),
                new Customer("Virat", 35));
        customersList.forEach(x -> System.out.println("Name : "+x.getName()+"  Age "+x.getAge()));

    }
}
