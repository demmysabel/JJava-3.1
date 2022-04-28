public class BonusMilesService {
    public int calculate(int cost) {
        int priceForMiles = 20;
        int bonus = cost/priceForMiles;

        return bonus;
    }


}
