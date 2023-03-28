package OOP.task2_1_8;

import com.sun.javafx.scene.traversal.Direction;

import java.util.Arrays;

import static OOP.task2_1_8.Robot.moveRobot;

public class Module2 {
    public static void main(String[] args) {
        Robot robot = new Robot(0, 0, Direction.DOWN);
        System.out.println(robot);
        moveRobot(robot, -10, 20);
        System.out.println(robot);
        moveRobot(robot, 77, 0);
        System.out.println(robot);

    }
}
