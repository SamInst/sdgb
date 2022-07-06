package IntrodutingInterfacesRun;

import IntrodutingInterfaces.DatabaseLoader;
import IntrodutingInterfaces.FileLoader;

public class Run {
    public static void main(String[] args) {
        DatabaseLoader dbl = new DatabaseLoader();
        FileLoader fl = new FileLoader();
        dbl.load();
        fl.load();
        dbl.remove();
        fl.remove();
    }
}
