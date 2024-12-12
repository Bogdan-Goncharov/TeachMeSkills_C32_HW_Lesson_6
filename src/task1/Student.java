package task1;

public class Student {
        private String firstName;

        private String passportNumber;
        private String groupName;
        private int age;

        public Student(String firstName, String passportNumber, String groupName, int age) {
            this.firstName = firstName;

            this.passportNumber = passportNumber;
            this.groupName = groupName;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" +  '\'' +
                    ", passportNumber='" + passportNumber + '\'' +
                    ", groupName='" + groupName + '\'' +
                    ", age=" + age +
                    '}';
        }
    }




