package com.mycompany.prj_padrao_strategy2.strategies;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author IFTM
 */
public class PayByCreditCard implements PayStrategy{
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private CreditCard card;
    
    @Override
    public void collectPaymentDetails(){
        try {
            System.out.println("Enter the card number: ");
            String number = READER.readLine();
            System.out.println("Enter the card expiration date 'mm/YY':");
            String date = READER.readLine();
            System.out.println("Enter the CVV code");
            String cvv = READER.readLine();
            card = new CreditCard(number, date, cvv);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Override
    public boolean pay(int paymentAmount){
        if(cardIsPresent()){
            System.out.println("Paying "+ paymentAmount + " using Credit Card.");
            card.setAmount(card.getAmount() - paymentAmount);
            return true;
        }else{
            return false;
        }
    }
    
    private boolean cardIsPresent(){
        return card != null;
    }
}
