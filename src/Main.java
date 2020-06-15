import java.io.IOException;

public class Main {

    public static void main( String[] args ) throws IOException {

        // Assemble all the pieces of the MVC
        Model m = new Model();
        View v = new View("Note maker");
        Controller c = new Controller(m, v);
//        c.initController();
    }
}