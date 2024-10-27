package studentGradSystem;

import java.util.Scanner;

public class StudentGradSystem
{
    public static void main(String[] args)
    {

        start();


    }

    private static void start() {
        Scanner scan = new Scanner(System.in);
        int select;

        CourseService courseService = new CourseService();
        do {
        System.out.println("===ATATURK ORTAOKULU===");
        System.out.println("1-Idareci giris");
        System.out.println("2-Ogretmen giris");
        System.out.println("3-Ogrenci giris");
        System.out.println("0-Guvenli cıkıs");
        System.out.println("Seciminiz:");
        select = scan.nextInt();

        if(select==1){
            int idariSelect;

            System.out.println("1-Ogretmen ekleme");
            System.out.println("2-Sınıf ekleme");
            System.out.println("3-Ogrenci ekleme");
            idariSelect = scan.nextInt();
            scan.nextLine();

            if (idariSelect==1){
                courseService.addTeacher("adSoyad", "ders");
                courseService.printTeacher();


            }
        } else if (select==2)
        {


        } else if (select==3) {

        } else if (select==0) {
            System.out.println("Sistemden çıkısınız saglanıyor.Iyi günler dileriz ");
        }else {
            System.out.println("Hatalı tuslama yaptınız.Tekrar deneyiniz");
        }
    }while (select != 0 );

    }
}
