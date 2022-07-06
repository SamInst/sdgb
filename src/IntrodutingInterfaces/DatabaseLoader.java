package IntrodutingInterfaces;

public class DatabaseLoader implements DataLoader , DataRemove{
    @Override
    public void load() {
        System.out.println("loading database...");
    }

    @Override
    public void remove() {
        System.out.println("Removing from database....");
    }
}
