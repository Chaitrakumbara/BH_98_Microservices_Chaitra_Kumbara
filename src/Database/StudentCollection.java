package Database;


class Student {
int roll_no;
String name;
String grade;

public Student(int roll_no, String name, String grade) {
this.roll_no = roll_no;
this.name = name;
this.grade = grade;
}


public int getRoll_no() {
return roll_no;
}



public void setRoll_no(int roll_no) {
this.roll_no = roll_no;
}

public String getName() {
return name;
}



public void setName(String name) {
this.name = name;
}



public String getGrade() {
return grade;
}



public void setGrade(String grade) {
this.grade = grade;
}

}
class StudentCollection
{
public static void collection(Student stu)
{
if(stu.getGrade().equals("A") ||stu.getGrade().equals("B"))
{
System.out.println(stu.roll_no+" " + stu.name +" " + stu.grade);
}

}
public static void main(String[] args) {
Student stu1 = new Student( 101, "Tommy", "A");
Student stu2 = new Student( 102, "John", "A");
Student stu3 = new Student( 103, "Sam", "B");
Student stu4 = new Student( 104, "Rajeev","C");
Student stu5 = new Student(105,"Suraj", "D");

collection(stu1);
collection(stu2);
collection(stu3);
collection(stu4);
collection(stu5);
}
}