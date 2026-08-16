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
    }
        }