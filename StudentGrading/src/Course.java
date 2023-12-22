public class Course {
    Teacher teacher; // referans olarak teacher nesnesi üretildi.
    String name;
    String code;
    String prefix;
    int note;
    int performanceGrade;

    Course(String name,String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;
        int permormanceGrade = 0;
    }
    void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
        }else{
            System.out.println("Ogretmen ve ders bölümleri uymuyor.");
        }


    }
    void printTeacher(){
        this.teacher.print();
    }

}
