package lr3;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class RecursiveLinkedList {
    private Node head;

    // Ввод с головы с использованием рекурсии
    public void createHeadRec(int data) {
        head = createHeadRecHelper(head, data);
    }

    private Node createHeadRecHelper(Node current, int data) {
        if (current == null) {
            return new Node(data);
        }
        current.next = createHeadRecHelper(current.next, data);
        return current;
    }

    // Ввод с хвоста с использованием рекурсии
    public void createTailRec(int data) {
        if (head == null) {
            head = new Node(data);
        } else {
            createTailRecHelper(head, data);
        }
    }

    private void createTailRecHelper(Node current, int data) {
        if (current.next == null) {
            current.next = new Node(data);
        } else {
            createTailRecHelper(current.next, data);
        }
    }

    // Вывод списка в виде строки с использованием рекурсии
    public String toStringRec() {
        return toStringRecHelper(head);
    }

    private String toStringRecHelper(Node current) {
        if (current == null) {
            return "";
        }
        if (current.next == null) {
            return String.valueOf(current.data);
        }
        return current.data + " -> " + toStringRecHelper(current.next);
    }

    public static void main(String[] args) {
        RecursiveLinkedList list = new RecursiveLinkedList();

        // Ввод с головы
        list.createHeadRec(3);
        list.createHeadRec(2);
        list.createHeadRec(1);

        // Вывод списка
        System.out.println("Список: " + list.toStringRec());

        // Ввод с хвоста
        list.createTailRec(4);
        list.createTailRec(5);

        // Вывод списка
        System.out.println("Список после ввода с хвоста: " + list.toStringRec());
    }
}

