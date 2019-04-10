package com.company.PtasieSzalenstwo;

public class KurczakAdapter implements Kaczkowate{

    private Kurczak kurczak;

    public KurczakAdapter( Kurczak kurczak )
    {
        this.kurczak = kurczak;
    }

    public void kwa()
    {
        kurczak.kwo();
    }
}
