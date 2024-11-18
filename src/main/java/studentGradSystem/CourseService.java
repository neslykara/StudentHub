package studentGradSystem;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CourseService
{
    Scanner scan = new Scanner(System.in);
    List<Teacher> teachers = new ArrayList<>();
    List<Course> courses = new ArrayList<>();


    //bu constructor 'dan nesne olusturdugumuzda içindekiler gelecek
    public CourseService() {
        //Dersleri olustur
        Course mat = new Course("MATEMATIK", new Teacher("CEYDA YILMAZ", "MATEMATIK"),0,0,0,0,0,0.0);
        Course resim = new Course("RESIM",new Teacher("NAZLI YILMAZ","RESİM"),0,0,0,0.0);
        courses.add(mat);
        courses.add(resim);

        //Ogretmenleri olustur
        Teacher teacher1 = new Teacher("CEYDA YILMAZ", "MATEMATIK");
        Teacher teacher5 = new Teacher("NAZLI YILMAZ","RESIM");
        Teacher teacher2 = new Teacher("MEHMET YILMAZ", "TURKÇE");
        Teacher teacher3 = new Teacher("ALI YILMAZ", "FEN BILIMLERI");
        Teacher teacher4 = new Teacher("BETUL YILMAZ","MUZIK");

        teachers.add(teacher1);
        teachers.add(teacher2);
        teachers.add(teacher3);
        teachers.add(teacher4);
        teachers.add(teacher5);
    }
    //Ogretmen giris
    public Teacher teacherLogin(){
        String name;
        String branch;
        System.out.println("Ad-soyad giriniz");
         name = scan.nextLine().toUpperCase();

        System.out.println("Bransınızı giriniz");
        branch = scan.nextLine().toUpperCase();

        for (Teacher teacher : teachers) {
            if (teacher.getName().equals(name) && teacher.getBranch().equals(branch)) {
                System.out.println("Giriş yapılıyor");
                return teacher;
            }
        }
        System.out.println("Sisteme kayıtlı değilsiniz veya hatalı giriş yaptınız.");
        return null;
    }

    // Ogretmenleri ekleme
    public void addTeacher(String name,String branch){
        String select;
        do {

            System.out.println("Ogretmen adını giriniz.");
            name = scan.nextLine();
            System.out.println("Ogretmenin branch'ını giriniz.");
            branch=scan.nextLine();
            Teacher teacher = new Teacher(name, branch);
            teachers.add(teacher);
            System.out.println("Devam etmek için herhangi bir tusa basınız, CIKIS yazarak sistemden cıkabilirsiniz.");
            select= scan.nextLine();

        }while (!select.toLowerCase().equals("cıkıs"));
        System.out.println("İsleminiz basarıyla gerceklesmistir.");
    }

    // Ogretmenleri yazdırma
    public void printTeacher()
    {
        System.out.println("Listede tün ögretmenlerimizi ve derslerini görebilirsiniz.");
        for (Teacher w : teachers){
            System.out.println(w);
        }
    }

    //Dersleri yazdırma
    public void printCourse()
    {
        System.out.println("Listede tün ögretmenlerimizi ve derslerini görebilirsiniz.");
        for (Course w : courses){
            System.out.println(w);
        }
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public List<Course> getCourses() {
        return courses;
    }
    public Course getCourseByName(String name) {
        for (Course course : courses) {
            if (course.getName().equalsIgnoreCase(name)) {
                return course;
            }
        }
        return null; // Eğer ders bulunamazsa null döner
    }
}
