public class Driver {
    public static void main(String[] args) {

        iLinkedList<Integer> list = new iLinkedList<>();

        for (int i = 0; i < 10; ++i) {
            list.add(i);
        }

        list.print();               // 0 1 2 3 4 5 6 7 8 9
        list.add(0, 0);
        list.add(11, 9);
        list.print();               // 0 0 1 2 3 4 5 6 7 8 9 9
        list.add(2, 1);
        list.print();               // 0 0 1 1 2 3 4 5 6 7 8 9 9

    }
}
