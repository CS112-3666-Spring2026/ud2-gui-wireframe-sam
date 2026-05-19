package cs112.ud2.models;

import java.util.ArrayList;

public class Week {
    private Workout[] workouts;

    public Week(){
        this.workouts = new Workout[7];
    }


    public Workout getWorkout(int i){
        return workouts[i];
    }
    private class Workout extends Exercise{
        private String name;

        private ArrayList<Exercise> exercises;
        Workout(){
            this.exercises = new ArrayList<Exercise>();
        }
        Workout(String name){
            this.name = name;
            this.exercises = new ArrayList<Exercise>();
        }
        Workout(ArrayList<Exercise> exercises){
            this.exercises = exercises;
        }
        Workout(Workout other){
            this.exercises = other.exercises;
        }

        @Override
        public String toString() {
            String retString = "";
            for(int i =0;i<exercises.size();i++) {
               retString.concat(""+this.exercises.toString()+"\n");
            }
            return retString;
        }
    }
}
