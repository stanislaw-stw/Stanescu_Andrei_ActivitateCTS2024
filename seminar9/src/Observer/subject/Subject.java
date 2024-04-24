package Observer.subject;

import Observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    List<Observer> observers;

    public Subject() {
        this.observers = new ArrayList<>();
    }

    public void adaugaAbonat(Observer observer){
        observers.add(observer);
    }

    public void stergeAbonat(Observer observer){
        observers.remove(observer);
    }

    public void notificaAbonati(String mesaj){
        for(Observer observer:observers){
            observer.primesteNotificare(mesaj);
        }
    }

    public abstract void notificaMeciFotbal();
    public abstract void notificaMeciVolei();
    public abstract void notificaMeciHandbal();
}
