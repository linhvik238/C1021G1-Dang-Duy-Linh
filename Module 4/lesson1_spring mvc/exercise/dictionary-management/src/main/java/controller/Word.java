package controller;

import java.util.HashMap;
import java.util.Map;

public class Word {
    public Map<String, String> dictionary(){
        Map<String, String> dictionaryMap = new HashMap<>();
        dictionaryMap.put("Fruit", "Trái cây");
        dictionaryMap.put("Book", "Sách");
        dictionaryMap.put("Foreigner", "Người nước ngoài");
        dictionaryMap.put("Confident", "Tự tin");
        dictionaryMap.put("Shy", "Xấu hổ");
        dictionaryMap.put("Culture", "Văn hóa");
        dictionaryMap.put("Skill", "Kỹ năng");
        dictionaryMap.put("Murder", "Giết người");
        dictionaryMap.put("Steal", "Ăn trộm");
        dictionaryMap.put("Gun", "Súng");
        dictionaryMap.put("Prisoner", "Tù nhân");

        return dictionaryMap;
    }


}
