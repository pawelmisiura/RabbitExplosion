package com.spartaglobal.RabbitExplosion;

public class Rabbit extends GlobalTimer {
    public Rabbit(int seconds) {
        super(seconds);

    }

    public void checkIfFemaleCanGetPregnant(){
        // if male is > 0 and female is > 0 then
        //instantiate randomPregnancy()
        // and        premissionToGiveBirth
    }

    public void permissionToGiveBirth(){
        if(randomPregnancy()){
            //wait for a second and give birth
            giveBirth();
        }
    }

    public boolean randomPregnancy() {
        return Math.random() < 0.5;
    }

    public int giveBirth(){
        int numberOfChildren;
        numberOfChildren = (int)Math.round(Math.random()*14);
        return numberOfChildren;
        }



    public void runPopulationSimulation(){
        int maleRabbitPopulation = 1;
        int femaleRabbitPopulation = 1;
        boolean femaleGetsPregnant = false;

        if(maleRabbitPopulation > 0 || femaleRabbitPopulation > 0){
                //I tried another approaches here, still the same result
            }
        }
    }

