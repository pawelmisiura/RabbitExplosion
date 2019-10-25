package com.spartaglobal.RabbitExplosion;

import java.util.ArrayList;

public class StartReproduction {

    ArrayList<Integer> malePopulation = new ArrayList<>();
    ArrayList<Integer> femalePopulation = new ArrayList<>();

    public void printInitialPopulation(){
        malePopulation.add(1);
        femalePopulation.add(1);
        System.out.println(malePopulation.size());
        System.out.println(femalePopulation.size());
    }

    public void maturityChecker(){

    }

    public void startProcreation(int seconds) {
        printInitialPopulation();
        for (int i = 0; i < seconds ; i++) {
            eligibleToProcreate();
            randomPregnancy();
            if (randomPregnancy()) {
                giveBirth();
            }
        }
    }

    public boolean eligibleToProcreate(){
        boolean populationCheckToProcreate = false;
        if (malePopulation.size() >= 1 || femalePopulation.size() >= 1){
            populationCheckToProcreate = true;
        }return populationCheckToProcreate;
    }


    public boolean randomPregnancy() {
        return Math.random() < 0.5;
    }

    public void giveBirth() {
        int numberOfChildren;
        numberOfChildren = (int) Math.round(Math.random() * 14);

        for (int j = 0; j < femalePopulation.size(); j++) {
            for (int i = 0; i <= numberOfChildren - 1; i++) {
                boolean random = Math.random() < 0.5;
                if (random) {
                    malePopulation.add(1);
                }
                if (!random) {
                    femalePopulation.add(1);
                }
            }
            System.out.println(malePopulation.size());
            System.out.println(femalePopulation.size());
        }
    }
}




