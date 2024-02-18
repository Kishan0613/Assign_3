public class Student_Course extends Student {
    void course()
    {
        String[] subjects = {"DevOps", "Machine Learning", "C#"};
        int[][] marks = {
            {50, 30, 60} 
             
        };

        // Assuming each row represents a student and each column represents a subject
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                if (marks[i][j] < 40) {
                    System.out.println("kishan " + (i + 1) + " scored less than 40 in the " + subjects[j]);
                }
            }     
        }
        }
    public static void main(String args[])
    {
        Student_Course sc = new Student_Course();
        sc.stud_det();
        sc.course();
        
    }
}