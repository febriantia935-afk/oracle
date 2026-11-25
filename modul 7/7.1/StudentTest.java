public class StudentTest {
    static class Student {
        private final String name;
        private int credits;
        private int gradePoints;

        Student(String name, int credits, int gradePoints) {
            this.name = name;
            this.credits = credits;
            this.gradePoints = gradePoints;
        }

        String getName() {
            return name;
        }

        int getCredits() {
            return credits;
        }

        int getGradePoints() {
            return gradePoints;
        }

        double getCurrentGPA() {
            return credits == 0 ? 0.0 : (double) gradePoints / credits;
        }

        void addCredits(int additionalCredits, int additionalGradePoints) {
            credits += additionalCredits;
            gradePoints += additionalGradePoints;
        }
    }

    static void cetak(Student s) {
        System.out.printf("%-12s kredit: %2d  poin mutu: %3d  IP: %.2f%n",
                s.getName(), s.getCredits(), s.getGradePoints(), s.getCurrentGPA());
    }

    public static void main(String[] args) {
        // Soal 5: tiga instance Student
        Student mary = new Student("Mary Jones", 14, 46);
        Student john = new Student("John Stiner", 60, 173);
        Student ari = new Student("Ari Samala", 31, 69);

        System.out.println("Sebelum:");
        cetak(mary);
        cetak(john);
        cetak(ari);

        // Soal 6: tambah 13 kredit dan 52 poin mutu ke Ari Samala
        ari.addCredits(13, 52);

        System.out.println("Sesudah menambah 13 kredit dan 52 poin mutu ke Ari Samala:");
        cetak(ari);
    }
}