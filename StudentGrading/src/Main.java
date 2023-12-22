
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca","TRH","5553355");
        Teacher t2 = new Teacher("Graham Bell","FZK","00001");
        Teacher t3 = new Teacher("Kül yutmaz","BIO","1234");

        Course tarih = new Course("Tarih","101","TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik","102","FZK");
        fizik.addTeacher(t2);

        Course biyo = new Course("Biyoloji","101","BIO");
        biyo.addTeacher(t3);

        Student s1 = new Student("İnek Saban","111","4.Sınıf",tarih,fizik,biyo);
        s1.addBulkExamNote(100,60,50,40,20,80);
        s1.printNote();
        s1.isPass();

        Student s2 = new Student("Güdük","222","4.Sınıf",tarih,fizik,biyo);
        s2.addBulkExamNote(50,40,30,80,87,92);
        s2.isPass();




    }
}