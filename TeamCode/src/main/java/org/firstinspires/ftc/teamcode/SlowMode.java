package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
@TeleOp(name = "Slow Mode")
public class SlowMode extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        //Initialize hardware:
        DcMotor leftMotor = hardwareMap.dcMotor.get("leftMotor");
        DcMotor rightMotor = hardwareMap.dcMotor.get("rightMotor");
        double slow_mode = 1;
        waitForStart();

        while (opModeIsActive()) {

            double left_y = gamepad1.left_stick_y;
            double right_y = gamepad1.right_stick_y;
            //hint: these two lines of code will set the power for the motors. Find out where to put them!

            if (gamepad1.right_bumper) { // Fixed bug where gamepad was set to gamepad2
                // When right_bumper is being pressed, we want to change slow_mode variable to 0.5 so we half the value of right_y and left_y, as n * 0.5 = n/2
                slow_mode = 0.5;
            }
            else{
                // When right_bumper is not being held down, we do not half the value of right_y and left_y so we keep it at 1, as n * 1 = n
                slow_mode = 1;
            }
            // We multiply the value of right_y and left_y by the double (a integer with decimals) slow_mode.
            // If right_y is 1, which is all the way backward(or forward, I forgot if it's 1 or -1) and if right_bumper is not being held down, right_y (1) * slow_mode (1) = 1 which is full power. Same for left_y.
            // If right_y is 1 and slow_mode is 0.5 because right bumper is being held down, right_y (1) * slowmode (0.5) = 0.5, so the motor will only turn at half the speed. Same for left_y.
            rightMotor.setPower(right_y * slow_mode);
            leftMotor.setPower(left_y * slow_mode);
        }
    }
}
