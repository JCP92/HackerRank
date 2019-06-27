    static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
        SinglyLinkedListNode reverseIt = null, temp = null;
        SinglyLinkedListNode nav = head;

        while(nav != null){
            System.out.println(head.data);
            temp = nav;
            nav = nav.next;

            temp.next = reverseIt;
            reverseIt = temp;
        }
        return reverseIt;

    }
    static SinglyLinkedListNode reverseHelper(SinglyLinkedListNode head, SinglyLinkedListNode newList){

        if(head == null || head.next == null)
           return newList;
        
        newList = reverseHelper(head.next, newList);
        
        if(newList == null){
            newList = head;
            return newList;
        }

        SinglyLinkedListNode nav = newList;
        
        while(nav.next != null)
            nav = nav.next;
        
        nav.next = head;

        return newList;
    }
