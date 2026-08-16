import java.util.Scanner;
public class main{
     public static void main(String[] args){
        System.out.println("Enter Student Name: ");
        Scanner scanner = new Scanner(System.in);
        String Name = scanner.nextLine();
        System.out.println("Enter student marks for 3 subjects: ");
        Integer sub1 = scanner.nextInt();
        Integer sub2 = scanner.nextInt();
        Integer sub3 = scanner.nextInt();

        System.out.println("Student: "+ Name);
        Integer marks = sub1 + sub2 + sub3;

        System.out.println("Total Marks: " + marks);
        Integer Average = marks / 3;
        System.out.println("Average marks: " + Average);

        if(Average >= 90){
            System.out.println("Grade: A(top)");
        }else if(Average >=70&&Average<90){
            System.out.println("Grade: B");
         }else if(Average >=50&&Average<70){
            System.out.println("Grade: C");
        }else if(Average >=35&&Average<50){
             System.out.println("Grade: D");
         }else if(Average<35){
             System.out.println("Grade: E(failed)");
         }
     }
        }