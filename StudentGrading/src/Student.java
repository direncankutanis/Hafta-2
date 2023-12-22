public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int note2, int note3, int permormanceGrade1, int permormanceGrade2, int permormanceGrade3) {
        if (note1 >= 0 && note1 <= 100) {
            this.c1.note = note1;
        }
        if (note2 >= 0 && note2 <= 100) {
            this.c2.note = note2;
        }
        if (note3 >= 0 && note3 <= 100) {
            this.c3.note = note3;
        }
        if (permormanceGrade1 >= 0 && permormanceGrade1 <= 100){
            this.c1.performanceGrade = permormanceGrade1;
        }

        if (permormanceGrade2 >= 0 && permormanceGrade2 <= 100){
            this.c2.performanceGrade = permormanceGrade2;
        }
        if (permormanceGrade3 >= 0 && permormanceGrade3 <= 100){
           this.c3.performanceGrade = permormanceGrade3;
        }


    }
    void isPass(){
        double c1 = (this.c1.performanceGrade * 0.20) +(this.c1.note * 0.80);
        double c2 = (this.c2.performanceGrade * 0.20) +(this.c2.note * 0.80);
        double c3 = (this.c3.performanceGrade * 0.20) +(this.c3.note * 0.80);
        this.avarage = (c1 + c2 + c3) / 3.0;
        if (this.avarage >55){
            System.out.println("Hababam uyanıyor");
            this.isPass = true;
        }else {
            System.out.println("Hababam sınıfta kaldı");
            this.isPass = false;
        }
        printNote();
    }
    void printNote(){
        System.out.println("===============");
        System.out.println(this.c1.name + "Notu: " + c1.note + "Sözlü notunuz: " + c1.performanceGrade);
        System.out.println(this.c2.name + "Notu: " + c2.note + "Sözlü notunuz: " + c2.performanceGrade);
        System.out.println(this.c3.name + "Notu :" + c3.note + "Sözlü notunuz: " + c3.performanceGrade);
        System.out.println("Ortalamanız: " + this.avarage);

    }

}
