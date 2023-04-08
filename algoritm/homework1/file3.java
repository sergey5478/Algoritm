public class file3 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new LinkedListNode(1);
        list.head.next = new LinkedListNode(2);
        list.head.next.next = new LinkedListNode(3);
        list.head.next.next.next = new LinkedListNode(4);
        list.head.next.next.next.next = new LinkedListNode(5);

        System.out.println("Original list:");
        printList(list);

        list.reverse();

        System.out.println("Reversed list:");
        printList(list);
    }

    public static void printList(LinkedList list) {
        LinkedListNode currentNode = list.head;
        while (currentNode != null) {
            System.out.print(currentNode.value + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    public static class LinkedListNode {
        int value;
        LinkedListNode next;

        public LinkedListNode(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public static class LinkedList {
        LinkedListNode head;

        public void reverse() {
            LinkedListNode prev = null;
            LinkedListNode current = head;
            LinkedListNode next = null;
            while (current != null) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            head = prev;
        }
    }
}