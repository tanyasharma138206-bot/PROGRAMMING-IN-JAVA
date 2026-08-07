### Java Program: Demonstration of Encapsulation

class Student
{
    // Private data members
    private int rollNo;
    private String name;

    
    public void setRollNo(int r)
    {
        rollNo = r;
    }

    
    public int getRollNo()
    {
        return rollNo;
    }

    
    public void setName(String n)
    {
        name = n;
    }

   
    public String getName()
    {
        return name;
    }
}

class EncapsulationDemo
{
    public static void main(String args[])
    {
        Student s = new Student();

        
        s.setRollNo(101);
        s.setName("Rahul");

        
        System.out.println("Roll No: " + s.getRollNo());
        System.out.println("Name: " + s.getName());
    }
}
