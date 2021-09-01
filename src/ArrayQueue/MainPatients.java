package ArrayQueue;

public class MainPatients {
    public static void main(String[] args) {
        Patients first = new Patients("Sharma", "Headache", 56);
        Patients second = new Patients("Verma", "High BP", 65);
        Patients third = new Patients("Jha", "Constipation", 44);

        PatientQueue queue = new PatientQueue(5);

        queue.add(first);
        queue.add(second);
        queue.add(third);

        queue.printQueue();

        queue.remove();

        queue.printQueue();

        System.out.println(queue.peek());
    }
}
