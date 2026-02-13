package application;

import devices.ComboDevice;
import devices.ConcretePrinter;
import devices.ConcreteScanner;

public class Program {

	public static void main(String[] args) {
		ConcretePrinter p = new ConcretePrinter("1080");
		p.processDoc("My letter");
		p.printDoc("My letter");
		
		System.out.println();
		
		ConcreteScanner s = new ConcreteScanner("2003");
		s.processDoc("My email");
		System.out.println("Scan result: " + s.scan());
		
		System.out.println();
		
		ComboDevice c = new ComboDevice("2007");
		c.processDoc("My doc");
		System.out.println("Scan result: " + c.scan());
		c.printDoc("My doc");
	}

}
