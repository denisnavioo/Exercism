public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method

    public static int expectedMinutesInOven(){
      return 40;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    
public int remainingMinutesInOven(int actualMinutesInOven) {
        return expectedMinutesInOven() - actualMinutesInOven;
    }

    // TODO: define the 'preparationTimeInMinutes()' method

    public int preparationTimeInMinutes(int capas){

        return capas * 2;
        
    }
    // TODO: define the 'totalTimeInMinutes()' method

    public int totalTimeInMinutes(int capas,int remainingMinutesInOven){
        return remainingMinutesInOven + preparationTimeInMinutes(capas);
    }
}
