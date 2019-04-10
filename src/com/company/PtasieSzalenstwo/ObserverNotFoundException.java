package com.company.PtasieSzalenstwo;

public class ObserverNotFoundException extends Exception {
    public ObserverNotFoundException(String errorMsg)
    {
        super("EXCEPTION: "+errorMsg);
    }
}
