package com.company;

import com.company.PtasieSzalenstwo.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Kaczka kaczka = new Kaczka();
        Kurczak kurczak = new Kurczak();
        kaczka.kwa();
        kurczak.kwo();

        ArrayList arrList = new ArrayList();
        arrList.add(kaczka);
        arrList.add(kurczak);
        for (Object o: arrList)
        {
            if(o instanceof Kaczkowate )
                ((Kaczkowate) o).kwa();
            else if (o instanceof Kurczak)
                ((Kurczak) o).kwo();
        }

        // with adapter
        ArrayList<Kaczkowate> arrKaczki = new ArrayList<>();
        arrKaczki.add(kaczka);
        arrKaczki.add(new KurczakAdapter(kurczak));
        for (Kaczkowate k: arrKaczki)
        {
            k.kwa();
        }

        // singleton
        Kaczkowate krol = KrolKaczor.getInstance();
        krol.kwa();

        // observer as decorator
        Ornitolog ornitolog = new Ornitolog();
        Ornitolog ornitolog2 = new Ornitolog();
        KaczkowatePodOkiem kpo = new KaczkowatePodOkiem(new Kaczka());
        KaczkowatePodOkiem kpo2 = new KaczkowatePodOkiem(new KurczakAdapter(new Kurczak()));
        KaczkowatePodOkiem kpo3 = new KaczkowatePodOkiem(KrolKaczor.getInstance());
        kpo.registerObserver(ornitolog);
        kpo2.registerObserver(ornitolog);
        kpo3.registerObserver(ornitolog);
        kpo.kwa();
        kpo2.kwa();
        kpo3.kwa();
        System.out.println("Kwakniec: " + ornitolog.getKwakniecia());

        try {
            kpo2.deleteObserver(ornitolog2);
        }
        catch (ObserverNotFoundException ex)
        {
            System.out.println(ex.getMessage());
        }

        // grouping
        Zgrupowanie grupa1 = new Zgrupowanie();
        grupa1.addKaczkowate(kaczka);
        grupa1.addKaczkowate(new KurczakAdapter(kurczak));

        Zgrupowanie grupa2 = new Zgrupowanie();
        grupa2.addKaczkowate(kpo);
        grupa2.addKaczkowate(kpo2);
        grupa1.addKaczkowate(grupa2);
        grupa1.addKaczkowate(kpo3);

        grupa1.kwa();
    }
}
