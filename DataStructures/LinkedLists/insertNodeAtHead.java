static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
        SinglyLinkedListNode temp = new SinglyLinkedListNode(data);
        if(llist == null){
            llist = temp;
            return llist;
        }
        temp.next = llist;
        llist = temp;
        return llist;
    }
