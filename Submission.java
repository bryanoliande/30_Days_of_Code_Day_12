class Student extends Person{
	private int[] testScores;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
    Student(String firstName, String lastName, int id, int[] scores) {
        
        super(firstName, lastName, id);
        this.testScores = scores;
    }
    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
    char calculate() {
        int average = 0;
        char letterGrade = 'Q';
        for(int i = 0; i < this.testScores.length; i++) {
            average += testScores[i];
        }
        average /= testScores.length;
        
        if(90 <= average && average <= 100) {
            letterGrade = 'O';
        }
        
        if(80 <= average && average < 90) {
            letterGrade = 'E';
        }
        
        if(70 <= average && average < 80) {
            letterGrade = 'A';
        }
        
        if(55 <= average && average < 70) {
            letterGrade = 'P';
        }
        
        if(40 <= average && average < 55) {
            letterGrade = 'D';
        }
        
        if(average < 40) {
            letterGrade = 'T';
        }
        
        return letterGrade;
    }
}