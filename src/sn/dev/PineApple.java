package sn.dev;

public class PineApple extends Fruit {

	public PineApple(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void taste() {
		System.out.println("l'annanas a un gout [plutot acide");
		super.niam();
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public boolean hasSeed() {
		// TODO Auto-generated method stub
		return false;
	}

}
