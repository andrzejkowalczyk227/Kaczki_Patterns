package com.company.PtasieSzalenstwo;

import java.util.ArrayList;

public class KaczkowatePodOkiem implements KaczkowateObservable, Kaczkowate
{
    Kaczkowate kaczkowate;
    ArrayList<KaczkowateObserver> kObsers;

    public KaczkowatePodOkiem( Kaczkowate kaczkowate )
    {
        this.kaczkowate = kaczkowate;
        kObsers = new ArrayList<>();
    }

    @Override
    public void registerObserver(KaczkowateObserver kObs) {
        kObsers.add(kObs);
    }

    @Override
    public void deleteObserver(KaczkowateObserver kObs) throws ObserverNotFoundException {
        if(!kObsers.remove(kObs))
        {
            throw new ObserverNotFoundException("Observer not registered");
        }
    }

    @Override
    public void notifyObservers() {
        for ( KaczkowateObserver kObs: kObsers )
        {
            kObs.update();
        }
    }

    @Override
    public void kwa() {

        notifyObservers();
        kaczkowate.kwa();
    }
}
