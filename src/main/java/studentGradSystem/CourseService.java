package studentGradSystem;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CourseService
{
    Scanner scan = new Scanner(System.in);
    List<String> className = new ArrayList<>();
    List<Teacher> teachers = new ArrayList<>();
    List<String> teachersName = new ArrayList<>();


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
    public void printTeacher()
    {
        System.out.println("Listede tün ögretmenlerimizi ve derslerini görebilirsiniz.");
        for (Teacher w : teachers){
            System.out.println(w);
        }
    }
}
