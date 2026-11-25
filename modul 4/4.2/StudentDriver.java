public class StudentDriver {
    private static class Student {
        private final String firstName;
        private final String lastName;
        private final int id;
        private final String status;

        Student(String firstName, String lastName, int id, String status) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.id = id;
            this.status = status;
        }

        void printInfo() {
            System.out.println(firstName + " " + lastName);
            System.out.println("ID: " + id);
            System.out.println("Status: " + status);
        }
    }

    public static void main(String[] args) {
        Student s = new Student("Lisa", "Palombo", 123456789, "Active");
        s.printInfo();
    }
}