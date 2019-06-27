    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
        SinglyLinkedListNode temp = new SinglyLinkedListNode(data);
        
        if(head == null){
            head = temp;
            return head;
        }
        if(position == 0){
            temp.next = head;
            head = temp;
            return head;
        }

        SinglyLinkedListNode nav = head;

        for(int i = 0; i < position - 1 && nav.next != null; i++){
            nav = nav.next;
        }

        temp.next = nav.next;
        nav.next = temp;
        return head;
    }
