import java.util.Scanner;
public class Grade {
    public static void main(String args[]) {  //probably a shorter way to do this but oh well.
        System.out.print("\033[H\033[2J");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter how many exams you have taken: ");
        int total_exam = input.nextInt(); 
        double[] exam_grades = new double[total_exam];  //creates the array for the percentages
    

        System.out.println("Enter your " + total_exam + " exam percentages: ");
        for (int i =0; i<total_exam; i++) {  //add the grades to the array
            exam_grades[i] = input.nextDouble();
        }
    
        System.out.println("Enter how many assignments you have done: ");
        int total_assign = input.nextInt();
        double[] assign_grades = new double[total_assign]; //array for assignment scores

        System.out.println("Enter your " + total_assign + " assignment grades: ");
        for (int i =0; i<total_assign; i++) {
            assign_grades[i] = input.nextDouble();
        }
        input.close(); //closes the stream of numbers coming into the program


        //Everything above this comment works; DO NOT TOUCH IT

        double x = ExamAverage(exam_grades); //it's easier to calculate the overall grade by doing this
        double y = AssignAverage(assign_grades);
        

        System.out.println("Your exam average is: " + x);
        System.out.println("Your assignment average is: " + y);
        System.out.println("Your overall grade is: " + OverallGrade(x, y));
        
    }

    public static double ExamAverage(double[] list){
        if (list.length==4) { //special case for dropping the lowest grade if someone took all four exams
            double s = list[0]; //just the first number in the array
            for (int i=1; i<list.length;i++) {
                if (s > list[i]) {
                    s = list[i];
                }
            }

            double total = 0;
            for (int i=0; i<list.length; i++) {
                total = list[i] + total;
            }

            double total_new = total - s; //subtracting the lowest test score
            double average = total_new/(list.length-1);


            return average;
        } // first if ends here

        if (list.length ==0) { //If the person has not done any tests or assignments, it's assumed to be a 100%
            return 100.0;      //UNLESS they didn't do one assignment, which they should put 1 assignment/test, but the score is 0?
        }


        double total = 0;

        for(int i=0; i<list.length; i++) {
            total = list[i] + total;
        }

        double average = total/list.length;
        return average;

    }


    public static double AssignAverage(double[] list) { //Assignmemt average method; nothing too special going on.
        if (list.length == 0) {
            return 100.0;
        }
        
        
        double total = 0;
        for (int i =0; i<list.length; i++) {
            total = list[i] + total;

        }
        double average;
        average = total/(list.length);
        return average;
    }

    public static double OverallGrade(double x, double y) {
        //the equation in the requirements
        //return the value from that.
        double o = Math.ceil((x*0.5) + (y* 0.4) + 10);
        return o;
    }

}







    

