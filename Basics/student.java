package Basics;
import java.util.Scanner;
import static java.lang.System.*;
class studentDetails {
    int rno;
    String name;
    studentDetails(int rno,String name){
        this.rno=rno;
        this.name=name;
    }
    void display(){
        out.println("Student name :"+name+"\n Roll no:"+rno);
    }
}
class student{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        int rno=sc.nextInt();
        sc.close();
        studentDetails s=new studentDetails(rno,name);
        s.display();
    }
}
