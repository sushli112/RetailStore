package service;

import model.CustomerBill;
import model.CustomerHistory;
import model.Employee;
import model.Item;

import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.util.*;

public class BillCalculator {
    private static  ArrayList<Employee> employees = new ArrayList<Employee>();
    private static  ArrayList<CustomerHistory> customerHistories = new ArrayList<CustomerHistory>();
    static {
        Employee employee = new Employee(112,"Sushil");
        Employee employee1 = new Employee(113,"kundan");
        employees.add(employee);
        employees.add(employee1);
        CustomerHistory customerHistory = new CustomerHistory("Ram", LocalDate.parse("2018-02-14"),true);
        CustomerHistory customerHistory1 = new CustomerHistory("Shyam",LocalDate.parse("2014-02-14"),false);
        customerHistories.add(customerHistory);
        customerHistories.add(customerHistory1);
    }
    public static void main(String[] args) {
        CustomerBill customerBill = new CustomerBill();
        Item item1 = new Item("I001","clothes",500);
        Item item2 = new Item("I002","groceries",200);
        Item item3 = new Item("I003","travel",300);
        Item item4 = new Item("I004","sports",100);
        Map<Item,Integer> billItems = new HashMap();
        billItems.put(item1,1);
        billItems.put(item2,2);
        billItems.put(item3,2);
        billItems.put(item4,3);
        customerBill.setCustomerName("shyam");
        customerBill.setBillItems(billItems);
        double totalAmount = calculateTotalAmount(customerBill);
        System.out.println(totalAmount);

    }
    public static double calculateTotalAmount(CustomerBill customerBill){
        int totalCurrAmount =0;
        double amountEligibleForDiscount =0;
        double totalDiscount = calculateDiscount(customerBill);
        for(Map.Entry entry : customerBill.getBillItems().entrySet()){
            Item item = (Item)entry.getKey();
            int qty = (Integer) entry.getValue();
            totalCurrAmount = totalCurrAmount + item.getItemPrice()*qty;
            if(!item.getItemType().equalsIgnoreCase("groceries")){
                amountEligibleForDiscount = amountEligibleForDiscount+ (item.getItemPrice()*qty*(totalDiscount/100));
            }

        }
        double finalPrice = totalCurrAmount - amountEligibleForDiscount;
        double finalPriceTemp = finalPrice;
        int extraDiscount =0;
        while (finalPriceTemp>=100){
            extraDiscount = extraDiscount+5;
            finalPriceTemp = finalPriceTemp-100;
        }
        return finalPrice-extraDiscount;
    }
    public  static double calculateDiscount(CustomerBill customerBill){
        double discount =0;
        if(isEmployee(customerBill)){
            return discount = 30;
        }else if(isAffiliate(customerBill)){
            return discount =10;
        }else if (relationAboveTwoYears(customerBill)){
            return discount = 5;
        }
        return 0;
    }
    public static boolean isEmployee(CustomerBill customerBill){
        for (Employee employee :employees){
            if(employee.getEmpoyeeName().equalsIgnoreCase(customerBill.getCustomerName())){
                return true;
            }
        }
        return false;
    }
    public  static  boolean isAffiliate(CustomerBill customerBill){
        for (CustomerHistory customerHistory :customerHistories){
            if(customerHistory.getCustomerName().equalsIgnoreCase(customerBill.getCustomerName())){
                return customerHistory.isAffiliate();
            }
        }
        return false;
    }
    public  static boolean relationAboveTwoYears(CustomerBill customerBill){
        for (CustomerHistory customerHistory :customerHistories){
            if(customerHistory.getCustomerName().equalsIgnoreCase(customerBill.getCustomerName())){
                LocalDate today = LocalDate.now();
                LocalDate startDate = customerHistory.getFirstTran();
                Period totalTime = Period.between(startDate,today);
                int years = totalTime.getYears();
                if(years>=2){
                    return true;
                }else{
                    return false;
                }
            }
        }
        return false;
    }

}
