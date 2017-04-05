package com.endava.entity;

/**
 * Created by vcerbu on 3/27/2017.
 */
public class OuterInnerCar {
    public class Engine {
        int nrCylindres;
        String typeConsumption;
        int power;

        public void check() {
            class Oil {
            }
            class Petrol {
            }
        }
    }

    public class Wheel {
        int diameter;
        String quality;
        int pressure;

        public void check() {
            class State {
                String season;
                boolean NEW;
            }
            class Pressure {
            }
        }
    }

    public class Body {
        String colour;
    }
}
