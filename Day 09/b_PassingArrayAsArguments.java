public class b_PassingArrayAsArguments {
    public static void update(int arr[]){
        for(int i = 0; i<arr.length; i++){
            arr[i] += 1; 
        }
    }
    public static void main(String[] args) {
        int marks[] = {97, 98, 99};
        update(marks);
        for(int i = 0; i<marks.length; i++){
            System.out.println(marks[i]);
        }
    }
}
