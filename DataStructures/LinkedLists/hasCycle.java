static boolean hasCycle(SinglyLinkedListNode head) {
        Hashtable<SinglyLinkedListNode, Integer> references = new Hashtable<SinglyLinkedListNode, Integer>();
        SinglyLinkedListNode nav = head;
        while(nav != null){
            if(references.containsKey(nav))
                return true;
            references.put(nav, 1);
            nav = nav.next;
        }
        return false;
    }
