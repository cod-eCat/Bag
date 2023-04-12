import java.util.Iterator;

        // TODO: 4/12/2023
        /*
        Author @LwinPhyoAung
        add - O(1)
         */

public class LLBag<T> implements Iterable<T>{

    private class Node{
        private T item;
        private Node next;
        private Node(T item, Node next){
            this.item = item;
            this.next = next;
        }
    }

    private int N=0;
    private Node head;

    public void add(T e){
        if (head==null){
            head = new Node(e, null);
            N+=1;
            return;
        }
        head = new Node(e, head);
        N+=1;

    }

    public boolean isEmpty(){
        return N==0;
    }

    public int size(){
        return N;
    }

    @Override
    public Iterator<T> iterator() {
        return new myIterator();
    }

    private class myIterator implements Iterator<T>{

        Node current = head;

        @Override
        public boolean hasNext() {
            return current!=null;
        }

        @Override
        public T next() {
            T item = current.item;
            current = current.next;
            return item;
        }
    }

}
