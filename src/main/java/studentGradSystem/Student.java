package studentGradSystem;

public class Student
{
    String name;
    int stuNo;
    int classes;
    Course courseTurk;
    Course courseMat;
    Course courseFen;
    double avarage;
    String isPass;


    public Student(String name, int stuNo, int classes, Course courseTurk, Course courseMat, Course courseFen) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.courseTurk = courseTurk;
        this.courseMat = courseMat;
        this.courseFen = courseFen;
        this.avarage = avarage;
        this.isPass = isPass;
    }

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

    public int getClasses() {
        return classes;
    }

    public void setClasses(int classes) {
        this.classes = classes;
    }

    public double getAvarage() {
        return avarage;
    }

    public String getIsPass() {
        return isPass;
    }


}
