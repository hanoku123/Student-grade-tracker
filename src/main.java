import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number of student: ");
        int Num = scanner.nextInt();
        System.out.println("Number of student: " + Num);

        for(int i=0; i<Num; i++){
            System.out.println("Student " + (i+1) + " details" );
            scanner.nextLine();
            System.out.println("Student " + (i+1) + " Name: ");
            String Name = getStudentName(scanner);
            System.out.println("Student "+ (i+1) +" "+ Name);
            System.out.println("Enter student "+ (i+1) +" marks for 3 subjects: ");

            int[] marks = new int[3];
            for( int j=0; j<marks.length; j++) {

                System.out.println("Enter subject" + (j + 1) + "marks: ");
                String subjectName = "subject" + (j + 1);
                marks[j] = scanner.nextInt();

                marks[j] = validationMark(marks[j], subjectName, scanner);

            }

                int totalmarks = calculateTotal(marks);
                System.out.println("Total Marks: " + totalmarks);

                int Average = calculateAverage(totalmarks, 3);
                System.out.println("Average marks: " + Average);
                String Grade = calculateGrade(Average);
                System.out.println("Grade: " + Grade);

        }
    }
    static String getStudentName(Scanner scanner){
        String Name = scanner.nextLine();
        return Name;
    }
    static int validationMark(int subject, String subjectName, Scanner scanner){

        while (subject < 0 || subject > 100) {
            System.out.println("Invalid marks for " +(subjectName)+ " Enter marks between 0 and 100:");
            subject = scanner.nextInt();
        }
        return subject;

    }
    static int calculateTotal(int[] marks){
        int totalmarks = 0;
        for(int i=0; i<marks.length; i++) {

            totalmarks = totalmarks + marks[i];

        }
            return totalmarks;
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