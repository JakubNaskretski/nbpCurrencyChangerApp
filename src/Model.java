import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Model {

    private String nbpUrl = "https://www.nbp.pl/";

    private ArrayList<Float> currencyValue = new ArrayList<>();


    public Model() {
    }

    public String getNbpUrl() {
        return nbpUrl;
    }

    public void setNbpUrl(String nbpUrl) {
        this.nbpUrl = nbpUrl;
    }

    public ArrayList<Float> getCurrencyValue() {
        return currencyValue;
    }

    public void setCurrencyValue(ArrayList<Float> currencyValue) {
        this.currencyValue = currencyValue;
    }

}



