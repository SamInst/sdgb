package IntrodutingInterfaces.Run;

import IntrodutingInterfaces.repository.Repository;
import IntrodutingInterfaces.services.DatabaseRepository;

import java.util.LinkedList;
import java.util.List;

public class RepositoryRun {
    public static void main(String[] args) {
        Repository databaseRepository = new DatabaseRepository();
        databaseRepository.save();
        List <String> list = new LinkedList<>();
        list.add("Sam");
        list.add("Sam2");
        list.add("Sam3");
        list.add("Sam4");
        list.add("Sam5");
        list.add("Sam6");
        list.add("Sam7");
        list.add("Sam8");
        System.out.println(list);

    }
}
