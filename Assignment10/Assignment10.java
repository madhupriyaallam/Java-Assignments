package Java.Assignment10;
import java.util.Scanner;

class Node<E> {
    E info = null;
    Node<E> next = null;
    Node() {}
    Node(E value) {
        info = value;
    }
    public boolean hasNext() {
        return (next != null);
    }
    public Node<E> getNext() {
        return next;
    }
    public void setNext(Node<E> node) {
        next = node;
    }
    public E getInfo() {
        return info;
    }
    public E setInfo(E value) {
        E old = getInfo();
        info = value;
        return old;
    }
}

interface SListIterator<E> {
    public boolean hasNext();
    public E next();
    public void add(E ele);
    public void remove();
}
class SList<E> {
    private Node<E> head = new Node<E>();
    public String toString() {
        SListIterator<E> ite = iterator();
        StringBuilder result = new StringBuilder("{");
        while (ite.hasNext()) {
            result.append(ite.next().toString());
            if (ite.hasNext()) {
                result.append(",");
            }
        }
        result.append("}");
        return result.toString();
    }
    public SListIterator<E> iterator() {
        return new SListIterator<E>() {
            Node<E> cursor = head;
            Node<E> next = null;
            public boolean hasNext() {
                return cursor.hasNext();
            }
            public E next() {
                if (!hasNext()) {
                    throw new RuntimeException("Doesn't have next element!");
                }
                next = cursor;
                cursor = cursor.getNext();
                return cursor.getInfo();
            }
            public void add(E ele) {
                Node<E> nextNode = cursor.getNext();
                Node<E> newNode = new Node<E>(ele);
                cursor.setNext(newNode);
                newNode.setNext(nextNode);
                next = cursor;
                cursor = newNode;
            }
            public void remove() {
                if (cursor == head) {
                    throw new RuntimeException("Cursor is at head!");
                }
                if (cursor == next) {
                    throw new RuntimeException("can only be made once per call to next!");
                }
                next.setNext(cursor.getNext());
                cursor.setNext(null);
                cursor = next;
            }
        };
    }
}
public class Assignment10 {
    public static void main(String[] args) {
        SList<String> myList = new SList<String>();
        SListIterator<String> ite = myList.iterator();
        for (int i = 0; i < 10; i++) {
            ite.add(String.valueOf(i));
        }
        System.out.println(myList);
        ite = myList.iterator();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size");
        int size=sc.nextInt();
        for (int i = 0; i < size; i++) {
            ite.next();
            ite.remove();
        }
        System.out.println(myList);
    }
}
