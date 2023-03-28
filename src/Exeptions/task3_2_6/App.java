package Exeptions.task3_2_6;

import com.sun.javafx.scene.traversal.Direction;

public class App {


public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) throws Exception {
    for (int i = 0; i < 3; i++) {
        try (RobotConnection robotConnection = robotConnectionManager.getConnection()) {
            robotConnection.moveRobotTo(toX, toY);
            i=3;
        } catch (RobotConnectionException ex) {
            if (i == 2) {
                throw ex;
            }
        }
    }
}

    }
//}public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) throws Exception {
//    RobotConnection robotConnection = null;
//    for (int i = 0; i < 3; i++) {
//        try {
//            robotConnection = robotConnectionManager.getConnection();
//            robotConnection.moveRobotTo(toX, toY);
//            break;
//        } catch (RobotConnectionException ex) {
//            if (i == 2) {
//                throw ex;
//            }
//        } finally {
//            try {
//                if (robotConnection != null) {
//                    robotConnection.close();
//                }
//            } catch (Exception ex) {
//            }
//        }
//    }
//}


