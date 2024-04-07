package com.DUMMY2;

public class ArrayOfObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Products[] p1 = new Products[5];
		// create and initialize actuals product object using constructor
		p1[0] = new Products(5454, "apple mac book");
		p1[1] = new Products(4578, "hp monitor");
		p1[2] = new Products(57878, "compaq");
		p1[0].display();
		p1[1].display();
		p1[2].display();
		System.out.println("<===============using for each loop===========>");
		for (Products pp : p1) {
			if (pp != null) {
				pp.display();
			}
		}

	}

}

class Products {

	private int id;
	private String prodName;

	Products(int id, String prodName) {
		super();
		this.id = id;
		this.prodName = prodName;
	}

	void display() {
		System.out.println("id +" + id + "name" + prodName);

	}

}
