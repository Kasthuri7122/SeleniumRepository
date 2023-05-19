package org.system;
public class Desktop extends Computer{
public void desktopSize() {
	System.out.println("40 cm");
}
	public static void main(String[] args) {
		Desktop dk = new Desktop();
		dk.computerModel();
		dk.desktopSize();
	}
	}

