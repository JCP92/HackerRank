    static int getNode(SinglyLinkedListNode head, int positionFromTail) {
        if(head == null)
            return -1;
        
        SinglyLinkedListNode trail = head, nav = head;
        int n = 0;
        System.out.println(nav.data);
        while(nav.next != null){
            if(n >= positionFromTail){
                trail = trail.next;
            }
            nav = nav.next;
            n++;
        }
        return trail.data;
    }
