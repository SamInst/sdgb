package IntrodutingInterfaces;

public class FileLoader implements DataLoader ,DataRemove{
    @Override
    public void remove() {
        System.out.println("Removing files from Files");
    }

    @Override
    public void load() {
        System.out.println("loading Data from Files...");
    }
}
