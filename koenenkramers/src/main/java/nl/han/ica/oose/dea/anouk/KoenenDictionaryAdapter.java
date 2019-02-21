package nl.han.ica.oose.dea.anouk;

import nl.oose.dea.koenenkramers.KoenenDictionary;

public class KoenenDictionaryAdapter implements Dictionairy {

    public static KoenenDictionary dictionairy;

    public static KoenenDictionary getInstance() {
        if(dictionairy == null) {
            new KoenenDictionary().openEnglishDutch();
        }
        return dictionairy;
    }

    @Override
    public String translate(String translatable) {
        return getInstance().lookUp(translatable);

    }

    @Override
    public String getName() {
        return "Koenen";
    }

}
