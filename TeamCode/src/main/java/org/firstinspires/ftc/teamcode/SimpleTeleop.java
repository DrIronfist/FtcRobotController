package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotorEx;

@TeleOp(name="testing")
public class SimpleTeleop extends LinearOpMode {

    DcMotorEx lm;
    DcMotorEx rm;
    @Override
    public void runOpMode() {
        lm = hardwareMap.get(DcMotorEx.class,"lm");
        rm = hardwareMap.get(DcMotorEx.class,"rm");
        waitForStart();
        if(isStopRequested()){
            return;
        }
        while(opModeIsActive()){
            lm.getVelocity();
        }
    }
}
