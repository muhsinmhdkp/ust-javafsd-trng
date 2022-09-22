package java8;

interface Vehicle {
	default void print() {
		System.out.println("Iam a vehicle");
	}
	static void blowHorn() {
		System.out.println("Blowing horn!!!");
	}
}

interface FourWheeler{
	default void Print() {
		System.out.println("Iam a Four Wheeler");
	}
}
class Car1 implements Vehicle, FourWheeler{

		public void print() {
			Vehicle.super.print();
			FourWheeler.super.Print();
			Vehicle.blowHorn();
			System.out.println("Iam a car");
		}
}

public class Staticmethd2 {
	public static void main (String args[]) {
		Vehicle vehicle = new Car1();
		vehicle.print();
	}
}
