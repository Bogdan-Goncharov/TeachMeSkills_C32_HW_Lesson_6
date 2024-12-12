package task1;

public class ApplicationRunner {
            public static void main(String[] args) {
                Student[] students = {
                        new Student("Ilya",  "AB1234567", "C32", 20),
                        new Student("Marina", "AB2345678", "C32", 21),
                        new Student("Sultan", "AB3456789", "C32", 22),
                        new Student("Dmitry", "AB4567890", "C32", 23),
                        new Student("Dmitry", "AB5678901", "C32", 22),
                        new Student("Igor", "AB6789012", "C32", 20),
                        new Student("Daniil",  "AB7890123", "C32", 21),
                        new Student("Oleg", "AB8901234", "C32", 22),
                        new Student("Kirill",  "AB9012345", "C32", 23),
                        new Student("Rita", "AB0123456", "C32", 21),
                        new Student("Vlad",  "AB1234568", "C32", 20),
                        new Student("Sergey",  "AB2345679", "C32", 23),
                        new Student("Bogdan",  "AB3456780", "C32", 22),
                        new Student("Kirill",  "AB4567891", "C32", 21)
                };

                for (Student student : students) {
                    System.out.println(student);
                }
            }
        }


