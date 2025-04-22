package class1;

public class ClassStart4 {

    public static void main(String[] args) {
        Student student1 = new Student(); //학생을 담아둘 변수 선언, student 타입의 객체를 받을 수 있음
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student(); //객체 또는 인스턴스, 새로운 객체를 만들어내는 코드
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        Student[] students = new Student[2];
        students[0] = student1;
        students[1] = student2;

        System.out.println("이름 : " + students[0].name + " 이름 : " + students[0].age + " 성적 : " + students[0].grade);
        System.out.println("이름 : " + students[1].name + " 이름 : " + students[1].age + " 성적 : " + students[1].grade);
     // 결론적으로 2개의 학생 인스턴스가 있는 것
    }
}
