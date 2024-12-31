class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> m=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            m.add(nums[i]);
        }
       int[] a = new int[m.size()];
           int index = 0;
      for (int value : m) {
    a[index++] = value;
      }  
      Arrays.sort(a);
       
        if(a.length==1||a.length==3){
            return a[0];
        }
        if(a.length==2){
            return a[1];
        }
       
        return a[a.length-3];
    }
}