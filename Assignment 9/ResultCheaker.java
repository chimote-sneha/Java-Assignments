/**
Student Result Checker
Create a class Student with fields: name, mathMarks, scienceMarks.
Use setters to assign values. Add a method getAverage().
 */

class Result{

  
    private String name;
    private int mathMarks;
    private int scienceMarks;

  
    public void setStuDetails(int mathMarks, String name, int scienceMarks) {
        this.mathMarks = mathMarks;
        this.name = name;
        this.scienceMarks = scienceMarks;
    }

    public double getAverage(){
        return (scienceMarks+mathMarks)%2;
    }

    public void setMath(int mathMarks) {
        this.mathMarks = mathMarks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScience(int scienceMarks) {
        this.scienceMarks = scienceMarks;
    }

    public void displayDetails() {
        System.out.println("Student Name  : " + name);
        System.out.println("Science Marks : " + scienceMarks);
        System.out.println("Maths Marks : " + mathMarks);
    }
}

class Main{
    public static void main(String args[]){
        Result rs = new Result();
        rs.setName("riya");
        rs.setMath(89);
        rs.setScience(98);
        rs.displayDetails();
        System.out.println("Average marks : "+ rs.getAverage());
    }
}