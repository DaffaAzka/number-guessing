package repository;

import entity.Data;

import java.util.ArrayList;
import java.util.Objects;

public class DataRepositoryImpl implements DataRepository {
    Data data;

    public DataRepositoryImpl(Data data) {
        this.data = data;
    }

    @Override
    public Integer getGoalNumber() {
        return data.getVm();
    }

    @Override
    public Integer setGoals(Integer d) {
        data.setVm(d);
        return d;
    }

    @Override
    public Integer setMinimumEngine(Integer d) {
        data.setVs(d);
        return d;
    }

    @Override
    public Integer setMaximumEngine(Integer d) {
        data.setVe(d);
        return d;
    }

    @Override
    public boolean addChange(Integer d) {
        if (Data.chance.size() == 5) {
            return false;
        } else {
            Data.chance.add(d);
            return true;
        }
    }

    @Override
    public void resetChange() {
        Data.chance.clear();
    }
}
