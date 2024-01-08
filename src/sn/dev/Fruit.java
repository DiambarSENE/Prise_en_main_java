package sn.dev;

public abstract class Fruit {
	private String name ;
	
	public Fruit(String name) {
		super();
		this.name = name;
	}
	
	public abstract void taste();
	public abstract int size();
	public abstract boolean hasSeed();
	
	public void niam() {
		System.out.println("mangez cinq l'eguime par jour" + getName());
	}
	public String getName() {
		return name;
	}
	
	
}
