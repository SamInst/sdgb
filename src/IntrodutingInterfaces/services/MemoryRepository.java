package IntrodutingInterfaces.services;

import IntrodutingInterfaces.repository.Repository;

public class MemoryRepository implements Repository {
    @Override
    public void save() {
        System.out.println("Saving in memory");
    }
}
