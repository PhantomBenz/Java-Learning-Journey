// considering matrix is row and column wise sorted
public class d_SearchInMatrix {
    public static void search(int arr[][], int key){
        int i=0,j=arr[0].length-1;
        while(true){
            if(key > arr[i][j]){
                i++;
            }
            else if(key < arr[i][j]){
                j--;
            }
            else if(key == arr[i][j]){
                System.out.println(key + " found at index (" + i + ", " + j + ")");
                return;
            }
            else{
                System.out.println(key + " not found");
                return;
            }
        }
    }
    public static void main(String[] args) {
        int arr[][] = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int k = 35;
        search(arr,k);
    }
}
