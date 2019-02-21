package nl.han.ica.oose.dea.anouk;


public class DictionairyFactory {
    public static DictionairyFactory factory;

    public static DictionairyFactory getInstance() {
        if(factory == null) {
            factory = new DictionairyFactory();
        }
        return factory;
    }

    public Dictionairy create(DictionairyType type) {
        switch(type) {
            case KOENEN:
                return new KoenenDictionaryAdapter();
            case KRAMERS:
                return new KramersDictionaryAdapter();
                default:
                    return null;
        }
    }
}
