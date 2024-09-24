package org.firstinspires.ftc.teamcode.autos;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * This Op Mode is designed to move the robot forward and then turn
 * The robot moves forward for drive_time amount of seconds
 * The robot should then turn for turn_time amount of seconds
 * Explore and figure out how to make the robot turn!
 */
@Autonomous(name = "Turn And Move")
public class MoveAndTurn extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        DcMotor rightMotor = hardwareMap.dcMotor.get("leftMotor");
        DcMotor leftMotor = hardwareMap.dcMotor.get("rightMotor");
        double drive_time = 2; //amount of time to drive forward in seconds
        double turn_time = 2; //amount of time to turn in seconds
        waitForStart();

        // Start timer.
        ElapsedTime timer = new ElapsedTime();

        // Power robot forward for drive_time amount of seconds
        while (timer.seconds() < drive_time) {
            rightMotor.setPower(1);
            leftMotor.setPower(1);
        }
        // Stop robot
        leftMotor.setPower(0);
        rightMotor.setPower(0);

        //Add the code for turning the robot for turn_time amount of seconds here
        //You can create a new timer to do this or use the same timer

    }
}
