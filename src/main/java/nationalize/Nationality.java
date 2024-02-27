package nationalize;

import com.google.gson.annotations.SerializedName;

import java.util.List;

@lombok.Data
public class Nationality {

    private long count;
    private String name;


   

    @lombok.Data
    public static class Country {

        private String countryId;
        private float probability;



    }

}
