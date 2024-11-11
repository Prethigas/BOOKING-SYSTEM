package TRAVEL;

public class TRAIN {
	private int tid;
	private boolean ac;
	private int capacity;
	
	TRAIN(int a,boolean b,int c)
	{
		this.tid = a;
		this.ac = b;
		this.capacity = c;
	}
	
	public int get_train()
	{
		return tid;
	}
	public boolean get_type()
	{
		return ac;
	}
	public int get_capacity()
	{
		return capacity;
	}
	
	public void display()
	{
		System.out.println("----------");
		System.out.println("train id:"+tid);
		System.out.println("ac??:"+ac);
		System.out.println("capacity:"+capacity);
		
	}
}
