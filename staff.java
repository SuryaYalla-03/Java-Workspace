import java.util.*;
public class staff {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    Teacher te = new Teacher(sc.nextLine(),sc.nextLine(),sc.nextDouble()); 
	    sc.nextLine();
	    Teacher ta = new Teacher(sc.nextLine(),sc.nextLine(),sc.nextDouble());
	    sc.nextLine();
	    Teacher tc = new Teacher(sc.nextLine(),sc.nextLine(),sc.nextDouble());
	    sc.nextLine();
	    
	    Teacher[] teachers = {te, ta,tc};
	    for (Teacher teacher : teachers) {
            System.out.println("Teacher Details");
            System.out.println("Name: " + teacher.getTeacherName());
            System.out.println("Subject: " + teacher.getSubject());
            System.out.println("Salary: " + teacher.getSalary());
            System.out.println();
        }
	}
}


class Teacher {
    String teacherName;
    String subject;
    double salary;
    
    public Teacher(String teacherName, String subject, double salary){
        this.teacherName=teacherName;
        this.subject=subject;
        this.salary=salary;
    }
    public String getTeacherName(){
        return teacherName;
    }
    public void setTeacherName(String teacherName){
        this.teacherName = teacherName;
    }
    public String getSubject(){
        return subject;
    }
    public void setSubject(String subject){
        this.subject = subject;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
 
}

