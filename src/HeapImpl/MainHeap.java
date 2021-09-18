package HeapImpl;

public class MainHeap {
    public static void main(String[] args) {
        MaxHeap heap = new MaxHeap(10);
        heap.insert(80);
        heap.insert(75);
        heap.insert(68);
        heap.insert(55);
        heap.insert(40);
        heap.insert(52);
        heap.insert(67);

        heap.printHeap();

        heap.delete(1);

        heap.printHeap();
    }

}
