import Auto.Auto;

public class AutoOfficina {

	public static void main(String[] args) {
		
		Auto[] auto = new Auto[5];

        auto[0] = new Auto("Volkswagen","Golf GTI", 2000,265, "AA 111 BB", 49000, "nero",6);
        auto[1] = new Auto("Audi","RS3",3000,474, "BB 222 CC", 63999.99, "giallo",6);
        auto[2] = new Auto("Ford","Sierra Cosworth",2000,212, "CC 333 DD", 55000, "grigio",5);
        auto[3] = new Auto("Lancia","Delta HF",2000,220, "DD 444 EE", 50000.89, "rosso",5);
        auto[4] = new Auto("Honda","Integra type-R",1800,192, "FF 666 GG", 65000.50, "bianco",5);

        Auto auto1 = auto[0];
        Auto auto2 = auto[1];
        Auto auto3 = auto[2];
        Auto auto4 = auto[3];
        Auto auto5 = auto[4];

        autoPiuCostosa(auto);
        autoPiuPotente(auto);
        infoAuto("DD 444 EE", auto);
        autoColore("grigio", auto);

	}
	
	static void autoPiuCostosa(Auto[] auto){
        double max = 0;
        Auto carMax = null;
        for (int i = 0; i < auto.length; i++){
            if(auto[i].getValore() > max){
                max = auto[i].getValore();
                carMax = auto[i];
            }
        }
        if(carMax == null) {
        	throw new RuntimeException("Valore non calcolabile");
        } else {
        System.out.println("\nAUTO PIU' COSTOSA : ");
        carMax.stampaInformazioni();
        }

    }
	
	static void autoPiuPotente(Auto[] auto){
        int max = 0;
        Auto maxPot = null;
        for (int i = 0; i < auto.length; i++){
            if (auto[i].getPotenza() > max){
                max = auto[i].getPotenza();
                maxPot = auto[i];
            }
        }
        if(maxPot == null) {
        	throw new RuntimeException("Potenza non calcolabile");
        } else {
        System.out.println("\nAUTO PIU' POTENTE : ");
        maxPot.stampaInformazioni();
        }

    }
	
	static void infoAuto(String targa, Auto[] auto){
        Auto carTarga = null;
        for (int i = 0; i < auto.length; i++){
            if (targa.equals(auto[i].getTarga())){
                carTarga = auto[i];
            }
        }
        if (carTarga == null){
            throw new RuntimeException("Targa inserita inesistente!");
        } else {
            System.out.println("LA TARGA " + "*" + targa + "*" + " E' DELL'AUTO: ");
            carTarga.stampaInformazioni();
        }

    }
	
	static void autoColore(String colore, Auto[] auto){
        Auto carColore = null;
        for (int i = 0; i < auto.length; i++){
            if (colore.equals(auto[i].getColore())){
                carColore = auto[i];
            }
        }
        if (carColore == null){
            throw new RuntimeException("Colore inserito inesistente!");
        } else {
            System.out.println("LA MACCHINA DI COLORE " + "'" + colore + "'" + " E':");
            carColore.stampaInformazioni();
        }
    }

}
