package FacadePattern;

public class ComputerFacade {
	
	private CPU cpu;
	private Memory memory;
	private HardDrive hardDrive;
	
	public ComputerFacade() {
		this.cpu=new CPU();
		this.hardDrive=new HardDrive();
		this.memory=new Memory();
	}
	
	public void start()
	{
		 System.out.println("ComputerFacade: Starting the computer...");
	     cpu.freeze();
	     memory.load(0, hardDrive.read(0, 1024));
	     cpu.jump(0);
	     cpu.execute();
	     System.out.println("ComputerFacade: Computer has started.");
	}

}
