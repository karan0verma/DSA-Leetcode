class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n= nums2.length;
        HashMap<Integer,Integer>map= new HashMap<>();
        Stack < Integer> stack = new Stack<>();
        for( int i=n-1;i>=0;i--)
        {
            int current=nums2[i];
            if(stack.isEmpty())
            {
                map.put(current ,-1);
            }
            else if(!stack.isEmpty() && stack.peek()>current)
            {
                map.put(current , stack.peek());
            }
            else if(!stack.isEmpty() && stack.peek()<=current)
            {
                while(!stack.isEmpty() && stack.peek()<=current)
                {
                    stack.pop();
                }
                if(stack.isEmpty())
                {
                    map.put(current ,-1);
                }
                else {
                    map.put(current, stack.peek());
                }
            }
            stack.push(current);
        }
        int[] finalans=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            finalans[i]=map.get(nums1[i]);
        }
        return finalans;
    }
}