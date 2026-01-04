package patterns.task12;

import java.util.HashMap;
import java.util.Map;

public class SmartHouseFacade {
    private final Map<String, SmartHouse> smartHouseMap = new HashMap<>();

    public SmartHouseFacade(){
        smartHouseMap.put("lighting", new Lighting());
        smartHouseMap.put("conditioning", new Conditioning());
        smartHouseMap.put("security", new Security());
    }

    public void on(String name){
        SmartHouse smartHouse = smartHouseMap.get(name);
        if (smartHouse != null) smartHouse.on();
    }

    public void off(String name){
        SmartHouse smartHouse = smartHouseMap.get(name);
        if (smartHouse != null) smartHouse.off();
    }

}
