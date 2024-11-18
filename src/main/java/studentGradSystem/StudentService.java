package studentGradSystem;

import java.util.*;

public class StudentService
{
    Scanner scan = new Scanner(System.in);
    List<Student> classes5A = new ArrayList<>();
    CourseService courseService;
    public StudentService(CourseService courseService) {

        this.courseService = courseService;

        Course mat = courseService.getCourseByName("matematık");
        Course resim = courseService.getCourseByName("resım");
        // Öğrenci listesi oluşturma
        Student student1 = new Student("Ela", 1001, "5A SINIFI", mat,resim, 0.0, "kaldı");
        Student student2 = new Student("Lale", 1002, "5A SINIFI", mat, resim, 0.0, "kaldı");
        classes5A.add(student1);
        classes5A.add(student2);
    }


    public void addBulkExamNote(Teacher loggedTeacher){
        int selectClasses;
        System.out.println("not girisi icin sınıf seciniz");
        System.out.println("1-5A sınıfı");
        System.out.println("2-6A sınıfı");
        System.out.println("0-cıkıs");
        System.out.println("seciminiz");
        selectClasses = scan.nextInt();
        scan.nextLine();
        if (selectClasses == 1) {

            if (loggedTeacher.getBranch().toUpperCase().equals("MATEMATIK")){
                // Öğretmenin girdiği ders için öğrencilere not ekle
                for (Course course : courseService.courses){
                    if(course.getName().toUpperCase().equals("MATEMATIK")){

                        for (Student student : classes5A)
                        {
                            System.out.println(student.getName().toUpperCase()+" adlı ogrencinin notlarını giriniz.");
                            try {
                                System.out.print("1. yazılı notu: ");
                                int yaziliNotu1 = scan.nextInt();
                                System.out.print("2. yazılı notu: ");
                                int yaziliNotu2 = scan.nextInt();
                                System.out.print("1. sözlü notu: ");
                                int sozluNotu1 = scan.nextInt();
                                System.out.print("2. sözlü notu: ");
                                int sozluNotu2 = scan.nextInt();
                                System.out.print("3. sözlü notu: ");
                                int sozluNotu3 = scan.nextInt();

                                // Notları derse ve öğrenciye set et
                                course.setSinavNotu1(yaziliNotu1);
                                course.setSinavNotu2(yaziliNotu2);
                                course.setSozluNotu1(sozluNotu1);
                                course.setSozluNotu2(sozluNotu2);
                                course.setSozluNotu3(sozluNotu3);
                                course.setCourseOrtNot((yaziliNotu1+yaziliNotu2)* course.getYaziliNotuOran()/2 + (sozluNotu1+sozluNotu2+sozluNotu3)* course.getSozluNotuOran()/3);

                                // Öğrenciye notlarını yazdır

                                System.out.println(student.getName()+"  Güncel Matematik notları: " + student.getMat());

                            } catch (InputMismatchException e) {
                                System.out.println("Lütfen geçerli bir sayı girin.");
                                scan.nextLine(); // Geçersiz girdiyi temizle
                            }
                        }
                    }

                }
            } else if (loggedTeacher.getBranch().toUpperCase().equals("RESIM")) {
                // Öğretmenin girdiği ders için öğrencilere not ekle
                for (Course course : courseService.courses ){
                    if (course.getName().toUpperCase().equals(loggedTeacher.getBranch())){
                        for (Student student: classes5A){
                            System.out.println(student.getName().toUpperCase() +" adlı ogrencinin notlarını giriniz.");
                            try {
                                System.out.print("1. yazılı notu: ");
                                int yaziliNotu1 = scan.nextInt();
                                System.out.print("1. sözlü notu: ");
                                int sozluNotu1 = scan.nextInt();
                                System.out.print("2. sözlü notu: ");
                                int sozluNotu2 = scan.nextInt();

                                course.setSinavNotu1(yaziliNotu1);
                                course.setSozluNotu1(sozluNotu1);
                                course.setSozluNotu2(sozluNotu2);
                                course.setCourseOrtNot(yaziliNotu1* course.getYaziliNotuOran()/1 + (sozluNotu1+sozluNotu2)* course.getSozluNotuOran()/2);

                                System.out.println(student.getName()+"  Güncel Matematik notları: " + student.getResim());
                            }catch (InputMismatchException e) {
                                System.out.println("Lütfen geçerli bir sayı girin.");
                                scan.nextLine(); // Geçersiz girdiyi temizle
                            }

                        }
                    }
                }


            }
        }
        else if (selectClasses==2) {
            System.out.println("6A sınıfı henüz olusturulmamıstır.");
        } else if (selectClasses==0) {
            System.out.println("Iyi gunler dileriz");
        } else {
            System.out.println("Hatalı tuslama yaptınız tekrar deneyiniz.");
        }
    }


    public void calcAvarage(List<Student> students){
        for (Student student: students){

        }

    }
    public void isPass(){

    }

    public void printNote()
    {}
}
