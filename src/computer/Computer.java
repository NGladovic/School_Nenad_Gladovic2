package computer;


public class Computer {
    
    private String operatingSystem;
    private double processTact;
    private double memory;
    private int hardDrive;
    
    
    public void setOperatingSystem(String operatingSystem){
        this.operatingSystem = operatingSystem;
    }
    
    public String getOperatingSystem(){
        return this.operatingSystem;
    }
    
    public void setProcessTact(double processTact){
        this.processTact = processTact;
    }
    
    public double getProcessTact(){
        return this.processTact;
    }
    
    public void setMemory(double memory){
        this.memory = memory;
    }
    
    public double getMemory(){
        return this.memory;
    }
               
    public void setHardDrive(int hardDrive){
        this.hardDrive = hardDrive;
    }
    
    public int getHardDrive(){
        return this.hardDrive;
    }
    
    
    public Computer(){
        this.operatingSystem = "Windows";
        this.processTact = 3.2;
        this.memory = 16;
        this.hardDrive = 1024;
    }
    
    public Computer(String customOs,double customProcessTact,double customMemory,int customHardDrive){
        this.operatingSystem = customOs;
        this.processTact = customProcessTact;
        this.memory = customMemory;
        this.hardDrive = customHardDrive;
    }
    
    public void compInfo(){
        System.out.println("Operativni sistem: " + this.operatingSystem);
        System.out.println("Procesor " + this.processTact + " GHz");
        System.out.println("RAM memorija " + this.memory + " GB");
        System.out.println("Hard disk " + this.hardDrive + " GB");
        System.out.println(" ");
    }
    
}
