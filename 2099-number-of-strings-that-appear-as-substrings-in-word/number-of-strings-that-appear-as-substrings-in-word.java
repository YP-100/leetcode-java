import java.util.Scanner;

class Solution {
    public static int numOfStrings(String[] patterns, String word) {
        int num = 0;
        for(String i : patterns){
            if(word.contains(i)){
                num++;
            }
        }
        return num;
    }
    public static void main(String[] args) {
//         1 <= patterns.length <= 100
// 1 <= patterns[i].length <= 100
// 1 <= word.length <= 100
// patterns[i] and word consist of lowercase English letters.

        Scanner sc = new Scanner(System.in);
        int l;
        System.out.println("Enter no of patterns to add in the array: ");
        l = sc.nextInt();
        if(l>100 || 1<0){
            System.out.println("Ops the length is not acceptable !");
        }
        else{
            String[] patterns = new String[l];
            for(int i=0;i<l;i++){
                System.out.printf("Enter the %d th element : \n",i+1);
                String con = sc.next().toLowerCase();
                patterns[i] = con;
            }
            System.out.println("Enter the word to check : ");
            String word = sc.next().toLowerCase();

            System.out.println(numOfStrings(patterns, word));
            
        }




    }
}