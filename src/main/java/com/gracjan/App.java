package com.gracjan;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        LinkedList<Integer> myList = new LinkedList<>();

        myList.addFirst(12);
        myList.addFirst(13);
        myList.addFirst(14);
        myList.addFirst(15);
        myList.addFirst(16);

        myList.display();
        myList.remove(0);
        myList.display();
//        myList.removeFirst();
//        myList.display();
//        myList.removeFirst();
//        myList.display();
    }
}
