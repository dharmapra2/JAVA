package mca;
import java.util.Scanner;
import static java.lang.System.*;
class studentDetails{
    int rno;
    String name;
    studentDetails(int rno,String name){
        this.rno=rno;
        this.name=name;
    }
    void display(){
        out.println("Name is: "+name+"\t and Roll No is:"+rno);
    }
}
public class student {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        out.println("Enter the name:");
        String name=sc.next();
        out.println("Enter the namroll no.:");
        int rno=sc.nextInt();
        sc.close();
        studentDetails s=new studentDetails(rno, name);
        s.display();
    }
    
}
