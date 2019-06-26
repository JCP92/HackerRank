static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode temp = new SinglyLinkedListNode(data);
        
        if(head == null){
            head = temp;
            return head;
        }
        
        SinglyLinkedListNode nav = head;
        
        while(nav.next != null){
            nav = nav.next;
        }

        nav.next = temp;

        return head;

    }
