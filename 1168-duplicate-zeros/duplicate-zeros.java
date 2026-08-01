class Solution {
    public void duplicateZeros(int[] arr) {
        int i = arr.length - 1;
        int count = 0;
        for(int p : arr){
            if(p == 0){
                count += 1;
            }
        }

        int j = i + count;

        while(i >= 0){
            if(arr[i] == 0 ){
                if(j < arr.length ){
                   arr[j] = 0;
                }
                j--;
                if(j < arr.length){
                    arr[j] = 0;
                }
                j--;
                i--;
            }
            else{
                if(j < arr.length){
                    arr[j] = arr[i];
                }
                i--;
                j--;
            }
        }

        System.out.print(Arrays.toString(arr));
    }
}