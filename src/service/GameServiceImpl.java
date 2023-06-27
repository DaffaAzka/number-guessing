package service;

import entity.Data;
import repository.DataRepository;

import java.util.Objects;
import java.util.Random;

public class GameServiceImpl implements GameService {
    DataRepository dataRepository;

    Random random = new Random();

    public GameServiceImpl(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    Integer max = 0;
    Integer min = 0;

    Integer goal = 0;

    @Override
    public boolean startEngine() {
        goal = random.nextInt(10, 100);
        dataRepository.setGoals(goal);
        min = getMinimumEngine();
        max = getMaximumEngine();
        dataRepository.setMinimumEngine(min);
        dataRepository.setMaximumEngine(max);
        return false;
    }

    @Override
    public Integer getScore() {
        var data = Data.chance;
        Integer temp = 100;

        for (Integer datum : data) {
            temp -= 20;
        }

        return temp;
    }

    @Override
    public Integer getMinimumEngine() {
        if (dataRepository.getGoalNumber() < 20) {
            return random.nextInt(2, 8);
        } else if (dataRepository.getGoalNumber() < 50) {
            return random.nextInt(10, 20);
        } else {
            return random.nextInt(40, 50);
        }
    }

    @Override
    public Integer getMaximumEngine() {
        if (dataRepository.getGoalNumber() > 50) {
            return random.nextInt(50, 100);
        } else if (dataRepository.getGoalNumber() > 20) {
            return random.nextInt(30, 80);
        } else {
            return random.nextInt(5, 10);
        }
    }

    @Override
    public boolean ifWin(Integer d) {
        if (Objects.equals(d, dataRepository.getGoalNumber())) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setChance(Integer d) {
        boolean change = dataRepository.addChange(d);

        if (change) {
            boolean is = isMinimumOrMaximum(dataRepository.getGoalNumber(), d);
            if (is) {
                if (d > min) {
                    min = d;
                }
            } else {
                if (d < max) {
                    max = d;
                }
            }
            return true;
        }

        return false;
    }

    @Override
    public boolean isMinimumOrMaximum(Integer goal, Integer d) {
        return goal > d;
    }

    public Integer getMax() {
        return max;
    }

    public Integer getMin() {
        return min;
    }
}
