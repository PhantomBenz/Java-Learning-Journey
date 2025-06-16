public class c_GettersAndSetters {
    public static void main(String[] args) {
        Pen p1 = new Pen();  
        p1.setColor("Blue");  
        System.out.println(p1.getColor());  
        p1.setTip(5);       
        System.out.println(p1.getTip());
    }
}

class Pen {
    private String color;
    private int tip;

    String getColor() {           // getter
        return this.color;
    }

    int getTip() {                
        return this.tip;
    }

    void setColor(String c) {     // setter
        color = c;
    }

    void setTip(int tip) {
        this.tip = tip;
    }
}
