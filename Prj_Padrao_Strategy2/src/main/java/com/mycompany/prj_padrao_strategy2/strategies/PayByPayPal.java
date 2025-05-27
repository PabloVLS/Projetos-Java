package com.mycompany.prj_padrao_strategy2.strategies;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author IFTM
 */
public class PayByPayPal implements PayStrategy {
    private static final Map<String, String> DATA_BASE = new HashMap<>();
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private String email;
    private String password;
    private boolean signedIn;
    
    static {
        DATA_BASE.put("amanda1985", "amanda@ya.com");
        DATA_BASE.put("qwerty", "john@amazon.eu");
    }
        @Override
        public void collectPaymentDetails(){
                try {
                    while(!signedIn){
                        System.out.println("Enter the user email: ");
                        email = READER.readLine();
                        System.out.println("Enter the password: ");
                        password = READER.readLine();
                        if(verify()){
                            System.out.println("Data verification has ben successful");
                        }else{
                            System.out.println("Wrong email or password!");
                        }
                    }
                } catch (Exception e) {
                        e.printStackTrace();
                }
        }
        private boolean verify(){
            setSignedIn(email.equals(DATA_BASE.get(password)));
            return signedIn;
        }

    @Override
    public boolean pay(int paymentAmount) {
        if(signedIn){
            System.out.println("Paying "+ paymentAmount + " using PayPal.");
            return true;
        }else{
            return false;
        }
    }

    private void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;
    }
    
    

        
        
    }

