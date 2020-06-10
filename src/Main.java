import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Main {

    public static void main( String[] args ) throws IOException {

        String nbpUrl = "https://www.nbp.pl/";
        Document nbpPage = Jsoup.connect(nbpUrl).get();
        Elements rowsElements = nbpPage.select("#rightSide > table:nth-child(7) > tbody");

//        ArrayList<Element> rowsList = new ArrayList<>();

        rowsElements.select("tr > td").eachText();
//
        int count = 0;
            for (String e : rowsElements.select("tr > td").eachText()){
                System.out.print(e);
                count++;
                switch (count){
                    case 1:
                        System.out.print(" - ");
                        break;
                    case 2:
                        System.out.println();
                        count = 0;
                        break;
                }
            }
//        for (Element e : rowsElements) {
//            System.out.println(e.select("tr > td").eachText());
//        }
//
//        for (Element e : rowsElements){
//            rowsList.add(e);
//        }
//
//        for (Element e : rowsList){
//            System.out.println(e.select("tr > td").eachText());
//        }
        
        



//        String urlUsd = "https://www.google.com/search?q=1+usd+to+pln&oq=1+usd+to+pln&aqs=chrome..69i57j0l7.2966j1j7&sourceid=chrome&ie=UTF-8";
//        Document pageUsd = Jsoup.connect(urlUsd).get();
//        Element link = pageUsd.select("#knowledge-currency__updatable-data-column > div.b1hJbf > div.dDoNo.vk_bk.gsrt.gzfeS > span.DFlfde.SwHCTb").first();
//        System.out.println("1 Usd = "+link.text()+ " Pln");
//
//
//        String urlEur = "https://www.google.com/search?q=1+eur+to+pln&oq=1+eur+to+pln&aqs=chrome..69i57j0l7.2129j1j9&sourceid=chrome&ie=UTF-8";
//        Document pageEur = Jsoup.connect(urlEur).get();
//        link = pageEur.select("#knowledge-currency__updatable-data-column > div.b1hJbf > div.dDoNo.vk_bk.gsrt.gzfeS > span.DFlfde.SwHCTb").first();
//        System.out.println("1 Eur = "+link.text()+ " Pln");
//
//
//        String urlTest = "https://biurwa.pl/";
//        Document pageTest = Jsoup.connect(urlTest).get();
//        link = pageEur.select("#sm-content > div.listing.clearfix > div:nth-child(1) > div.mpc_container.mpc_container_first > table > tbody > tr:nth-child(3) > td > div > h2 > a").first();
//        System.out.println(link.text());


    }
}