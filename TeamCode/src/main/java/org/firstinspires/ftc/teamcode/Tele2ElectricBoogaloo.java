package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "MaxBotConfigs")
public class Tele2ElectricBoogaloo extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        DcMotor intakeMotor = hardwareMap.dcMotor.get("intake");
        DcMotor frontLeftMotor = hardwareMap.dcMotor.get("frontLeft");
        DcMotor backRightMotor = hardwareMap.dcMotor.get("backRight");
        DcMotor frontRightMotor = hardwareMap.dcMotor.get("frontRight");
        DcMotor backLeftMotor = hardwareMap.dcMotor.get("backLeft");
        waitForStart();

        double left_y;

        while (opModeIsActive()) {
                left_y = gamepad1.left_stick_y;
//            intakeMotor.setPower(0.0);
//            frontLeftMotor.setPower(1.0);
//            backRightMotor.setPower(1.0);

            frontLeftMotor.setPower(left_y);
            backLeftMotor.setPower(left_y);
            frontRightMotor.setPower(-left_y);
            backRightMotor.setPower(-left_y);

            telemetry.addData("left_gamepad_y", left_y);
            telemetry.update();
        }
    }
}
