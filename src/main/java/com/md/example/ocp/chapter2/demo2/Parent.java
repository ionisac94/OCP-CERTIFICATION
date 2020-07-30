package com.md.example.ocp.chapter2.demo2;

public class Parent {

	private final String firstName, lastName;

	private final String address;

	private final String phone;

	private Cildren cildren; // optional

	public Parent(ParentBuilder parentBuilder) {
		this.firstName = parentBuilder.firstName;
		this.lastName = parentBuilder.lastName;
		this.address = parentBuilder.address;
		this.phone = parentBuilder.phone;

		this.cildren = parentBuilder.cildren;

	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getAddress() {
		return address;
	}

	public String getPhone() {
		return phone;
	}

	public Cildren getCildren() {
		return cildren;
	}

	@Override
	public String toString() {
		return "Parent{" +
				"firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", address='" + address + '\'' +
				", phone='" + phone + '\'' +
				", cildren=" + cildren +
				'}';
	}

	static class ParentBuilder {

		private final String firstName, lastName;

		private final String address;

		private final String phone;

		private Cildren cildren;


		public ParentBuilder(String firstName, String lastName, String address, String phone) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.address = address;
			this.phone = phone;
		}

		public ParentBuilder setCildren(Cildren cildren) {
			this.cildren = cildren;
			return this;
		}

		public Parent build() {
			return new Parent(this);
		}
	}

}
