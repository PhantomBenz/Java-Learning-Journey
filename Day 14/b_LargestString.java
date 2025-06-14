public class b_LargestString {
    public static void main(String[] args) {
        String str[] = {"Apple", "apple", "banana", "cherry", "date", "elderberry"};
        String largest = str[0];
        for (int i = 1; i < str.length; i++) {
            if (str[i].compareTo(largest) > 0) {   // or compareToIgnoreCase() for case-insensitive comparison
                largest = str[i];                  // A<a<b<c<d<e
            }
        }
        System.out.println("Largest string in the array: " + largest);
    }
}
