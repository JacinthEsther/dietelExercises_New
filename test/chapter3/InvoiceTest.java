package chapter3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InvoiceTest {

    @Test
    void invoiceClassCanBeCreated(){
        Invoice invoice = new Invoice("013","Header",3,13.90);

        assertEquals(invoice.getPartNo(), "013");
        assertEquals(invoice.getPartDescription(), "Header");
        assertEquals(invoice.getPricePerItem(), 13.90);
        assertEquals(invoice.getQuantity(), 3);
    }

    @Test
    void invoiceAmountCanBeGotten(){
        Invoice invoice = new Invoice("013","Header",3,13.90);
        assertEquals(41.70, invoice.getInvoiceAmount());
    }

    @Test
    void testForSetMethods(){
        Invoice invoice = new Invoice();
        invoice.setPartDescription("Header");
        invoice.setPartNo("013");
        invoice.setPricePerItem(13.90);
        invoice.setQuantity(3);

        assertEquals(41.70, invoice.getInvoiceAmount());

    }
}
