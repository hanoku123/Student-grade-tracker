import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number of student: ");
        Integer Num = scanner.nextInt();
        System.out.println("Number of student: " + Num);
        for(int i=0; i<Num; i++){
            System.out.println("Student " + (i+1) + " details" );
            scanner.nextLine();
            System.out.println("Student " + (i+1) + " Name: ");
            String Name = getStudentName(scanner);
            System.out.println("Student "+ (i+1) +" "+ Name);
            System.out.println("Enter student "+ (i+1) +" marks for 3 subjects: ");
            Integer sub1 = scanner.nextInt();
            Integer sub2 = scanner.nextInt();
            Integer sub3 = scanner.nextInt();
            Integer marks = sub1 + sub2 + sub3;
            System.out.println("Total Marks: " + marks);
            int Average = calculateAverage(marks, 3);
            System.out.println("Average marks: " + Average);
            String Grade = calculateGrade(Average);
            System.out.println("Grade: " + Grade);
        }
    }
    static String getStudentName(Scanner scanner){
        String Name = scanner.nextLine();
        return Name;
    }
    static int calculateAverage(int totalMarks, int totalSubjects) {
        int Average = totalMarks / totalSubjects;
        return Average;
    }
    static String calculateGrade(int Average) {
        if (Average >= 90) {
            return "A (Top)";
        } else if (Average >= 70 ) {
            return "B";
        } else if (Average >= 50 ) {
            return "C";
        } else if (Average >= 35 ) {
            return "D";
        } else  {
            return "E (fail)";
        }
    }

}