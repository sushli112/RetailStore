package model;

import java.time.LocalDate;

public class CustomerHistory {
    private String customerName;
    private LocalDate firstTran;

    public boolean isAffiliate() {
        return isAffiliate;
    }

    public void setAffiliate(boolean affiliate) {
        isAffiliate = affiliate;
    }

    private  boolean isAffiliate;

    public CustomerHistory(String customerName, LocalDate firstTran, boolean isAffiliate) {
        this.customerName = customerName;
        this.firstTran = firstTran;
        this.isAffiliate = isAffiliate;
    }


    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public LocalDate getFirstTran() {
        return firstTran;
    }

    public void setFirstTran(LocalDate firstTran) {
        this.firstTran = firstTran;
    }
}
