package source_pack;

import java.util.HashMap;
import java.util.Map;

public class Translations {


    public String es;
    public String fr;
    public String ja;
    public String it;
    public String de;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}