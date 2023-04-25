package deom_02;
//An highlighted block
class Student{
String name;
int grade;

public String getName() {
return name;
}
public void setName(String name) {
this.name=name;
}
public int getGrade() {
return grade;
}
public void setGrade(int grade) {
this.grade=grade;
}
public Student() {
System.out.println("调用无参构造方法"); 
}
public Student(String name,int grade) {
this.name=name;
this.grade=grade;
}
}
public class text_01 {
public static void main(String args[]) {
Student stu1=new Student();
stu1.name="张三";
stu1.grade=88;
Student stu2=new Student("李四",90);
System.out.println("我叫"+stu1.name+",获得的成绩是"+stu1.grade+"分！"); 
System.out.println("我叫"+stu2.name+",获得的成绩是"+stu2.grade+"分！"); 
}
}