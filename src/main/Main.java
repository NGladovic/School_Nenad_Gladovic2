package main;
import students.Students;
//import course.Course;
//import computer.Computer;

public class Main {

    
    public static void main(String[] args) {
       
        Students cubes = new Students();
        cubes.studentsInfo();
       
        
        cubes.getCourse().courseInfo();
        cubes.getComputer().compInfo();
        
        Students data = new Students();
        data.setFirstName("Petar");
        data.setLastName("Petrovic");
        data.setYearOfBirth(2001);
        data.studentsInfo();
        
        data.getCourse().setName("qa");
        data.getCourse().setNumberOfClasses(13);
        data.getComputer().setProcessTact(4.1);
        data.getComputer().setMemory(8);
        data.getComputer().setHardDrive(2048);
        data.studentsInfo();
        data.getCourse().courseInfo();
        data.getComputer().compInfo();
      
       
        
       
        
        
        
     
        
//        cubes.setLastName("Ligu");
//        cubes.setFirstName("Gigu");
//        cubes.setYearOfBirth(1991);
//        cubes.studentsInfo();
        
        
//        Students kids = new Students("Stefan", "Peric", 2010);
//        kids.studentsInfo();
//        
//        Course qa = new Course();
//        qa.courseInfo();
//        
//        qa.setName("Front-End");
//        qa.setCodeName("Developer");
//        qa.setNumberOfClasses(53);
//        qa.courseInfo();
//        
//        Computer pc = new Computer();
//        pc.compInfo();
//        
//        pc.setHardDrive(600);
//        pc.setMemory(8);
//        pc.setProcessTact(2.4);
//        pc.compInfo();
//        
//        Computer dell = new Computer("Linux", 1.1, 4, 250);
//        dell.compInfo();
//        
//        dell.setHardDrive(500);
//        dell.setOperatingSystem("Mac");
//        dell.compInfo(); 
       
    }
    
}
