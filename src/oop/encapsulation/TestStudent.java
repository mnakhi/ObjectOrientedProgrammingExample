package oop.encapsulation;

public class TestStudent {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.setStName("James");
        st1.setDob("08/08/08");
        st1.setStTuition(5000);
        st1.setStGrade("B");
        System.out.println(st1.getStName()+" "+st1.getDob()+" "+st1.getStTuition()+" "+st1.getStGrade());



    }
}
