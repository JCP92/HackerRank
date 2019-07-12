    static int sherlockAndAnagrams(String s) {
        HashMap<String, Integer> letterCount = new HashMap<String, Integer>();
        HashMap<String, Integer> counter = new HashMap<String, Integer>();
        int count = 0;

        for(int i = 0; i < s.length(); i++){ // length
            char[] arr = new char[s.length()];
            for(int j = i, m = 0; j < s.length(); j++){ //letter
                arr[m] = s.charAt(j);
                //sort            
                Arrays.sort(arr);
                String insert = new String(arr);

                if(letterCount.containsKey(insert) && counter.containsKey(insert)){
                    counter.put(insert, counter.get(insert) + 1);
                }else if(letterCount.containsKey(insert) && !counter.containsKey(insert))
                    counter.put(insert, 2);
                else
                    letterCount.put(insert, 1);
            }
        }
        for(String i : counter.keySet()){
            int num = counter.get(i);            
            count += num * (num-1)/2;
        }
        return count;
    }
