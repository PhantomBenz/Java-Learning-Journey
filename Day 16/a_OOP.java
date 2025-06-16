public class a_OOP {
    public static void main(String[] args) {
        Pen p1 = new Pen();  // create a pen object called p1
        p1.setcolor("Blue");  
        System.out.println(p1.color);  
        p1.setTip(5);       // or p1.tip = 5; as tip is public (access modifier is not specified meaning it is default)
        System.out.println(p1.tip);
    }
}

class Pen{
    String color;
    int tip;
    
    void setcolor(String c){
        color = c;
    }
    void setTip(int t){
        tip = t;
    }
}

class Student{
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy, int chem, int math){
        percentage = (phy + chem + math) / 3 * 100;
    }
}
