static void printLinkedList(SinglyLinkedListNode head) {
        if(head == null)
            return;
        while(head != null){
            System.out.println(head.data);
            head = head.next;
        }
    }
