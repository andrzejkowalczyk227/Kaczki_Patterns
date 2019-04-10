package com.company.PtasieSzalenstwo;

public class Ornitolog implements KaczkowateObserver
{
    private int kwakniecia = 0;

    @Override
    public void update() {
        kwakniecia = getKwakniecia() + 1;
    }

    public int getKwakniecia() {
        return kwakniecia;
    }
}
