static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {
        if(head == null)
            return head;
        DoublyLinkedListNode nav = head, temp = null, newNode = new DoublyLinkedListNode(data);
        while(nav.next != null && nav.data < data)
            nav = nav.next;
        
        if(nav.prev == null){
            newNode.next = nav;
            nav.prev = newNode;
            head = newNode;
        }
        else if(nav.next == null && nav.data < data){
            nav.next = newNode;
            newNode.prev = nav;
        }else{
            temp = nav.prev;
            newNode.prev = temp;
            temp.next = newNode;
            nav.prev = newNode;
            newNode.next = nav;
        }
        return head;
    }
