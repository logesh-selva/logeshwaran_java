public class Student {
    int Rollnumber ;
    String Name;
    Float mark;

    Student(int Rollnumber,String Name,Float mark){
        this.mark=mark;
        this.Name=Name;
        this.Rollnumber=Rollnumber;
    }
    Student(){
        this(13,"LOGESHWARAN", 90F);
    }
    Student(Student other){
        this.Rollnumber=other.Rollnumber;
        this.Name= other.Name;
        this.mark= other.mark;
    }

    void Display (){
        System.out.println(this.Name+ " "+ this.Rollnumber+ " "+this.mark);
    }
}
