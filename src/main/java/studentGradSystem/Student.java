package studentGradSystem;

public class Student
{
  private String name;
  private int stuNo;
  private String classes;
  private   Course mat;
  private   Course resim;
  private double avarage;
  private String isPass;

    public Student(String name, int stuNo, String classes, Course mat,  Course resim, double avarage, String isPass) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.mat = mat;
        this.resim = resim;
        this.avarage = avarage;
        this.isPass = isPass;
    }

    //getter-setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStuNo() {
        return stuNo;
    }

    public void setStuNo(int stuNo) {
        this.stuNo = stuNo;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public Course getMat() {
        return mat;
    }

    public void setMat(Course mat) {
        this.mat = mat;
    }

    public Course getResim() {
        return resim;
    }

    public void setResim(Course resim) {
        this.resim = resim;
    }

    public double getAvarage() {
        return avarage;
    }

    public void setAvarage(double avarage) {
        this.avarage = avarage;
    }

    public String getIsPass() {
        return isPass;
    }

    public void setIsPass(String isPass) {
        this.isPass = isPass;
    }



}
