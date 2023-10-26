package main.model;

import main.dao.ICinemaHall;

import java.util.ArrayList;
import java.util.List;

public class CinemaHall implements ICinemaHall {
    int hallNumber;
    int hallCapacity;
    HallType hallType;

    public CinemaHall(int hallNumber, int hallCapacity, HallType hallType) {
        this.hallNumber = hallNumber;
        this.hallCapacity = hallCapacity;
        this.hallType = hallType;
    }


    @Override
    public int getHallNumber() {
        return hallNumber;
    }

    @Override
    public void setHallNumber(int hallNumber) {
        this.hallNumber = hallNumber;
    }

    @Override
    public int getCapacity() {
        return hallCapacity;
    }

    @Override
    public void setCapacity(int capacity) {
        this.hallCapacity = capacity;
    }

    @Override
    public HallType getHallType() {
        return hallType;
    }

    @Override
    public void setHallType(HallType hallType) {
        this.hallType = hallType;
    }
}
