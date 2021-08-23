package arrayLists;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();//default capacity is 10
        employeeList.add(new Employee("Raju", "Rastogi", 12));
        employeeList.add(new Employee("Ranchhod Das", "Chhanchar", 13));
        employeeList.add(new Employee("Ehsan", "Qureshi", 14));

//        employeeList.forEach(employee -> System.out.println(employee));
//
//        System.out.println(employeeList.get(1));
//
//        System.out.println(employeeList.isEmpty());

        employeeList.set(1, new Employee("Funshuk", "Wangadu", 789));
//        employeeList.forEach(employee -> System.out.println(employee));

        System.out.println(employeeList.size());

        employeeList.add(2, new Employee("John", "Doe", 7858));

//        employeeList.forEach(employee -> System.out.println(employee));

        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);

        for(Employee emp: employeeArray){
            System.out.println(emp);
        }

        System.out.println(employeeList.contains(new Employee("John", "Doe", 7858)));
        System.out.println(employeeList.indexOf(new Employee("John", "Doe", 7858)));

    }
}
