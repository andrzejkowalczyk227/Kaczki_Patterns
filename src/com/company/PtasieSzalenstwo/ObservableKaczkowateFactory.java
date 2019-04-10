package com.company.PtasieSzalenstwo;

public class ObservableKaczkowateFactory implements KaczkowateAbstactFactory{
    @Override
    public Kaczkowate getKaczka() {
        return new KaczkowatePodOkiem(new Kaczka());
    }

    public Kaczkowate getKurczak(){
        return new KaczkowatePodOkiem(new KurczakAdapter(new Kurczak()));
    }
}
