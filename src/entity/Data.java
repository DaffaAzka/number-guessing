package entity;

import java.util.ArrayList;
import java.util.List;

public class Data {
    Integer vm;
    Integer vs;
    Integer ve;
    Integer playerScore;

    public static List<Integer> chance = new ArrayList<>();

    public Integer getVm() {
        return vm;
    }

    public void setVm(Integer vm) {
        this.vm = vm;
    }

    public Integer getVs() {
        return vs;
    }

    public void setVs(Integer vs) {
        this.vs = vs;
    }

    public Integer getVe() {
        return ve;
    }

    public void setVe(Integer ve) {
        this.ve = ve;
    }

    public Integer getPlayerScore() {
        return playerScore;
    }

    public void setPlayerScore(Integer playerScore) {
        this.playerScore = playerScore;
    }
}
