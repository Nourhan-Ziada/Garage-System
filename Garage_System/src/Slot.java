public class Slot {
	private boolean flag=false ;
	private int slotId;
	private double length;
	private double width;
	private static int  sId;
	static
	{
		sId=1;
	}
	public Slot() {
		slotId=sId;
		sId++;
	}
	
	public Slot(double len,double wid) 
	{
		length=len;
		width=wid;
		slotId=sId;
		sId++;
	}
	
	public void setFlag (boolean f) {
		 flag = f;
	    }
	 public int getId () {
	       return slotId;
	    }
	 public void display () {
	
		 if (flag== true) {
			  System.out.println("Slot state :Filled");
			}
		 else {System.out.println("Slot state :Empty");}
		 
		 System.out.println("Slot id = " + slotId);  
		 System.out.println("Length = " + length); 
		 System.out.println("Width = " + width); 
		 System.out.println("--------------------");
		 
	    }
	 public boolean getFlag () {
	       return flag;
	    }
	 
	 public double getLenght () {
	       return length;
	    }
	 public double getWidth () {
	       return width;
	    }
}

