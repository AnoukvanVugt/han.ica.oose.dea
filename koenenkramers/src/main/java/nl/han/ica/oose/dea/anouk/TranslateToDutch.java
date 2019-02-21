package nl.han.ica.oose.dea.anouk;

public class TranslateToDutch {

    Dictionairy translator = DictionairyFactory.getInstance().create(DictionairyType.KOENEN);

    public String translate(String word) {
        return translator.translate(word);
    }

    public String getName() {
        return translator.getName();
    }

}
