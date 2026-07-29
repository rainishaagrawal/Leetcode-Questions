class MyLinkedList {
    class Node {
        int val;
        Node prev;
        Node next;
        Node(int val) {
            this.val = val;
        }
    }
    Node head;
    Node tail;
    int size;
    public MyLinkedList() {
        head = new Node(-1); 
        tail = new Node(-1); 
        head.next = tail;
        tail.prev = head;
        size = 0;
    }
    public int get(int index) {
        if (index < 0 || index >= size)
            return -1;
        Node curr;
        if (index < size / 2) {
            curr = head.next;
            for (int i = 0; i < index; i++)
                curr = curr.next;
        } else {
            curr = tail.prev;
            for (int i = size - 1; i > index; i--)
                curr = curr.prev;
        }
        return curr.val;
    }
    public void addAtHead(int val) {
        addBetween(head, head.next, val);
    }
    public void addAtTail(int val) {
        addBetween(tail.prev, tail, val);
    }
    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size)
            return;
        Node prevNode;
        Node nextNode;
        if (index < size / 2) {
            prevNode = head;
            for (int i = 0; i < index; i++)
                prevNode = prevNode.next;
            nextNode = prevNode.next;
        } else {
            nextNode = tail;
            for (int i = size; i > index; i--)
                nextNode = nextNode.prev;
            prevNode = nextNode.prev;
        }
        addBetween(prevNode, nextNode, val);
    }
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size)
            return;
        Node curr;
        if (index < size / 2) {
            curr = head.next;
            for (int i = 0; i < index; i++)
                curr = curr.next;
        } else {
            curr = tail.prev;
            for (int i = size - 1; i > index; i--)
                curr = curr.prev;
        }
        curr.prev.next = curr.next;
        curr.next.prev = curr.prev;
        size--;
    }

    private void addBetween(Node prevNode, Node nextNode, int val) {
        Node node = new Node(val);
        node.prev = prevNode;
        node.next = nextNode;
        prevNode.next = node;
        nextNode.prev = node;
        size++;
    }
}