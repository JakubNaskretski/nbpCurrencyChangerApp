import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Controller {

    private Model model;
    private View view;

    public Controller(Model m, View v) {
        model = m;
        view = v;
        try {
            getCurrencies();
        } catch (IOException e) {
            e.printStackTrace();
        }
        initView();
    }

    public void initView() {
    }

    public void initController() {
        view.getConfirmButton().addActionListener(e -> getOutput());
        view.getClearButton().addActionListener(e -> clear());
    }

    private void clear() {
        view.getAmountOutput().setText(null);
        view.getAmountInput().setText(null);
    }

    private void getOutput() {
            view.getAmountOutput().setText((String.valueOf(Float.valueOf(view.getAmountInput().getText())/model.getCurrencyValue().get(view.getCurrencyComboBox().getSelectedIndex()))));
            System.out.println(Float.valueOf(view.getAmountInput().getText())/model.getCurrencyValue().get(view.getCurrencyComboBox().getSelectedIndex()));
    }

    // Gets values of currencies from NBP webpage
    private void getCurrencies() throws IOException {
        Document nbpPage = Jsoup.connect(model.getNbpUrl()).get();
        Elements rowsElements = nbpPage.select("#rightSide > table:nth-child(7) > tbody");
        int count = 0;
        for (String e : rowsElements.select("tr > td").eachText()) {
            count++;
            switch (count) {
                case 2:
                    e = e.replace(",",".");
                    model.getCurrencyValue().add(Float.valueOf(e));
                    count = 0;
                    break;
            }
        }
    }



}
