package class1;

public class ClassStart5 {

    public static void main(String[] args) {
        Student student1 = new Student(); //학생을 담아둘 변수 선언, student 타입의 객체를 받을 수 있음
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student(); //객체 또는 인스턴스, 새로운 객체를 만들어내는 코드
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        Student[] students = new Student[] {student1, student2};

        for( int i = 0; i < students.length; i++){
            Student s = students[i];
            System.out.println("이름 : " + s.name + " 이름 : " + s.age + " 성적 : " + s.grade);
        }

        for( int i = 0; i < students.length; i++){
            System.out.println("이름 : " + students[i].name + " 이름 : " + students[i].age + " 성적 : " + students[i].grade);
        }
        for(Student s : students){
            System.out.println("이름 : " + s.name + " 이름 : " + s.age + " 성적 : " + s.grade);
        }
    }
}
