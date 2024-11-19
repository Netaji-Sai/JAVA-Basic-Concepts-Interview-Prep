class Student{
    private String name;
    private int rollNo;
    private int grade;
    void setName(String x){
        this.name = x;
    }
    void setRollNo(int y){
        this.rollNo = y;
    }
    void setGrade(int z){
        if(z>100 || z<0){
            System.out.println("Inavlid Grade");
        }
        else{
            this.grade = z;
        }
    }
    void getDetails(){
        System.out.println("Name : "+name+"\nRollNumber: "+rollNo+"\nGrade : "+grade);
    }
}


public class Encapsulation {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setGrade(-129);
        s1.setName("Netaji");
        s1.setRollNo(21);
        s1.getDetails();
    }
}
