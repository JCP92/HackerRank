    static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode head) {
        if(head.next == null || head == null)
            return head;
        SinglyLinkedListNode prev = head, nav = head.next, temp = null;

        while(nav != null){
            if(prev.data == nav.data){
                temp = nav;
                nav = nav.next;
                prev.next = nav;
            }else{
                prev = nav;
                nav = nav.next;
            }
        }
        return head;

    }
