package LambdaConcepts;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class StreamwithSetOfDevices {
    public static void main(String[] args) {
        Employee emp1= new Employee();
        emp1.setName("Anil");
        emp1.addDevices("Android");
        emp1.addDevices("Asus");
        emp1.addDevices("Windows");
        emp1.addDevices("SmartwatchS");
        Employee emp2 = new Employee();
        emp2.setName("Avinash");
        emp2.addDevices("Ios");
        emp2.addDevices("Acer");
        emp2.addDevices("Mac");
        emp2.addDevices("SmartwatchI");
        List<Employee> empList =new ArrayList<Employee>();
        empList.add(emp1);
        empList.add(emp2);
        List<String> deviceList=empList.stream()
                .map(x ->x.getDevices())
                .flatMap(x -> x.stream())
                .distinct()
                .collect(Collectors.toList());

        deviceList.forEach(x -> System.out.println(x));
    }
}
