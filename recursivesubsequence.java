import java.util.List;
import java.util.ArrayList;
public class recursivesubsequence {
    public static void printseq(List<Integer> list, int ind, int[] arr, int n){
        if (ind >= n) {
            for (int i : list) {
                System.out.print(i);
            }
            if(list.isEmpty()){
                System.out.println("{}");
            }
            System.out.println(" ");
            return;
        }
        // This will take the value inside the list
        list.add(arr[ind]); //take case
        printseq(list, ind +1, arr, n);
        list.remove(list.size() - 1);// Not take case & Also removes the last added element from the list
        printseq(list, ind +1, arr, n);

       
    }
    
    public static void main(String[] args) {
        int[] arr = {3,1,2};
        int n = 3;
        List<Integer> list = new ArrayList<>(); 
        printseq(list, 0, arr, n);

    }
    
}
