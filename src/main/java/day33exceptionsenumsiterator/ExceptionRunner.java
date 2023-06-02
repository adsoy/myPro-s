package day33exceptionsenumsiterator;

public class ExceptionRunner {

    /*
    Garbage Collector memory i temiz tutmak icin surekli surekli memory i tarar ve silinmesi gerekenleri siler.
    Garbage Collector silmeden önce silecegi datala ri finalize eder ve sonra siler


     */

    public static void main(String[] args) throws InvalidStudentGradeException {
        getStudentGrade(50);
       // getStudentGrade(150);//InvalidStudentGradeException

        getNumberOfStudents(-12);

    }
    public static void getNumberOfStudents(int numOfStudents){
        if (numOfStudents<0){
            throw new InvalidNumberException("Student number cannot be negative");

        }else{
            System.out.println(numOfStudents);
        }
    }

    public static void getStudentGrade(int grade) throws InvalidStudentGradeException {

        if (grade<0 || grade >100){
            throw new InvalidStudentGradeException("Student's grades cannot be less than zero or greater than 100");

        }else {
            System.out.println(grade
            );
        }


    }
}
