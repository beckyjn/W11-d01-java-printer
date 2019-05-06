import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer();

    }

    @Test
    public void howManySheetsLeft(){
        assertEquals(100, printer.getSheetsOfPaper());
    }

    @Test
    public void canPrint(){
        printer.print(3, 2);
        assertEquals(94, printer.getSheetsOfPaper());
    }

    @Test
    public void cantPrintIfNotEnoughPaper(){
        printer.print(26, 4);
        assertEquals(100, printer.getSheetsOfPaper());
    }

    @Test
    public void canRefillPaperTray(){
        printer.refillPaperTray(50);
        assertEquals(150, printer.getSheetsOfPaper());
    }

    @Test
    public void hasToner(){
        assertEquals(100, printer.getTonerVolume());
    }

    @Test
    public void printUsesToner(){
        printer.print(3, 7);
        assertEquals(79, printer.getTonerVolume());
    }
}
