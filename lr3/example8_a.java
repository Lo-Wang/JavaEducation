package lr3;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    // Ввод с головы
    public void createHead(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    // Ввод с хвоста
    public void createTail(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Вывод списка
    public String toString() {
        StringBuilder result = new StringBuilder();
        Node current = head;
        while (current != null) {
            result.append(current.data).append(" ");
            current = current.next;
        }
        return result.toString();
    }

    // Добавление элемента в начало списка
    public void addFirst(int data) {
        createHead(data);
    }

    // Добавление элемента в конец списка
    public void addLast(int data) {
        createTail(data);
    }

    // Вставка элемента в список с указанным номером
    public void insert(int index, int data) {
        if (index == 0) {
            createHead(data);
        } else {
            Node newNode = new Node(data);
            Node current = head;
            for (int i = 0; i < index - 1 && current != null; i++) {
                current = current.next;
            }
            if (current != null) {
                newNode.next = current.next;
                current.next = newNode;
            }
        }
    }

    // Удаление элемента с головы списка
    public void removeFirst() {
        if (head != null) {
            head = head.next;
        }
    }

    // Удаление последнего элемента списка
    public void removeLast() {
        if (head != null) {
            if (head.next == null) {
                head = null;
            } else {
                Node current = head;
                Node prev = null;
                while (current.next != null) {
                    prev = current;
                    current = current.next;
                }
                prev.next = null;
            }
        }
    }

    // Удаление из списка элемента с указанным номером
    public void remove(int index) {
        if (index == 0) {
            removeFirst();
        } else {
            Node current = head;
            Node prev = null;
            for (int i = 0; i < index && current != null; i++) {
                prev = current;
                current = current.next;
            }
            if (current != null) {
                prev.next = current.next;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Добавление элементов в список
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);

        // Вывод списка
        System.out.println("Список: " + list);

        // Вставка элемента на позицию 1
        list.insert(1, 10);
        System.out.println("Список после вставки: " + list);

        // Удаление элемента с головы списка
        list.removeFirst();
        System.out.println("Список после удаления первого элемента: " + list);

        // Удаление последнего элемента списка
        list.removeLast();
        System.out.println("Список после удаления последнего элемента: " + list);

        // Удаление элемента с позиции 1
        list.remove(1);
        System.out.println("Список после удаления элемента на позиции 1: " + list);
    }
}

