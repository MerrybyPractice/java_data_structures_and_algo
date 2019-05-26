package hash;

import com.google.cloud.translate.Translate;
import com.google.cloud.translate.TranslateOptions;
import com.google.cloud.translate.Translation;

public class LinguisticHash {

    public static int hash(String key) {
        //Google Translate Set up
        Translate translate = TranslateOptions.getDefaultInstance().getService();
        //Translate Key to German
        //TODO: Set this up so that the language the key is translated to is selected as different based on characteristics of the key. Need to think more on this.
        Translation translation = translate.translate(
                key,
                Translate.TranslateOption.sourceLanguage("en"),
                Translate.TranslateOption.targetLanguage("gr")
        );

        //the rest is a fairly basic hash

        int index = 1;

        char[] array = key.toCharArray();

        for (char c : array) {
            index *= c;
        }
        return index;
    }

}
