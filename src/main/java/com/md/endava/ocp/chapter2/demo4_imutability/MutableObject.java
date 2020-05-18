package com.md.endava.ocp.chapter2.demo4_imutability;

public class MutableObject {

	private int age;

	private int numberOfLeggs;

	private String name;

	private MutableClass newMutableClass;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getNumberOfLeggs() {
		return numberOfLeggs;
	}

	public void setNumberOfLeggs(int numberOfLeggs) {
		this.numberOfLeggs = numberOfLeggs;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MutableClass getNewMutableClass() {
		return newMutableClass;
	}

	public void setNewMutableClass(MutableClass newMutableClass) {
		this.newMutableClass = newMutableClass;
	}

	@Override
	public String toString() {
		return "MutableObject{" +
				"age=" + age +
				", numberOfLeggs=" + numberOfLeggs +
				", name='" + name + '\'' +
				", newMutableClass=" + newMutableClass +
				'}';
	}

	public static void main(String[] args) {

		MutableObject mutableObject = new MutableObject();

		mutableObject.setAge(100);
		mutableObject.setName("name1");
		mutableObject.setNumberOfLeggs(4);

		mutableObject.setNewMutableClass(new MutableClass());

		System.out.println(mutableObject);

		MutableClass newMutableClass = mutableObject.getNewMutableClass();
		newMutableClass.setNumberOfmethods(1);
		newMutableClass.setRate(2);
		System.out.println(mutableObject);

	}
}
