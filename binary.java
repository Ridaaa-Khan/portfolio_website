//binary search questions
import java.util.Arrays;
public class binary{
    public static char ceiling(char[] char_arr, char target){
        int[] arr = new int[char_arr.length]; //making a new array and converting all the characters to their respective ascii values
        for(int i =0; i<arr.length;i++){
            arr[i] = char_arr[i];
        }
        int start = 0;
        int end = arr.length-1;
        int mid = arr.length/2;
        if(target>arr[mid]){
            start = mid+1; 
        }else if(target==char_arr[char_arr.length-1]){
            return char_arr[0];
        }
        else{
            end = mid-1;
        }
    
        return (char)(char_arr[end]);
    }

    public static void main(String[] args) {
        char[] char_arr = {'c','f','j'};
        char target = 'j';
        System.out.println(ceiling(char_arr, target));
        
    }
}