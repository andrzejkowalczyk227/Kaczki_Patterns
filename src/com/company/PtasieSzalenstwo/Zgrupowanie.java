package com.company.PtasieSzalenstwo;

import java.util.ArrayList;

public class Zgrupowanie implements Kaczkowate{

    private ArrayList<Kaczkowate> kaczkowate = new ArrayList<>();
    private int level = 0;

    public void addKaczkowate(ArrayList<Kaczkowate> kaczkowate)
    {
        this.kaczkowate = kaczkowate;
    }

    public void addKaczkowate(Kaczkowate kaczka)
    {
        if(kaczka instanceof Zgrupowanie)
        {
            ((Zgrupowanie) kaczka).setLevel(level+1);
        }
        kaczkowate.add(kaczka);
    }

    @Override
    public void kwa()
    { // delegating
        System.out.println("========\nGRUPA "+level);
        for (Kaczkowate k: kaczkowate)
        {
            k.kwa();
        }
        System.out.println("========");
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
