    static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode nav1 = head1, nav2 = head2;
        
        while(nav1  != null && nav2 != null){
            if(nav1.data != nav2.data)
                return false;
            nav1 = nav1.next;
            nav2 = nav2.next;
        }
        if(nav1 == null && nav2 == null)
            return true;
        return false;
    }
