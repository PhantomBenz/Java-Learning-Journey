public class d_Constructor {
    public static void main(String[] args) {
        Student s1 = new Student("Sumoon"); 
        System.out.println(s1.name); 
        Student s2 = new Student(); 
        s2.roll = 101;
        s2.name = "Pratik";
        System.out.println(s2.name + " " + s2.roll);
        Student s3 = new Student(s2);
        System.out.println(s3.name + " " + s3.roll);
    }
}

class Student {
    String name;
    int roll;
    int marks[];

    Student() {
        marks = new int[5];
        System.out.println("Constructor is called ...");
    }
    Student(String name) {
        marks = new int[5];
        this.name = name;
    }
    // Student(Student s){                          // shallow copy constructor
    //     marks = new int[5]; 
    //     this.name = s.name;
    //     this.roll = s.roll; 
    //     this.marks = s.marks;                    // shallow copy of marks array meaning both s.marks and this.marks point to the same array
    //     System.out.println("Copy constructor is called ...");
    // }

    Student(Student s){                          // deep copy constructor
        marks = new int[5]; 
        this.name = s.name;
        this.roll = s.roll; 
        for(int i = 0; i < s.marks.length; i++) {
            this.marks[i] = s.marks[i]; // deep copy of marks array
        }
        System.out.println("Copy constructor is called ...");
    }
}