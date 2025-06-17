// Given n friends, each one can remain single or can be paired up with some other friend.
// Each friend can be paired only once. 
// Find out the total number of ways in which friends can remain single or can be paired up.
public class m_FriendsPairing {
    public static void main(String[] args) {
        System.out.println(pairs(5));
    }
    public static int pairs(int n){
        if(n==1 || n==2){
            return n;
        }
        return pairs(n-1) + (n-1) * pairs(n-2);
    }
}
