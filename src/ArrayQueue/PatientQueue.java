package ArrayQueue;

import LinkedStack.Movies;

import java.util.NoSuchElementException;

public class PatientQueue {
    private Patients[] queue;
    private int first;
    private int last;

    public PatientQueue(int capacity) {
        queue = new Patients[capacity];
    }

    public void add(Patients patient){
        if(last == queue.length){
            int numItems = size();
            Patients[] newPatient = new Patients[2 * queue.length];

            System.arraycopy(queue, first, newPatient, 0, queue.length-first);
            System.arraycopy(queue, 0, newPatient, queue.length-first, last);

            queue = newPatient;

            first = 0;
            last= numItems;
        }

        queue[last] = patient;
        last++;
    }

    public Patients remove(){
        if(size()==0){
            throw new NoSuchElementException();
        }
        Patients patient = queue[first];
        queue[first] = null;
        first++;
        if(size()==0){
            first = 0;
            last = 0;
        }else if(first == queue.length){
            first = 0;
        }
        return patient;
    }

    public int size(){
        if(first <= last){
            return last-first;
        }else{
            return last-first+ queue.length;
        }

    }

    public Patients peek(){
        if(size()==0){
            throw new NoSuchElementException();
        }

        return queue[first];
    }

    public void printQueue(){
        if(first <= last){
            for (int i=first;i<last;i++){
                if(queue[i] != null){
                    System.out.println(queue[i]);
                }

            }
        }else {
            for(int j=first;j< queue.length;j++){
                System.out.println(queue[j]);
            }
            for (int k=0;k<last;k++){
                System.out.println(queue[k]);
            }
        }

    }
}
