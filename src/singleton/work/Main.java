package singleton.work;

public class Main {

    public static void main(String[] args) {
        System.out.println("Bob weighs " + 195 + " pounds and is " + 70 + " inches tall with a BMI of " + CalcTool.calcBMI(70, 195, MeasurementSystem.ENGLISH));
        System.out.println("Christy weighs " + 84 + " kilograms and is " + 1.7 + " meters tall with a BMI of " + CalcTool.calcBMI(1.7, 84, MeasurementSystem.METRIC));
        System.out.println("Sue weighs " + 135 + " pounds and is " + 63 + " inches tall with a BMI of " + CalcTool.calcBMI(63, 135, MeasurementSystem.ENGLISH));
        System.out.println("Ricky weighs " + 141 + " kilograms and is " + 2.1 + " meters tall with a BMI of " + CalcTool.calcBMI(2.1, 141, MeasurementSystem.METRIC));

        System.out.println("The Average BMI Calcuated in this Run is " + CalcTool.averageBMI());
        
        ThreadSafeCalcTool threadCalc = ThreadSafeCalcTool.getInstance();
        System.out.println("Bob weighs " + 195 + " pounds and is " + 70 + " inches tall with a BMI of " + threadCalc.calcBMI(70, 195, MeasurementSystem.ENGLISH));
        System.out.println("Christy weighs " + 84 + " kilograms and is " + 1.7 + " meters tall with a BMI of " + threadCalc.calcBMI(1.7, 84, MeasurementSystem.METRIC));
        System.out.println("Sue weighs " + 135 + " pounds and is " + 63 + " inches tall with a BMI of " + threadCalc.calcBMI(63, 135, MeasurementSystem.ENGLISH));
        System.out.println("Ricky weighs " + 141 + " kilograms and is " + 2.1 + " meters tall with a BMI of " + threadCalc.calcBMI(2.1, 141, MeasurementSystem.METRIC));

        System.out.println("The Average BMI Calcuated in this Run is " + threadCalc.averageBMI());
        
        EnumCalcTool enumCalc = EnumCalcTool.INSTANCE;
        System.out.println("Bob weighs " + 195 + " pounds and is " + 70 + " inches tall with a BMI of " + enumCalc.calcBMI(70, 195, MeasurementSystem.ENGLISH));
        System.out.println("Christy weighs " + 84 + " kilograms and is " + 1.7 + " meters tall with a BMI of " + enumCalc.calcBMI(1.7, 84, MeasurementSystem.METRIC));
        System.out.println("Sue weighs " + 135 + " pounds and is " + 63 + " inches tall with a BMI of " + enumCalc.calcBMI(63, 135, MeasurementSystem.ENGLISH));
        System.out.println("Ricky weighs " + 141 + " kilograms and is " + 2.1 + " meters tall with a BMI of " + enumCalc.calcBMI(2.1, 141, MeasurementSystem.METRIC));

        System.out.println("The Average BMI Calcuated in this Run is " + enumCalc.averageBMI());
    }
}
