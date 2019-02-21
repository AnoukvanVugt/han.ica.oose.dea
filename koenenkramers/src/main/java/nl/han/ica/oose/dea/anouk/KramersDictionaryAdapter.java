package nl.han.ica.oose.dea.anouk;

import nl.oose.dea.koenenkramers.KramersDictionary;

public class KramersDictionaryAdapter implements Dictionairy {
    @Override
    public String translate(String translatable) {
        return new KramersDictionary().find(translatable);
    }

    @Override
    public String getName() {
        return "Kramers";
    }
}
