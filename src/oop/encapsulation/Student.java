package oop.encapsulation;

public class Student {
    private String stName;
    private String dob;
    private int stTuition;
    private String stGrade;
    public Student(){

    };

    public Student(String stName, String dob, int stTuition, String stGrade) {
        this.stName = stName;
        this.dob = dob;
        this.stTuition = stTuition;
        this.stGrade = stGrade;
    }

    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        this.stName = stName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getStTuition() {
        return stTuition;
    }

    public void setStTuition(int stTuition) {
        this.stTuition = stTuition;
    }

    public String getStGrade() {
        return stGrade;
    }

    public void setStGrade(String stGrade) {
        this.stGrade = stGrade;
    }
}

