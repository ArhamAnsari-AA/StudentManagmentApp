package model;

public class Student {
private int studentId;
private String name;
private int age;
private String course;
private  double marks;


public Student(int studentId,String name,int age,String course, double marks){
    this.studentId=studentId;
    this.name=name;
    this.age=age;
    this.course=course;
    this.marks=marks;
}

// Setter and getters methods for StudentId
public void setStudentId(int studentId){

    this.studentId=studentId;
}
public int getStudentId(){
    return studentId;
}

// Setter and getters methods for name

public  void setName(String name){
    this.name=name;
}
public String getName(){
    return name;
}

// Setter and getters methods for Age

    public void setAge(int age){
    this.age=age;
    }

    public int getAge(){
    return age;
    }

// Setter and getters methods for Course
public void setCourse(String course){
    this.course=course;
}

public String getCourse(){
    return course;
}


// Setter and getters methods for Marks

    public void setMarks(double marks){
    this.marks=marks;
    }

    public double getMarks(){
    return marks;
    }

    //Display to show students details
    public void display(){
        System.out.println(studentId + "| " + name + "| " +age+"| "+course+"| " +marks);

    }

}
