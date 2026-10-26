class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> comArr = new ArrayList<>();
        
        for(int i=0 ; i < nums1.length; i++){
            comArr.add(nums1[i]);
        }
        for(int i =0 ; i < nums2.length; i++){
            comArr.add(nums2[i]);
        }
        
        comArr.sort(null);
        
        int len = comArr.size();
        
        if(len%2==0){
            double n1 = comArr.get(len/2);
            double n2 = comArr.get((len/2)-1);
            double Median = (n1+n2)/2;

            return Median;
        }
        else{
            double Median = comArr.get(len/2);

            return Median;
        }
    }
}