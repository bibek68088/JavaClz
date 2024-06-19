/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB3;

/**
 *
 * @author bibek
 */
class InvoiceItem {

    String id;
    String desc;
    int qty;
    double unitPrice;

    InvoiceItem() {
    }

    InvoiceItem(String id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public String getID() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public double getTotal() {
        return unitPrice * qty;
    }

    public String toString() {
        return "InvoiceItem [ID = " + id + ", desc = " + desc + ", qty = " + qty + ", UnitPrice = " + unitPrice + "]";
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
}

public class Assignment5_InvoiceItem {

    public static void main(String args[]) {
        InvoiceItem initem = new InvoiceItem("Phone", "Apple", 10, 1099.00);
        System.out.println("Total : "+initem.getTotal());
        System.out.println("String : "+initem.toString());
    }
}
