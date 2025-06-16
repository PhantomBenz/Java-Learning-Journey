public class i_Interfaces {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
}

// for multiple inheritance, we use interfaces
// interface A{}
// interface B{}
// class C implements A, B{}

interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right, diagonal (in all 4 directions)");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right");
    }
}

class King implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right, diagonal (in all 4 directions) but only one step");
    }
}