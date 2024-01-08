package sn.dev;

public class Main {

	public static void main(String[] args) {
		CustumeTimer ct = new CustumeTimer();
		ct.start(new CalculeListner() {
			
			@Override
			public void onStart() {
				System.out.print("lancement du prpgramme");
			}
			
			@Override
			public void onRun() {
				System.out.print("Loading...");
			}
			
			@Override
			public void onFinish() {
				System.out.print("c'est fini");
			}
		});
	}


		
}
