package IntrodutingInterfaces.services;

import IntrodutingInterfaces.repository.Repository;

public class ArchiveRepository implements Repository {
    @Override
    public void save() {
        System.out.println("Saving in Files");
    }
}
