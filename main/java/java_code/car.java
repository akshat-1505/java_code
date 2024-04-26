package java_code;

abstract class car {
	 int regno;
	 car(int r){
		 regno=r;
	 }
	 void openTank() {
		 System.out.println("fill the tank");
	 }
	 abstract void steering(int direction,int angle);
	 abstract void braking(int force);
}
