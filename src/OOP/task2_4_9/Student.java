package OOP.task2_4_9;

class Study {
    public static class Student {
        protected final String studying;
        protected Student(String work) {
            this.studying = work;
        }
        public Student() {
            this.studying = "Прохожу тестовое задание.";
        }
        public void study() {
            System.out.println("Я очень занят. " + studying);
        }
    }

public static class JavaStudent extends Student {
    public JavaStudent() {
        super("Прохожу курс по Java.");
    }
}

public static class LazyStudent extends Student {
    @Override
    public void study() {
        System.out.println("Сегодня не учусь, мне лень.");
    }
}

        public static class Main {
            public static void main(String[] args) {
                Study.LazyStudent lazyStudent = new Study.LazyStudent();
                lazyStudent.study();
            }
    }
}

