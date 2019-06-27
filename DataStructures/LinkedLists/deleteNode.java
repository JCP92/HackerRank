    static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
        if(head == null || position == 0 && head.next == null){
            head = null;
            return head;
        }
        
        if(position == 0){
            head = head.next;
            return head;
        }

        SinglyLinkedListNode nav = head;
        for(int i = 1; i < position && nav.next != null; i++)
            nav = nav.next;

        SinglyLinkedListNode temp = nav.next.next;
        nav.next.next = null;
        nav.next = temp;

        return head;

    }
