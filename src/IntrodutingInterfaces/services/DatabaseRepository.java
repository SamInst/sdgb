package IntrodutingInterfaces.services;

import IntrodutingInterfaces.repository.Repository;

public class DatabaseRepository implements Repository {
    @Override
    public void save() {
        System.out.println("Saving in database");
    }
}
