    static void reversePrint(SinglyLinkedListNode head) {
        if(head == null)
            return;
        reversePrint(head.next);
        System.out.println(head.data);

    }
