package com.mycompany.prj_padrao_observer;

/**
 *
 * @author Pablo
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
