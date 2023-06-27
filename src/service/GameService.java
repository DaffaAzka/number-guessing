package service;

public interface GameService {

    boolean startEngine();

    Integer getScore();

    Integer getMinimumEngine();

    Integer getMaximumEngine();

    boolean ifWin(Integer d);

    boolean setChance(Integer d);

    boolean isMinimumOrMaximum(Integer goal, Integer d);

    Integer getMin();

    Integer getMax();

}
