package sn.dev;

public class Apple extends Fruit {

	public Apple() {
		super("pomme");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void taste() {
		System.out.println("le pomme a un gout plutot sucre");
		super.niam();
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public boolean hasSeed() {
		// TODO Auto-generated method stub
		return true;
	}

}
