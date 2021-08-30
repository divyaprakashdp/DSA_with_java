package DoublyLinkedList;

public class EmployeeDoublyLinkedList {

    private EmployeeNode head;
    private EmployeeNode tail;
//    private EmployeeNode next;
    private int size;

    public void addToFront(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        if(head==null){
            tail=node;
        }else{
            head.setPrevious(node);
        }
        head = node;
        size++;
    }

    public void addToTail(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);
        if(tail == null){
            head = node;
        }else{
            tail.setNext(node);
            node.setPrevious(tail);
        }

        tail=node;
        size++;

    }

    public boolean addBefore(Employee newEmployee, Employee oldEmployee){
        if(head == null){
            return false;
        }

        EmployeeNode current = head;
        while(current != null && !current.getEmployee().equals(oldEmployee)){
            current=current.getNext();
        }

        if(current == null){
            return false;
        }


        EmployeeNode newNode = new EmployeeNode(newEmployee);
        newNode.setNext(current);
        newNode.setPrevious(current.getPrevious());
        current.setPrevious(newNode);

        if(head == current){
            head = newNode;
        }
        else{
            newNode.getPrevious().setNext(newNode);
        }

        size++;
        return  true;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public EmployeeNode removeFromFront(){
        if(isEmpty()){
            return null;
        }

        EmployeeNode removeNode = head;

        if(head.getNext() == null){
            tail = null;
        }else{
            head.getNext().setPrevious(null);
        }

        head = head.getNext();
        size--;
        removeNode.setNext(null);
        return removeNode;

    }

    public void printList(){
        EmployeeNode current = head;
        System.out.print("HEAD -> ");
        while(current != null){
            System.out.print(current);
            System.out.print(" <-> ");
            current = current.getNext();
        }
        System.out.print("null");
        System.out.println("");
    }
}
