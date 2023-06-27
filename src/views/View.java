package views;

import entity.Data;
import repository.DataRepository;
import repository.DataRepositoryImpl;
import service.GameService;
import service.GameServiceImpl;
import utilities.Input;

public class View {

    GameService service;

    public View(GameService service) {
        this.service = service;
    }

    public void startView() {
        service.startEngine();

        while (true) {
            System.out.println("========================================");
            System.out.println("Bilangan yang lebih besar dari " + service.getMin() +
                    " namun lebih kecil dari " + service.getMax());
            System.out.println("========================================");
            var answer = Input.inputData("Jawaban");

            if (service.ifWin(answer)) {
                System.out.println("Selamat jawaban anda benar!");
                System.out.println("Score: " + service.getScore());
                break;
            } else {
                if (service.setChance(answer)) {
                    System.out.println("Kurang tepat! namun anda masih bisa menjawab kembali");
                } else {
                    System.out.println("Mohon maaf anda kalah!");
                    break;
                }
            }
        }
    }
}
