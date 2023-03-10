package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

public class RobotMap {
    public static int backLeftMotorPort = 1;
    public static int backRightMotorPort = 2;
    public static int frontLeftMotorPort = 3;
    public static int frontRightMotorPort = 4;    

    public static WPI_TalonFX backLeftMotor = new WPI_TalonFX(backLeftMotorPort);
    public static WPI_TalonFX backRightMotor = new WPI_TalonFX(backRightMotorPort);

    public static WPI_TalonFX frontLeftMotor = new WPI_TalonFX(frontLeftMotorPort);
    public static WPI_TalonFX frontRightMotor = new WPI_TalonFX(frontRightMotorPort);

}
