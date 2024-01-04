public class Arryproblem {

    public static int ssmallestInteger(int n, int []a){
        int smallest = a[0];
        int ssmallest = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            if (a[i]<smallest){
                ssmallest = smallest ;
                smallest = a[i];
            }
            else if(a[i]>smallest && a[i]<ssmallest){
                ssmallest = a[i];
            }
        }
        return ssmallest;
    }
    
    public static int slargestInteger(int n, int []a){
        int largest = a[0];
        int slargest = -1;
        for(int i = 0; i < n; i++){
            if (a[i]>largest){
                slargest = largest ;
                largest = a[i];
            }
            else if(a[i]<largest && a[i]>slargest){
                slargest = a[i];
            }
        }
        return slargest;
    }
        



    
    public static int[] getSecondOrderElements(int n, int []a) {
        int ssmallest = ssmallestInteger(n,a);
        int slargest =  slargestInteger(n,a);
        int[] arr = new int[2];
        arr[0] = slargest;
        arr[1] = ssmallest;
        return arr;

    }
    public static void main(String[] args) {
        
    }
}