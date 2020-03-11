public class iLinkedList<T> {

    private static class Node<T> {
        T data;
        Node<T> next;
        Node(T d) {
            this.data = d;
            this.next = null;
        }
    }

    private Node<T> head;
    private Node<T> tail;
    private Node<T> ptr;

    private int size;

    public iLinkedList() {
        this.head = null;
        this.tail = null;
        this.ptr = null;
        this.size = 0;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void add(T d) {
        if (head == null) {
            head = new Node<T>(d);
            tail = head;
        } else {
            tail.next = new Node<T>(d);
            tail = tail.next;
        }
        ++size;
    }

    public void add(int i, T d) {
        if (head == null) {
            head = new Node<T>(d);
            tail = head;
            ++size;
            return;
        }

        if (i <= 0) {   //add front
            ptr = new Node<T>(d);
            ptr.next = head;
            head = ptr;
            ++size;
            return;
        }

        if (i >= size) { // add tail
            add(d);
            return;
        }

        // add middle
        int p = 0;
        Node<T> curr = head;
        Node<T> prev = head;
        while (p < i) {
            prev = curr;
            curr = curr.next;
            ++p;
        }
        prev.next = new Node<T>(d);
        prev.next.next = curr;
        ++size;
    }

    public T get(int i) {
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException("index out of range");
        }

        int p = 0;
        ptr = head;
        while (p != i) {
            ptr = ptr.next;
            ++p;
        }
        return ptr.data;
    }

    public void print() {
        ptr = head;
        while (ptr != null) {
            System.out.print(ptr.data + " ");
            ptr = ptr.next;
        }
        System.out.println();
    }
}
