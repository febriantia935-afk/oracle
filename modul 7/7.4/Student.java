import java.util.Date;

class Person {
    private String firstName;
    private String middleName;
    private String lastName;
    private Date dateOfBirth;

    public Person(String firstName, String middleName, String lastName, Date dateOfBirth) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() { return firstName; }
    public String getMiddleName() { return middleName; }
    public String getLastName() { return lastName; }
    public Date getDateOfBirth() { return dateOfBirth; }
}

public class Student extends Person {
    // data pribadi dibuat private agar terlindungi (enkapsulasi)
    private String studentId;            // NIM
    private double gpa;                  // IP
    private String major;                // jurusan
    private String degree;               // Sarjana, Magister, Doktor
    private int expectedGraduationYear;  // tahun lulus yang diharapkan

    public Student(String firstName, String middleName, String lastName, Date dateOfBirth,
                   String studentId, String major, String degree, int expectedGraduationYear) {
        super(firstName, middleName, lastName, dateOfBirth);  // panggil constructor Person
        this.studentId = studentId;
        this.major = major;
        this.degree = degree;
        this.expectedGraduationYear = expectedGraduationYear;
        this.gpa = 0.0;
    }

    // method akses (getter)
    public String getStudentId() { return studentId; }
    public double getGpa() { return gpa; }
    public String getMajor() { return major; }
    public String getDegree() { return degree; }
    public int getExpectedGraduationYear() { return expectedGraduationYear; }

    // administrator mengubah jurusan mahasiswa
    public void setMajor(String newMajor) {
        major = newMajor;
    }

    // konversi nilai huruf menjadi poin mutu
    private double gradeToPoints(String grade) {
        switch (grade) {
            case "A":  return 4.0;
            case "A-": return 3.67;
            case "B+": return 3.33;
            case "B":  return 3.0;
            case "B-": return 2.67;
            case "C+": return 2.33;
            case "C":  return 2.0;
            case "D":  return 1.0;
            case "F":  return 0.0;
            default:
                throw new IllegalArgumentException("Nilai tidak dikenal: " + grade);
        }
    }

    // menghitung IP dari array nilai huruf, lalu menyimpannya di gpa
    public double calculateGPA(String[] grades) {
        double total = 0;
        for (int i = 0; i < grades.length; i++) {
            total += gradeToPoints(grades[i]);
        }
        gpa = total / grades.length;
        return gpa;
    }
}