package repository;

public interface DataRepository {

    Integer getGoalNumber();

    Integer setGoals(Integer d);
    Integer setMinimumEngine(Integer d);
    Integer setMaximumEngine(Integer d);
    boolean addChange(Integer d);
    void resetChange();

}
