package Model;

import Controller.Controller;
import View.View;

import java.util.ArrayList;

public class Menu {
    private MenuStat stat;
    private View view = View.getInstance();
    private Controller controller = new Controller();
    private ArrayList<AI> ais = new ArrayList<>();
    private ArrayList<Account> accounts = new ArrayList<>();
    private Shop shop = new Shop();
    private String[][] options = new String[MenuStat.values().length][]
    private static final Menu menu = new Menu();

    private Menu() {

    }

    public static Menu getInstance() {
        return menu;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public MenuStat getStat() {
        return stat;
    }

    public void setStat(MenuStat stat) {
        this.stat = stat;
    }
}
