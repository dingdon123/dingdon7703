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
System.out.println("�����޲ι��췽��"); 
}
public Student(String name,int grade) {
this.name=name;
this.grade=grade;
}
}
public class text_01 {
public static void main(String args[]) {
Student stu1=new Student();
stu1.name="����";
stu1.grade=88;
Student stu2=new Student("����",90);
System.out.println("�ҽ�"+stu1.name+",��õĳɼ���"+stu1.grade+"�֣�"); 
System.out.println("�ҽ�"+stu2.name+",��õĳɼ���"+stu2.grade+"�֣�"); 
}
}