package org.firstinspires.ftc.teamcode;

import com.arcrobotics.ftclib.gamepad.ButtonReader;
import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.arcrobotics.ftclib.gamepad.GamepadKeys;
import com.qualcomm.robotcore.hardware.AnalogInput;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DigitalChannel;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DistanceSensor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.TouchSensor;

import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;

@TeleOp()
public class BasicMotorTest extends OpMode {

    private DcMotor Shooter1;
    private DcMotor Intake;
    double shooterSpeed = 0.5;
    boolean shooterOn = false;
    // private ColorSensor color;
    // private DistanceSensor distance;
    //private TouchSensor touchSen;
    private GamepadEx GP1;


    @Override
    public void init() {
        Shooter1 = hardwareMap.get(DcMotor.class, "Shooter1");
        Intake = hardwareMap.get(DcMotor.class, "Intake");
        //  touchSen = hardwareMap.get(TouchSensor.class, "TouchSen");
        //  color = hardwareMap.get(ColorSensor.class, "Color");
        // distance = hardwareMap.get(DistanceSensor.class, "distance");
        GP1 = new GamepadEx(gamepad1);
        GP1.readButtons();
    }

    @Override
    public void loop() {
        GP1.readButtons();
        Shooter1.setPower(GP1.getLeftY());
        Intake.setPower(GP1.getRightY());

    }
}


