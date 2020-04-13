package List;

public class MyList {

    private Node head;

    public class Node {

        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public void add(int data) {
        Node node = new Node(data);

        if (head == null) {
            head = node;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
    }

    public void add(int data, int index) {
        Node node = new Node(data);

        if (head == null) {
            head = node;
        } else {
            Node current = head;
            int counter = 0;
            while (current.next != null && (index - 1) != counter) {
                current = current.next;
                counter++;
            }
            Node next = current.next;
            current.next = node;
            node.next = next;
        }
    }

    public void set(int data, int index) {
        Node node = new Node(data);
        Node current = head;
        int counter = 0;

        if (index == 0) {
            head.data = node.data;
            return;

        } else if (index == 1) {
            current = current.next;
            current.data = node.data;
            return;
        }

        while (current.next != null && index != counter) {
            current = current.next;
            counter++;
        }
        current.data = node.data;
    }

    public int get(int index) {
        Node current = head;
        int data;
        int counter = 0;

        while (current.next != null && index != counter) {
            current = current.next;
            counter++;
        }

        data = current.data;
        return data;
    }

    public void remove(int index) {
        Node current = head;
        Node previous = head;

        if (index == 0) {
            head = current.next;

        } else {
            int counter = 1;
            while (previous.next != null && index != counter) {
                previous = previous.next;
                counter++;
            }

            counter = 0;

            while (current.next != null && index != counter) {
                current = current.next;
                counter++;
            }

            previous.next = current.next;
        }
    }

    public void print() {
        Node current = head;

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}

