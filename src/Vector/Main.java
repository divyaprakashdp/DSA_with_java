package Vector;

import arrayLists.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        //Vector is thread-safe version of ArrayList
        List<arrayLists.Employee> employeeList = new Vector<>();//default capacity is 10
        employeeList.add(new arrayLists.Employee("Raju", "Rastogi", 12));
        employeeList.add(new arrayLists.Employee("Ranchhod Das", "Chhanchar", 13));
        employeeList.add(new Employee("Ehsan", "Qureshi", 14));

        employeeList.remove(1);

//        employeeList.forEach(employee -> System.out.println(employee));

        employeeList.forEach(System.out::println);
    }
}
