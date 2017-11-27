import greenfoot.*;  

/**
 * Write a description of class Classroom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Classroom extends World
{   
    /**
     * Constructor for objects of class Classroom.
     * 
     */
    public Classroom()
    {    
        super(600, 400, 1); 
        
        prepare();
    }
    
    private void prepare()
    {
        Student student1 = new Student(1, "Donald", "Trump", 1, 0.1, true);
        Student student2 = new Student(2, "Barack", "Obama", 11, 90.5, false);
        Student student3 = new Student(3, "Hillary", "Clinton", 2, 1.0, false);
        
        addObject( student1, 60, 60 );
        addObject( student2, 540, 60 );
        addObject( student3, 300, 340 );
    }
}
