"# RetailStore"
Steps to run Application:-
  1. To have a datset for CustomerHistory and Employee , i am initializing under static block so it will available for bill      processing.CustomerHistory object contain details about customer like customer name and time since when he is connected to store. Employee object contain store employee details like employee name and id;
  2. To calculate the final bill amount, create a CustomerBill object that will contain customer name and all item details with quantity.
  3. finally feed this CustomerBill object to calculateTotalAmount method that will give to final bill amount after calculation.
  4. For sample three test cases has been written to test three scenario :-
      a) customer is an employee
      b) customer is an affiliate customer
      c) customer has been in connection with store for 2 years and above.
  5. Run the test cases by running CustomerBillTest class.
