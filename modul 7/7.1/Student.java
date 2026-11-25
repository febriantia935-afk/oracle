public class Student {
    private String name;
    private int credits;
    private double gpa;
    private int gradePoints;

    // Constructor
    public Student(String name, int credits, int gradePoints) {
        this.name = name;
        this.credits = credits;
        this.gradePoints = gradePoints;
        this.gpa = (double) gradePoints / credits;
    }

    // (a) mengembalikan IP saat ini = poin mutu / kredit
    public double getCurrentGPA() {
        return (double) gradePoints / credits;
    }

    // (b) menerima kredit dan poin mutu baru, lalu memperbarui kredit, poin mutu, dan IP
    public void addCredits(int newCredits, int newGradePoints) {
        credits += newCredits;
        gradePoints += newGradePoints;
        gpa = (double) gradePoints / credits;
    }

    public String getName() { return name; }
    public int getCredits() { return credits; }
    public int getGradePoints() { return gradePoints; }
    public double getGpa() { return gpa; }
}