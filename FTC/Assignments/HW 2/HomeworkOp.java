
package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

public class HomeworkOp extends OpMode{
    
    //Constructor
    public HomeworkOp(){
    
    }
    
    @Override
    public void init(){
    
    }
    
    @Override
    public void loop(){
    
    }

    @Override
    public void stop(){
    
    }
    
    //Where would we use this? I'd reccomend using it!
    double scaleInput(double dVal) {
        double[] scaleArray = {0.0, 0.05, 0.09, 0.10, 0.12, 0.15, 0.18, 0.24,
                            0.30, 0.36, 0.43, 0.50, 0.60, 0.72, 0.85, 1.00, 1.00};    
           
        int index = (int) (dVal * 16.0);
           
        if (index < 0) {
             index = -index;
         } else if (index > 16) {
             index = 16;
         }
        double dScale = 0.0;
        if (dVal < 0) {
            dScale = -scaleArray[index];
        } else {
            dScale = scaleArray[index];
        }    
            return dScale;
    }

}
