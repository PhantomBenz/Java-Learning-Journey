// Given a route coontaining 4 directions (N, S, E, W) and a starting point (0, 0), find the shortest path to reach the destination.
// "WNEENESENNN"
public class f_ShortestPath {
    public static void main(String[] args) {
        String route = "WNEENESENNN";
        int x = 0, y = 0;

        for (int i = 0; i < route.length(); i++) {
            char direction = route.charAt(i);
            switch (direction) {
                case 'N':
                    y++;
                    break;
                case 'S':
                    y--;
                    break;
                case 'E':
                    x++;
                    break;
                case 'W':
                    x--;
                    break;
            }
        }

        System.out.println("Place reached is: (" + x + ", " + y + ")");
        System.out.println("Shortest path to reach destination: " + Math.sqrt(x*x + y*y));
    }
}
