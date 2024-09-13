package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "Slow Mode")
public class SlowMode extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        Hardware hw = new Hardware(hardwareMap);

        waitForStart();

        while (opModeIsActive()) {

            double left_y = gamepad1.left_stick_y;
            double right_y = gamepad1.right_stick_y;
            //hint: these two lines of code will set the power for the motors. Find out where to put them!

            if (gamepad2.right_bumper){
                //code for when speed is halved
            }
            else{
                //code for when speed is normal
            }
            //Figure out how the two lines of code below need to change to implement slow mode!
            hw.right_motor.setPower(right_y);
            hw.left_motor.setPower(left_y);

        }
    }
}
