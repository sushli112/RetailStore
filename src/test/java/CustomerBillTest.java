import model.CustomerBill;
import model.Item;
import org.junit.Assert;
import org.junit.Test;
import service.BillCalculator;

import java.util.HashMap;
import java.util.Map;

public class CustomerBillTest {

    @Test
   public void billForEmployeeTest(){
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
        customerBill.setCustomerName("Sushil");
        customerBill.setBillItems(billItems);
        Assert.assertEquals(1315.0d, BillCalculator.calculateTotalAmount(customerBill),0.2);
    }
     @Test
     public void billForAffiliateTest(){
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
          customerBill.setCustomerName("Ram");
          customerBill.setBillItems(billItems);
          Assert.assertEquals(1580.0d, BillCalculator.calculateTotalAmount(customerBill),0.2);
     }
     @Test
     public void billForCustomeOlderThanTwoYearsTest(){
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
          Assert.assertEquals(1645.0d, BillCalculator.calculateTotalAmount(customerBill),0.2);
     }

}
