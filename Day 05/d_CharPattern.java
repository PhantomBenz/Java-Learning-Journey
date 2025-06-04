// A
// BC
// DEF
// GHIJ
public class d_CharPattern {
    public static void main(String[] args) {
        char ch = 'A';
        int i, j;
        for(i=1; i <= 4; i++){
            for(j=1; j<=i; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
