package l44.imporvisation.mvc.views;

import l44.imporvisation.mvc.controllers.FlatController;
import l44.imporvisation.mvc.controllers.IFlatController;
import l44.imporvisation.mvc.models.Flat;

import java.util.Scanner;

public class CLIView {
    private IFlatController flatController;

    public CLIView(){
        flatController = new FlatController();
    }

    public void startCommunication() {
        Scanner scanner = new Scanner(System.in);
        String cmd = scanner.nextLine();

        if (cmd.equals("add")) {
            Flat flat = new Flat();
            flatController.add(flat);
        }
    }
}
