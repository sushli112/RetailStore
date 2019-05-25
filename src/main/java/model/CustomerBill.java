package model;

import java.io.Serializable;
import java.util.Map;

public class CustomerBill implements Serializable {
    private static final long SerialVersionUID = 10l;
    private String customerName;



    private Integer totalAmount;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Map<Item, Integer> getBillItems() {
        return billItems;
    }

    public void setBillItems(Map<Item, Integer> billItems) {
        this.billItems = billItems;
    }

    private Map<Item, Integer> billItems;


}
