import entity.Data;
import repository.DataRepository;
import repository.DataRepositoryImpl;
import service.GameService;
import service.GameServiceImpl;
import views.View;

public class App {

    public static void main(String[] args) {
        Data data = new Data();
        DataRepository repository = new DataRepositoryImpl(data);
        GameService service = new GameServiceImpl(repository);
        View view = new View(service);
        view.startView();

    }

}
