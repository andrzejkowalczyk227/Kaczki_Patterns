package com.company.PtasieSzalenstwo;

public interface KaczkowateObservable
{
    void registerObserver(KaczkowateObserver kObs);
    void deleteObserver(KaczkowateObserver kObs) throws ObserverNotFoundException;
    void notifyObservers();
}
