import java.util.*;

public class VitaWiebeTA4 {

    /*
     Create a selectionSort method and private helper method to recursively sort the arrays;
     Void return type because is a mutator method (a.k.a. "setter");
     Rewritten overloaded method with a param for the name list, since that will
     have to be dealt with simultaneously;
    */
    static void selectionSort(double[] gradeList, String[] nameList){

        for(int i = 0; i < gradeList.length; i++){
            double currMax = gradeList[i];
            int currMaxIndex = i;

            for(int j = i+ 1; j < gradeList.length; j++){
                if(currMax < gradeList[j]){
                    currMax = gradeList[j];
                    currMaxIndex = j;
                }
            }
            if(currMaxIndex != i){
                gradeList[currMaxIndex] = gradeList[i];
                gradeList[i] = currMax;
            }
        }
    }


    // Add code to get user input, build arrays, call selectionSort method;
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number of students: ");

        // Get number of students to be entered;
        int students = scan.nextInt();

        /*
         Create parallel arrays, one to hold names and one to hold grades;
         These shall lie at corresponding indices;
        */
        String [] nameArray = new String[(int)students];
        double [] gradeArray = new double[students];

        // For each student, get their name and grade;
        for(int i = 0; i < gradeArray.length; i++){

            // Get student name and add to name array;
            System.out.println("Please enter a student name: ");
            String currName = scan.next();
            nameArray[i] = currName;

            // Get student grade and add to grade array;
            System.out.println("Please enter their grade: ");
            double currGrade = scan.nextDouble();
            gradeArray[i] = currGrade;
        }
        selectionSort(gradeArray,nameArray);

        System.out.println("You entered the following: ");
        for(int j = 0; j < nameArray.length; j++){
            System.out.println("Name: " + nameArray[j] + "     Grade: " + gradeArray[j]);
        }

        System.out.println("Thanks for using my program and have a great day!");
    }
}
