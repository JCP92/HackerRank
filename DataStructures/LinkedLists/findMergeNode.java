static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        Hashtable<SinglyLinkedListNode, Integer> references = new Hashtable<SinglyLinkedListNode, Integer>();
        SinglyLinkedListNode nav1 = head1, nav2 = head2;
        
        while(nav1 != null && nav2 != null){
            if(references.containsKey(nav1))
                return references.get(nav1);
            else references.put(nav1, nav1.data);
            if(references.containsKey(nav2))
                return references.get(nav2);
            else references.put(nav2, nav2.data);
            nav1 = nav1.next;
            nav2 = nav2.next;
        }
        if(nav1 == null && nav2 != null){
            return findMergeNodeHelper(nav2, references);
        } else if(nav2 == null && nav1 != null){
            return findMergeNodeHelper(nav1, references);
        }
        return -1;
    }
    static public int findMergeNodeHelper(SinglyLinkedListNode head, Hashtable<SinglyLinkedListNode, Integer> check){
        while(head != null){
            if(check.containsKey(head))
                return check.get(head);
            head = head.next;
        }
        return -1;
    }
