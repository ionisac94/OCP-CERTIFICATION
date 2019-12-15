package com.md.endava.ocp.chapter2.demo3;

public class Demo1 {

	public static void main(String[] args) {

		Animal delfin = new Animal("delfin", false, true);
		Animal buterfly = new Animal("buterfly", true, false);
		Animal kangoroo = new Animal("kangoroo", true, false);


		checkThatCanHop(delfin, animal -> animal.canHop());
		checkThatCanHop(buterfly, animal -> animal.canHop());
		checkThatCanHop(kangoroo, animal -> animal.canHop());
	}

	private static void checkThatCanHop(Animal animal, CheckTrait checkTrait) {

		if (checkTrait.test(animal)) {
			System.out.println(animal);
		}
	}
}


