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
public class WheelTest extends OpMode {

    private DcMotor FrontLeft;
    private DcMotor FrontRight;
    private DcMotor BackLeft;
    private DcMotor BackRight;

    double shooterSpeed = 0.5;
    boolean shooterOn = false;
    // private ColorSensor color;
    // private DistanceSensor distance;
    //private TouchSensor touchSen;
    private GamepadEx GP1;

    @Override
    public void init() {
        FrontLeft = hardwareMap.get(DcMotor.class, "FrontLeft");
        FrontRight = hardwareMap.get(DcMotor.class, "FrontRight");
        BackLeft = hardwareMap.get(DcMotor.class, "BackLeft");
        BackRight = hardwareMap.get(DcMotor.class, "BackRight");
        //  touchSen = hardwareMap.get(TouchSensor.class, "TouchSen");
        //  color = hardwareMap.get(ColorSensor.class, "Color");
        // distance = hardwareMap.get(DistanceSensor.class, "distance");
        GP1 = new GamepadEx(gamepad1);
        GP1.readButtons();
    }

    @Override
    public void loop() {
        GP1.readButtons();


        if(GP1.isDown(GamepadKeys.Button.A))
        {
            BackLeft.setPower(1);
        }
        else
        {
            BackLeft.setPower(0);
        }


        if(GP1.isDown(GamepadKeys.Button.B))
        {
            BackRight.setPower(1);
        }
        else
        {
            BackRight.setPower(0);
        }


        if(GP1.isDown(GamepadKeys.Button.X))
        {
            FrontLeft.setPower(1);
        }
        else
        {
            FrontLeft.setPower(0);
        }



        if(GP1.isDown(GamepadKeys.Button.Y))
        {
            FrontRight.setPower(1);
        }
        else
        {
            FrontRight.setPower(0);
        }





    }
}


