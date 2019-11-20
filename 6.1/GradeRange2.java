public class GradeRange2 
{
    public static void main(String[] args) 
    {
        Grade[] grades = 
        {
                new Grade(95, "A"),
                new Grade(90, "A-"),
                new Grade(87, "B+"),
                new Grade(83, "B"),
                new Grade(80, "B-"),
                new Grade(77, "C+"),
                new Grade(73, "C"),
                new Grade(70, "C-"),
                new Grade(67, "D+"),
                new Grade(63, "D"),
                new Grade(60, "D-"),
                new Grade(0, "F"),
        };

        for(Grade grade : grades) 
        {
            System.out.println(grade.getLetter() + "\t" + grade.getNumber());
        }
    }
}
