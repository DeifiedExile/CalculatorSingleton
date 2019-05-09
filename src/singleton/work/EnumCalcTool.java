/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton.work;

/**
 *
 * @author Lucas Wolfs <lwolfs@my.wctc.edu>
 */
public enum EnumCalcTool {
    INSTANCE;
    
    private int TOTAL_BMI_CALCULATED;
    private int NUMBER_OF_CALCULATIONS;
    
    private EnumCalcTool()
    {
        TOTAL_BMI_CALCULATED = 0;
        NUMBER_OF_CALCULATIONS = 0;
    }
    
     

    public double calcBMI(double height, double weight, MeasurementSystem measurementSystem) {
        double bmi = weight / Math.pow(height, 2);
        if (measurementSystem == MeasurementSystem.ENGLISH) {
            bmi *= 703;
        }
        TOTAL_BMI_CALCULATED += bmi;
        NUMBER_OF_CALCULATIONS++;

        return bmi;
    }

    public double averageBMI() {
        return TOTAL_BMI_CALCULATED / NUMBER_OF_CALCULATIONS;
    }
    
}
