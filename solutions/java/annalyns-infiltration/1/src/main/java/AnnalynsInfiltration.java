class AnnalynsInfiltration {

    
    public static boolean canFastAttack(boolean knightIsAwake) {

        if (knightIsAwake == false){
          return true;   
        } else{   
        return false;
         }
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {

        if (knightIsAwake || archerIsAwake  || prisonerIsAwake ) {
            return true;
        } else {
            return false;
        }
        
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {

    if (!archerIsAwake && prisonerIsAwake == true){        
            return true;
    } else{
        return false;
    }        
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean                petDogIsPresent) {
        return (petDogIsPresent && !archerIsAwake) || (!petDogIsPresent && prisonerIsAwake && !knightIsAwake && !archerIsAwake);
        }
}
