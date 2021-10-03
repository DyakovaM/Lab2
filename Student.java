package LAB2;


public class Student {
    String firstName, lastname,group;
    double averageMark;
    public Student(String firstName, String lastname, double averageMark, String group){
        this.firstName=firstName;
        this.lastname=lastname;
        this.averageMark=averageMark;
        this.group=group;
    }
    int getScholarship(){
        return (this.averageMark==5) ? 100:80;
    }
}