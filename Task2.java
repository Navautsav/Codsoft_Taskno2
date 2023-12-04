import java.util.Scanner;


public class Task2 {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter the Number of Students :");
      int totalStudents= scan.nextInt();

         for(int i=1;i<=totalStudents;i++){
      System.out.println("Enter the Name of the Student :");
      String name =scan.next();

      System.out.print("Enter marks obtained in Maths: ");
        int mathsMarks = scan.nextInt();
        if(mathsMarks<0 || mathsMarks>100){
         System.out.println("Invalid Marks!");
        }

        System.out.print("Enter marks obtained in Physics: ");
        int physicsMarks = scan.nextInt();
          if(physicsMarks<0 || physicsMarks>100){
         System.out.println("Invalid Marks!");
        }


        System.out.print("Enter marks obtained in Chemistry: ");
        int chemistryMarks = scan.nextInt();
          if(chemistryMarks<0 || chemistryMarks>100){
         System.out.println("Invalid Marks!");
        }

        System.out.print("Enter marks obtained in Computer: ");
        int computerMarks = scan.nextInt();
          if(computerMarks<0 || computerMarks>100){
         System.out.println("Invalid Marks!");
        }


   
        int totalmarks = mathsMarks + physicsMarks + chemistryMarks + computerMarks;

            double avgPercentage = totalmarks / 4.0;

        String grade;
        if (avgPercentage>= 90 && avgPercentage<=100) {
            grade = "A";
        } else if (avgPercentage>=80 && avgPercentage<90) {
            grade = "B";
        } else if (avgPercentage>=70 && avgPercentage<80) {
            grade = "C";
        } else if (avgPercentage>=60 && avgPercentage<70) {
            grade = "D";
        } else if (avgPercentage>=50 && avgPercentage<60){
         grade="E";
        }else {
            grade = "F";
        }
        System.out.println("Name :"+ name);
        System.out.println("Total Marks: " + totalmarks);
        System.out.println("Average Percentage: " + avgPercentage+"%");
        System.out.println("Grade: " + grade);
       
    }
        scan.close();
   }

}
    
    

