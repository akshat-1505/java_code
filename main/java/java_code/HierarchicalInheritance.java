//  hierarchical inheritance example
package java_code;

class student1
{
    private String name;
    private int rno;
    
    void setname(String name, int rno)
    {
        this.name = name;
        this.rno = rno;
    }
    
    void display()
    {
        System.out.println("Name : "+name);
        System.out.println("Roll No : "+rno);
    }
    
}

class science1 extends student1
{
    private int chem, bio, phy;
    
    void setmarks(int a, int b, int c)
    {
        super.setname("student 1", 1);
        chem = a;
        bio = b;
        phy = c;
    }
    
    void display()
    {
        super.display();
        System.out.println("Chemistry : " +chem);
        System.out.println("Biology : "+ bio);
        System.out.println("Physics : " +phy+"\n");
    }
}

class commerce1 extends student1
{
    private int ac, bom, st;
    
    void setmarks(int a, int b, int c)
    {
        super.setname("student 2", 2);
        ac = a;
        bom = b;
        st = c;
    }
    
    void display()
    {
        super.display();
        System.out.println("Account : "+ac);
        System.out.println("BOM : "+bom);
        System.out.println("ST : "+st+"\n");
    }
}

class arts1 extends student1
{
    
    private int sanskrit, psychology, philosophy;
    
    void setmarks(int a, int b, int c)
    {
        super.setname("student 3", 3);
        sanskrit = a;
        psychology = b;
        philosophy = c;
    }
    
    void display()
    {
        super.display();
        System.out.println("Sanskrit : "+sanskrit);
        System.out.println("Psychology : "+psychology);
        System.out.println("Philosophy : "+philosophy+"\n");
    }
}

public class HierarchicalInheritance
{
    public static void main(String[] args) 
    {
	student1 stu = new student1();
        science1 sci = new science1();
        commerce1 com = new commerce1();

        sci.setmarks(100, 90, 99);
        sci.display();
        
        com.setmarks(87, 85, 80);
        com.display();
        
        
    }
}



