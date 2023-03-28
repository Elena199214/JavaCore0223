package OOP.task2_1_8;

import com.sun.javafx.scene.traversal.Direction;

public class Robot {
    int x;
    int y;
    Direction dir;

    public Robot (int x, int y, Direction dir) {
        this.x = x;
        this.y = y;
        this.dir = dir;
    }

    public Direction getDirection() {return dir;}

    public int getX() {return x;}

    public int getY() {return y;}

    public void turnLeft() {
        if      (dir == Direction.UP)    {dir = Direction.LEFT;}
        else if (dir == Direction.DOWN)  {dir = Direction.RIGHT;}
        else if (dir == Direction.LEFT)  {dir = Direction.DOWN;}
        else if (dir == Direction.RIGHT) {dir = Direction.UP;}
    }

    public void turnRight() {
        if      (dir == Direction.UP)    {dir = Direction.RIGHT;}
        else if (dir == Direction.DOWN)  {dir = Direction.LEFT;}
        else if (dir == Direction.LEFT)  {dir = Direction.UP;}
        else if (dir == Direction.RIGHT) {dir = Direction.DOWN;}
    }

    public void stepForward() {
        if (dir == Direction.UP)    {y++;}
        if (dir == Direction.DOWN)  {y--;}
        if (dir == Direction.LEFT)  {x--;}
        if (dir == Direction.RIGHT) {x++;}
    }
    public void turnX(Robot robot,int toX) {
        if ((robot.getDirection() == Direction.UP) && (toX > robot.getX())) {
            robot.turnRight();
        } else {
            robot.turnLeft();
        }
        if ((robot.getDirection() == Direction.LEFT) && (toX > robot.getX())) {
            robot.turnRight();
            robot.turnRight();
        }
        if ((robot.getDirection() == Direction.DOWN) && (toX > robot.getX())) {
            robot.turnRight();
        } else {
            robot.turnLeft();
        }
    }


public static void moveRobot(Robot robot, int toX, int toY) {
    // if ((robot.getX() == toX) && (robot.getY() == toY)) {
    //} else {
    while (toX != robot.getX()) {
        if (robot.getDirection() == Direction.UP) {
            if (toX > robot.getX()) {
                robot.turnRight();
            } else {
                robot.turnLeft();
            }
        }
        if (robot.getDirection() == Direction.LEFT) {
            if (toX > robot.getX()) {
                robot.turnRight();
                robot.turnRight();
            }
        } else if (robot.getDirection() == Direction.DOWN) {
            if (toX > robot.getX()) {
                robot.turnLeft();

            } else {
                robot.turnRight();
            }
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }
    }
    while (toY != robot.getY()) {
        if (robot.getDirection() == Direction.RIGHT) {
            if (toY > robot.getY()) {
                robot.turnLeft();
            } else {
                robot.turnRight();
            }
        } else if (robot.getDirection() == Direction.LEFT) {
            if (toY > robot.getY()) {
                robot.turnRight();
            } else {
                robot.turnLeft();
            }

        } else if (robot.getDirection() == Direction.DOWN) {
            if (toY > robot.getY()) {
                robot.turnRight();
                robot.turnRight();
            }
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}


    @Override
    public String toString() {
        return "Robot{" +
                "x=" + x +
                ", y=" + y +
                ", dir=" + dir +
                '}';
    }
}


