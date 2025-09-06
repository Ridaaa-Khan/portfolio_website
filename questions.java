// import java.util.Scanner;

// public class questions {
//     public static int summ(){
//         Scanner sc = new Scanner(System.in);

//         int sum = 0;

//         while (true) {
//             String input = sc.next();
//             if (input.equals("x")) {
//                 break;
//             }
//             try {
//                 int num = Integer.parseInt(input);
//                 sum += num;
//             } catch (NumberFormatException e) {
//                 System.out.println("try again");
//             }

//         }
//         return sum;
//     }

//     public static int advancedbs(int [] arr, int target){
//         if(arr.length==0){
//             return -1;
//         }

//         int s = 0;
//         int e = arr.length-1;

//         while(s<=e){
//             int mid = s+(e-s)/2;

//             if(mid == target){
//                 return mid;
//             }
//             else if(target>arr[mid]){
//                 s = mid+1;
//             }
//             else{
//                 e = mid-1;
//             }
//         }
//         // return s;//for the ceiling of the array
//         return e;
//         // for the floor of the array
//     }

//     public static void main(String[] args) {
//         int[] arr = {1,1,1,1};
//         System.out.println(numIdenticalPairs(arr));
        
//     }

//     public static int numIdenticalPairs(int[] nums) {
//         int count = 0;
//         for(int i = 0; i<nums.length-1;i++){
//             for(int j = i+1;j<nums.length;j++){
//                 if(nums[j]==nums[i]){
//                     count +=1;
//                 }
//             }
//         }
//         return count;
        
//     }

// }

public class questions{
    public static void main(String[] args) {
        int c = 'A'+0;
        System.out.println(c);
    }
}
