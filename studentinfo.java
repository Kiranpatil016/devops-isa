public class studentinfo{
    private String[] semesters = {"1st semester", "2nd semester", "3rd semester"};
    private double[] grades = {9.14, 9.07, 9.07};

    public void displayStudentInfo() {
        System.out.println("\nGrade obtained from each semester:");
        for (int i = 0; i < semesters.length; i++) {
            System.out.printf("%s: Grade: %.2f\n", semesters[i], grades[i]);
        }
    }
}