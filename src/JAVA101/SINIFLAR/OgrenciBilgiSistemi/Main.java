package JAVA101.SINIFLAR.OgrenciBilgiSistemi;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");


        Course mat = new Course("Matematik", "MAT101", "MAT");
        mat.addTeacher(t1);
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        fizik.addTeacher(t2);
        Course kimya = new Course("Kimya", "KMY101", "KMY");
        kimya.addTeacher(t3);


        Student s1 = new Student("İnek Şaban", "123", "4", mat, fizik, kimya);
        Student s2 = new Student("Güdük Necmi", "456", "4", mat, fizik, kimya);
        Student s3 = new Student("Hayta İsmail", "789", "4", mat, fizik, kimya);

        System.out.println("--------------------");
        s1.addBulkExamNote(100, 70, 70, 100, 100, 100);
        s1.isPass();
        System.out.println("********************");
        System.out.println();

        System.out.println("--------------------");
        s2.addBulkExamNote(100, 20, 55, 80, 90, 100);
        s2.isPass();
        System.out.println("********************");
        System.out.println();

        System.out.println("--------------------");
        s3.addBulkExamNote(90, 80, 75, 90, 90, 90);
        s3.isPass();
        System.out.println("********************");


    }
}