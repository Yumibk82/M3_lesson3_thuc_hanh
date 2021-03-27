package services;

import entities.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements ICustomerService{
    private static Map<Integer,Customer> customers;

    static {
        customers = new HashMap<>();
        customers.put(1,new Customer(1,"Hang","ttthang0102@gmail.com","Haiduong"));
        customers.put(2,new Customer(2,"Tuan","thanhtuandhbk@gmail.com","Thanhhoa"));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }

    @Override
    public void save(Customer customer) {
        customers.put(customer.getId(),customer);
    }

    @Override
    public void update(int id, Customer customer) {
        customers.put(id,customer);
    }

    @Override
    public void remove(int id) {
        customers.remove(id);
    }
}
