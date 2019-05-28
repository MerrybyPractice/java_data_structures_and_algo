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

        String translatedKey = translation.toString();

        char[] array = translatedKey.toCharArray();

        for (int i = 0; i < array.length; i++) {

            int c = array[i];

            c *= i;

            index *= c;
        }

        index *= 599;

        return index;
    }

}
