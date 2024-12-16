// import javax.sound.sampled.SourceDataLine;

public class classes_objects {
    public static void main(String [] args ){
        person p1=new person();   //---------------Default constructor 
        p1.age=20;
        p1.name="Hardik";
        // System.out.println((p1.age=20)+" "+p1.name); 
        
        person p2=new person(31,"Jayesh");


    p1.eat();
    p1.walk();
    p1.walk(5);

    System.out.println(person.count);

    developer d1=new developer(24, "Kundan");
    d1.walk(10);
    d1.run();
    }
    
}

//--------------Inheritance

class developer extends person{
    public developer(int age,String name){
        super(age,name);//It is used to call constructor of a parent
    }
    void run(){
        System.out.println("Developer "+name+" Running ");
    }     
}


//-------------Classes and Objects 
class person{
    String name;
    int age;

    static int count; //----------Now its static is property of class not object 

    public person(){
        count++;
        System.out.println("Creating an object");
    }
    //--------------Paramterized constructor
    public person(int Age,String Name){
        this();  //--------this  keyword is used when one constructor need to call another constructor 
        this.name=Name;
        this.age=Age;
    }  
    //------------Using SOme methods 
    //--------void is return type and walk and eat are function/Method   
    void eat(){
        System.out.println(name+" is eating food");

    }
    void walk(){
        System.out.println(name +" is walking");
    }
    //----------------Arguement passed 
    void walk(int steps){
        System.out.println(name+" Walked "+steps);

     
    
    }
}
