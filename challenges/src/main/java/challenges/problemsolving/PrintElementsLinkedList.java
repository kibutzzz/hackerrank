package challenges.problemsolving;

public class PrintElementsLinkedList {

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static void printLinkedList(SinglyLinkedListNode head) {

        while(true) {
            System.out.println(head.data);
            if(head.next == null) return;

            head = head.next;
        }


    }
}
