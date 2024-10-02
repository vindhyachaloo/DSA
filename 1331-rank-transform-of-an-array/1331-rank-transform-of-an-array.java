class Solution {
    public int[] arrayRankTransform(int[] arr) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        int [] arr1=Arrays.copyOf(arr,arr.length);
        Arrays.sort(arr1);
       int  count=1;
        for(int i=0;i<arr1.length;i++){
            if(i>0&&arr1[i]>arr1[i-1]){
                count++;
            }
            hm.put(arr1[i],count);
        }
        for(int i=0; i< arr.length; i++){
            arr[i]=hm.get(arr[i]);
        }
        return arr;
       
    }
}