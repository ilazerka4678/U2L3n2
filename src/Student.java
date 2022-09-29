public class Student {


        private String firstName;
        private String lastName;
        private int gradYear;
        private double accumulatedTestScores = 0.0;
        private int testScoreCount = 0;

        /* Constructor; see note below */

        public Student(String first, String last, int grad)
        {
        firstName = first;
        lastName = last;
        gradYear = grad;
        }



        /* Methods */

        // Sets gradYear to newGradYear
        public void updateGradYear(int newGradYear)
        {
        gradYear = newGradYear;
        }

        // Adds newTestScore to accumulatedTestScores
// and increments testScoreCount by 1
        public void addTestScore(double newTestScore)
        {
        accumulatedTestScores = accumulatedTestScores + newTestScore;
        testScoreCount++;
        }

        // Returns the number of test scores that have been added
        public int getTestScoreCount()
        {
        return testScoreCount;
        }

        // Returns the Student’s average test score as the
// quotient of accumulatedTestScores and testScoreCount
        public double averageTestScore()
        {
        return accumulatedTestScores/testScoreCount;
        }

        // this method prints all info of a Student object to the console
        public void printStudentInfo()
        {
        System.out.println("Student name: " + firstName + " " + lastName + ".");
        System.out.println("Graduation year: " + gradYear + ".");
        System.out.println("Accumulated test scores: " + accumulatedTestScores + ".");
        System.out.println("Test score count: " + testScoreCount + ".");
        System.out.println("Average test score: " + averageTestScore() + ".");
        }

}