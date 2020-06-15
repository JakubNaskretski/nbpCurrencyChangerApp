import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Model {

    private String nbpUrl = "https://www.nbp.pl/";

    public Model() {
    }

    private void getResult() throws IOException {
        Document nbpPage = Jsoup.connect(nbpUrl).get();
        Elements rowsElements = nbpPage.select("#rightSide > table:nth-child(7) > tbody");


        rowsElements.select("tr > td").eachText();
        int count = 0;
        for (String e : rowsElements.select("tr > td").eachText()) {
            System.out.print(e);
            count++;
            switch (count) {
                case 1:
                    System.out.print(" - ");
                    break;
                case 2:
                    System.out.println();
                    count = 0;
                    break;
            }
        }
    }
}
