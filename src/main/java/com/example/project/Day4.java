package com.example.project;
import java.util.Random;

public class Day4 {
    
    private static String[] reindeer_names = {"Dasher", "Dancer", "Prancer", "Vixen", "Comet", "Cupid", "Donner", "Blitzen"};

    public static class Reindeer { // you must have at least a name, distance travelled, speed, run duration, and rest duration attribute
        private String name;
        private int distance, speed, runDuration, restDuration;
        private int time;

        // Constructor 
        public Reindeer(String name, int speed, int runDuration, int restDuration) {
            time = 0;
            this.name = name;
            this.speed = speed;
            this.runDuration = runDuration;
            this.restDuration = restDuration;
        }

        public String getName() {
            return name;
        }

        public int getDistanceTraveled(){ // this method is required
            return distance;
        }
        

        public void simulateSecond(){ //this method is required but not tested
            time++;
            if (time <= runDuration) {
                distance += speed;
            }
            if (time == runDuration + restDuration) {
                time = 0;
            }
        }

    }

    public static String simulateRace(int time, Reindeer[] reindeers){ //you will be tested on this method
        String winnerName = reindeers[0].getName();
        int furthestDistance = reindeers[0].getDistanceTraveled();
        int currentDistance = 0;
        for (int i = 0; i < reindeers.length; i++) {
            for (int j = 0; j < time; j++) {
                reindeers[i].simulateSecond();
                currentDistance = reindeers[i].getDistanceTraveled();
            }
            if (currentDistance > furthestDistance) {
                furthestDistance = currentDistance;
                winnerName = reindeers[i].getName();
            }
        }
        return winnerName;
    }

    
    public static void main(String[] args) { // for testing purposed

    }

 
}



