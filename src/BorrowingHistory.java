import java.util.ArrayList;
import java.util.List;

public class BorrowingHistory {

    private class Node {
        String borrower;
        Node next;
        Node(String borrower) { this.borrower = borrower; }
    }

    private Node head;

    public void addBorrower(String name) {
        Node node = new Node(name);
        if (head == null) head = node;
        else {
            Node current = head;
            while (current.next != null) current = current.next;
            current.next = node;
        }
    }

    public List<String> getBorrowers() {
        List<String> list = new ArrayList<>();
        Node current = head;
        while (current != null) {
            list.add(current.borrower);
            current = current.next;
        }
        return list;
    }
}
