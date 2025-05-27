package com.mycompany.prj_padrao_strategy2.strategies;

/**
 *
 * @author IFTM
 */
public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}
