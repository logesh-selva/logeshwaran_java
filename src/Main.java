import java.lang.*;
public class Main {
    public static void main(String[] args) {
        Student newStudent= new Student(12,"Radhamani", 98.5F);
        Student one;
        one=newStudent;
        newStudent.Display();
        one.Display();
        final Student logesh = new Student(121,"LOGI",90.4F);
        logesh.Display();
//        System.out.  T("Hello world!");
        A a ;
        for (int i = 0; i < 100000; i++) {
            a=new A(10);
        }

    }
}

class A {
    int n;

    public A(int n){
        this.n=n;
    }
    @Override
    protected void finalize() {
        System.out.println("override function");
    }
}