/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package customermailapplication;

import java.util.Scanner;

/**
 *
 * @author sarun
 */
public class CustomerMailApplication {

    /**
     * @param args the command line arguments
     */
    private Customer customer;
    public static Customer getCustomerTypeFromUser() {
        Customer cust = null;
        Scanner inp = new Scanner(System.in);
        System.out.print("Please choose customer type 1. Regular, 2. Mountain, 3. Delinquent ");
        int type = inp.nextInt();
        switch(type) {
            case 1:
                //app.getCustomerTypeFromUser("Regular");
                cust = CustomerFactory.createCustomer("Regular");
                break;
            case 2:
                //app.getCustomerTypeFromUser("Mountain");
                cust = CustomerFactory.createCustomer("Mountain");
                break;
            case 3:
                //app.getCustomerTypeFromUser("Delinquent");
                cust = CustomerFactory.createCustomer("Delinquent");
                break;
            
        }
        return cust;
        
    }
    public static String generateMail(Customer customer) {
        return customer.createMail();
    }
    
    public static void main(String[] args) {
        //CustomerMailApplication app = new CustomerMailApplication();
        Customer customer = getCustomerTypeFromUser();
        String mail = null;
        if(customer != null){
            mail = generateMail(customer);
            System.out.println(mail);
        }else{
            System.out.print("ERR");
        }
        //Customer cust = null;
        //getCustomerTypeFromUser();
        //System.out.print(getCustomerTypeFromUser());
       // System.out.println(app.generateMail());   
       
    }
}
