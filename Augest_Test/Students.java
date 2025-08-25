
class Students{
    private String name;
    private int marks;

    public Students(String name, int marks){
        this.name = name;
        this.marks = marks;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setMarks(int marks){
        this.marks = marks;
    }

    public String getName(){
        return name;
    }

    public int getMarks(){
        return marks;
    }

    public int getGrade(){
        if(marks >= 80){
         System.out.println("A");}
        else if(marks >= 60 && marks < 80){
          System.out.println("B");}
        else if(marks >= 40 && marks < 60){
         System.out.println("C");}
        else if( marks < 40){
         System.out.println("D");}
          
    }
    public void display(){
        getGrade();
        System.out.println("Student Details ");
        System.out.println("--------------------------------");
        System.out.println("Name : " + getName());
        System.out.println("Marks : " + getMarks());
        
}

class Main{
    public static void main(String args[]){
        Students s1 = new Students("Sania", 89);
        s1.display();
        s1.getGrade();
        Students s2 = new Students("Mansi",59);
        s2.display();
        s2.getGrade();
        Students s3 = new Students("Ram", 79);
        s3.display();
    }
}