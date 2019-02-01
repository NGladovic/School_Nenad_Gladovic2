package course;


public class Course {
    
    private String name;
    private String codeName;
    private int numberOfClasses;
    
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setCodeName(String codeName){
        this.codeName = codeName;
    }
    public String getCodeName(){
        return this.codeName;
    }
    public void setNumberOfClasses(int numberOfClasses){
        this.numberOfClasses = numberOfClasses;
    }
    public int getNumberOfClasses(){
        return this.numberOfClasses;
    }
    
    public Course(){
        this.name = "QA";
        this.codeName = "Testiranje";
        this.numberOfClasses = 35;
    }
    
    public Course(String customName,String customCodeName,int customNumberOfClasses){
        this.name = customName;
        this.codeName = customCodeName;
        this.numberOfClasses = customNumberOfClasses;
    }
    
    public void courseInfo(){
        System.out.println("Kurs: " + this.name);
        System.out.println("Naziv kursa " + this.codeName);
        System.out.println("Broj casova: " + this.numberOfClasses);
        System.out.println(" ");
    }
    
}
