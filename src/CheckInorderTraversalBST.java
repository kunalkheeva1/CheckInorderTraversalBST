public class CheckInorderTraversalBST {

    static int checkInorderTraversalBST(int arr[], int n){
        for(int i=1; i<n; i++){
            if(arr[i]<= arr[i-1]){
                return 0;
            }
        }return 1;
    }




    public static void main(String[] args) {

    }
}
