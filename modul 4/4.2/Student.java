public class Student {
    String fName;
    String lName;
    int stuId;
    String stuStatus;

    // constructor
    Student(String f, String l, int id, String status) {
        fName = f;
        lName = l;
        stuId = id;
        stuStatus = status;
    }

    // mencetak informasi mahasiswa
    void printInfo() {
        System.out.println("Student Name: " + fName + " " + lName);
        System.out.println("Student ID: " + stuId);
        System.out.println("Student Status: " + stuStatus);
    }
}