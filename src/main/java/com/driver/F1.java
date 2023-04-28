package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        //Use arbitrary values for parameters which are not mentioned
        super(name,4,2,6,isManual,"race",2);
    }

    public void accelerate(int rate){
//        int newSpeed = 0; //set the value of new speed by using currentSpeed and rate
        /**
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */
            int newSpeed = getCurrentSpeed() + rate; // Calculate new speed by adding rate to the current speed





        if(newSpeed == 0) {
            //Stop the car, set gear as 1
            super.changeGear(1);
            super.stop();
        }
        //for all other cases, change the gear accordingly
        if (newSpeed > 0 && newSpeed <= 50) {
            // Set gear as 1 for speed 1-50
            super.changeGear(1);
//                changeSpeed(newSpeed, getCurrentDirection());
        } else if (newSpeed > 50 && newSpeed <= 100) {
            // Set gear as 2 for speed 51-100
            super.changeGear(2);
//                changeSpeed(newSpeed, getCurrentDirection());
        } else if (newSpeed > 100 && newSpeed <= 150) {
            // Set gear as 3 for speed 101-150
            super.changeGear(3);
//                changeSpeed(newSpeed, getCurrentDirection());
        } else if (newSpeed > 150 && newSpeed <= 200) {
            // Set gear as 4 for speed 151-200
            super.changeGear(4);
//                changeSpeed(newSpeed, getCurrentDirection());
        } else if (newSpeed > 200 && newSpeed <= 250) {
            // Set gear as 5 for speed 201-250
            super.changeGear(5);
//                changeSpeed(newSpeed, getCurrentDirection());
        } else if (newSpeed > 250) {
            // Set gear as 6 for speed more than 250
            super.changeGear(6);
//                changeSpeed(newSpeed, getCurrentDirection());
        }
        if(newSpeed > 0) {
            changeSpeed(newSpeed, getCurrentDirection());
        }
    }


}
