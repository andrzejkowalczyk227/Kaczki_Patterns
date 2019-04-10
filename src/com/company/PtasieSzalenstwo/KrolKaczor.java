package com.company.PtasieSzalenstwo;

public final class KrolKaczor implements Kaczkowate
{
    static private volatile KrolKaczor krol = null;

    private KrolKaczor() {}

    public static KrolKaczor getInstance()
    {
        if(krol == null)
        {
            synchronized (KrolKaczor.class)
            {
                if(krol == null)
                {
                    krol = new KrolKaczor();
                }
            }
        }
        return krol;
    }

    public void kwa()
    {
        System.out.println("KROLEWSKIE KWA KWA");
    }
}
