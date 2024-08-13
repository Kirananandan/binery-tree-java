class Solution {
    public int print2largest(List<Integer> arr) {

        
        if(arr.size()<2){
            return -1;
        }
        
        int max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;
        
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)>max){
                second_max = max;
                max = arr.get(i);
            }else if(arr.get(i)>second_max && arr.get(i)!=max){
                second_max = arr.get(i);
            }
        }
        return second_max;
    }
}
