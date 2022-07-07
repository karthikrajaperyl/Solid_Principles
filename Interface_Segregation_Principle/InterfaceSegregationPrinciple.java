package Interface_Segregation_Principle;
interface PrinterService
{
	void photoCopy();
	void FaxCopy();
	void scanCopy();
	void printCopy();
	void duplexPrint();
}
class LaserPrinter implements PrinterService
{

	@Override
	public void photoCopy() {
		System.out.println("Print photo");
	}

	@Override
	public void FaxCopy() {
		
	}

	@Override
	public void scanCopy() {
		
	}

	@Override
	public void printCopy() {
		System.out.println("Print copy");
	}

	@Override
	public void duplexPrint() {
		
	}
	
}
class FlexPrinter implements PrinterService
{

	@Override
	public void photoCopy() {
		
	}

	@Override
	public void FaxCopy() {
		
	}

	@Override
	public void scanCopy() {
		System.out.println("Scan the Copy");
	}

	@Override
	public void printCopy() {
		System.out.println("Print copy");
	}

	@Override
	public void duplexPrint() {
		
	}
	
}

public class InterfaceSegregationPrinciple {

	public static void main(String[] args) {
		LaserPrinter laserPrint = new LaserPrinter();
		laserPrint.printCopy();
		laserPrint.photoCopy();
		FlexPrinter flexPrint = new FlexPrinter();
		flexPrint.printCopy();
		flexPrint.scanCopy();
	}

}
