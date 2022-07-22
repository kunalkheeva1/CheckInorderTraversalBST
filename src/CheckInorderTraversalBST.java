public class CheckInorderTraversalBST {

    //property of inorder is that the array contained is in ascending order
    static int checkInorderTraversalBST(int arr[], int n){
        //run a loop from 1 instead of 0 as if its get started
        // from 0 we cannot compare it with the previous element
        for(int i=1; i<n; i++){

            //make sure they are not equal either
            if(arr[i]<= arr[i-1]){
                return 0;
            }
        }return 1;          //else return 1
    }




    public static void main(String[] args) {

    }
}
