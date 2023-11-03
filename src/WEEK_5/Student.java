package WEEK_5;

public class Student {

        private final String name;
        private final String studentNumber;

        public Student(String name, String studentNumber) {
            this.name = name;
            this.studentNumber = studentNumber;
        }

        public String getName() {
            return name;
        }

        public String getStudentNumber() {
            return studentNumber;
        }

        @Override
        public String toString() {
            return name + " (" + studentNumber + ")";
        }

    }
