package Interface_Segregation_Principle;

interface PrinterCopy {
	void photoCopy();

	void FaxCopy();
}

interface Xerox {
	void scanCopy();

	void printCopy();
}

interface CopySide {
	void duplexPrint();
}

class LaserPrinter implements CopySide, PrinterCopy {
	@Override
	public void duplexPrint() {
		System.out.println("Its print on two side.It also offer printing on two sides.");
	}

	@Override
	public void photoCopy() {
		System.out.println("Photo copy is done");
	}

	@Override
	public void FaxCopy() {
		System.out.println("Fax Will be done");
	}

}

class FlexPrinter implements Xerox {
	@Override
	public void scanCopy() {
		System.out.println("Scanning id done");

	}

	@Override
	public void printCopy() {
		System.out.println("Printing is done");
	}
}

class InkJet implements PrinterCopy {
	@Override
	public void photoCopy() {
		System.out.println("Operation is done");
	}

	@Override
	public void FaxCopy() {
		System.out.println("Fax is done");
	}

}

public class InterfaceSegregationPrinciple1 {

	public static void main(String[] args) {
		LaserPrinter laserPrint = new LaserPrinter();
		laserPrint.FaxCopy();
		laserPrint.duplexPrint();
		FlexPrinter flexPrint = new FlexPrinter();
		flexPrint.printCopy();
		flexPrint.scanCopy();
		InkJet inkjet = new InkJet();
		inkjet.FaxCopy();
		inkjet.photoCopy();
	}

}
