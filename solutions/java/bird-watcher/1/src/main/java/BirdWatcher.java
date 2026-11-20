
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        return new int[] {0, 2, 5, 3, 7, 8, 4};
    }

    public int getToday() {
        int hoy =  birdsPerDay [6];
    
        return hoy;
    }

    public void incrementTodaysCount() {
        birdsPerDay [6] += 1;        
    }

    public boolean hasDayWithoutBirds() {

        int arrayLength = birdsPerDay.length;

        boolean AlGunDiaVacio = false;
        
        for (int i = 0 ; i < arrayLength ; i++){
            if (birdsPerDay [i] == 0) {
                AlGunDiaVacio = true;
            }
        }
        return AlGunDiaVacio;        
    }

    public int getCountForFirstDays(int numberOfDays) {

        int PrimerosDias = 0;
        if (numberOfDays > birdsPerDay.length) {
            for (int i = 0 ; i < birdsPerDay.length ; i++) {
            PrimerosDias = PrimerosDias + birdsPerDay [i];
            }    
        } else {             
        for (int i = 0 ; i < numberOfDays ; i++) {
            PrimerosDias = PrimerosDias + birdsPerDay [i];
            }
        }
        return PrimerosDias;
    }

    public int getBusyDays() {
        
        int EsAjetreado = 0;

        for (int i = 0;i < birdsPerDay.length;i++) {
            if (birdsPerDay[i] >= 5){
                EsAjetreado++;
            }
        }

        return EsAjetreado;
    }
}
