package com.company.PtasieSzalenstwo;

public class KaczkowateFactory implements KaczkowateAbstactFactory {
    @Override
    public Kaczkowate getKaczka() {
        return new Kaczka();
    }

    @Override
    public Kaczkowate getKurczak() {
        return new KurczakAdapter(new Kurczak());
    }
}
