StudentList.java

package studentlist;

import java.util.Scanner;

/**
*
* @author Megha Patel
*/
public class StudentList {

/**
* @param args the command line arguments
*/
public static void main(String[] args) {
//need to take user input for student name and id for 5 students
Student[] sList=new Student[5];
Scanner sc=new Scanner(System.in);

for(int i=0;i<sList.length;i++)
{
System.out.println("Enter student name: ");
//sList[i].setStudName(sc.next());
String n=sc.next();

System.out.println("Enter student id: ");
int id=sc.nextInt();

Student s=new Student(n,id);
sList[i]=s;
}

for(int i=0;i<sList.length;i++)
{
System.out.println("Name: "+sList[i].getStudName()+
" Stdent Id: "+sList[i].getStudId() );
}

}

}