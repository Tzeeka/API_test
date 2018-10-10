package source_pack;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ResponseClass {
        public String name;
        public List<String> topLevelDomain = null;
        public String alpha2Code;
        public String alpha3Code;
        public List<String> callingCodes = null;
        public String capital;
        public List<String> altSpellings = null;
        public String region;
        public String subregion;
        public Integer population;
        public List<Integer> latlng = null;
        public String demonym;
        public Integer area;
        public Float gini;
        public List<String> timezones = null;
        public List<String> borders = null;
        public String nativeName;
        public String numericCode;
        public List<String> currencies = null;
        public List<String> languages = null;
        public Translations translations = null;
        public String relevance;
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }
    }







