package sn.dev;

public class Wiki extends Fruit implements Contrats{

	public Wiki() {
		super("sucree");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void taste() {
		System.out.println("le wiki a un gout plutot sucree");

	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public boolean hasSeed() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void gout() {
		System.out.println("wiki");
		
	}

}
