package lk.itsei.pos.fx.util;

import lk.itsei.pos.fx.model.Customer;

import java.util.ArrayList;

public class ManageCustomers {

    private static ArrayList<Customer> customersDB = new ArrayList<>();

    static {
        customersDB.add(new Customer("C001","Kasun","Galle"));
        customersDB.add(new Customer("C002","Chathuranga","Colombo"));
        customersDB.add(new Customer("C003","Lakshan","Kandy"));
        customersDB.add(new Customer("C004","Nuwan","Colombo"));
    }

    public static ArrayList<Customer> getCustomersDB(){
        return customersDB;
    }

    public static void createCustomer(Customer customer){
        customersDB.add(customer);
    }
    public static void updateCustomer(int index, Customer customer){
        customersDB.get(index).setName(customer.getName());
        customersDB.get(index).setAddress(customer.getAddress());
    }

    public static void deleteCustomer(int index){
        customersDB.remove(index);
    }

    public static Customer findCustomer(String customerID){
        for (Customer customer:customersDB){
            if(customer.getId().equals(customerID)){
                return customer;
            }
        }
        return null;
    }
}
