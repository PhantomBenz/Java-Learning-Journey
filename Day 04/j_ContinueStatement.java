// print the first 10 numbers except 5 and 6
public class j_ContinueStatement {
    public static void main(String[] args) {
        int i;

        for(i=1;i<=10;i++){
            if(i==5 || i==6)
                continue;
            System.out.println(i);
        }
    }
}
