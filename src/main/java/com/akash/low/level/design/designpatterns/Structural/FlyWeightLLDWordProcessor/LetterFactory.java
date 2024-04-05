package com.akash.low.level.design.designpatterns.Structural.FlyWeightLLDWordProcessor;

import java.util.HashMap;
import java.util.Map;

public class LetterFactory {
    private static Map<Character, ILetter> characterCache = new HashMap<>();

    public static ILetter crateLetter(char characterValue) {

        if (characterCache.containsKey(characterValue)) {
            return characterCache.get(characterValue);
        } else {

            DocumentCharater characterObj = new DocumentCharater(characterValue, "Arial", 10);
            characterCache.put(characterValue, characterObj);
            return characterObj;
        }
    }


}
