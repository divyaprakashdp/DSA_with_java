package DoublyLinkedList;

public class Main {

    public static void main(String[] args) {
        Employee janeJones = new Employee("jane","jones", 8789);
        Employee johnDoe = new Employee("john","Doe", 6879);
        Employee marySmith = new Employee("Mary","Smith", 2089);
        Employee mikeWilson = new Employee("mike","Wilson", 4489);
        Employee lastEmployee = new Employee("Liam","Wilson", 4989);

        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();
        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);

        list.addToTail(lastEmployee);

        list.removeFromFront();
        list.printList();
        System.out.println(list.getSize());
        System.out.println(list.isEmpty());


    }
}
