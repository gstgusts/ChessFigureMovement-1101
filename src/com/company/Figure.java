package com.company;

import java.util.List;

public abstract class Figure {
    private Position position;
    public abstract List<Position> getPossiblePositions();
    public Position getPosition(){
        return position;
    }
}