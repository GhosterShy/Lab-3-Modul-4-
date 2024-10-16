interface DiscountStrategy {
    double applyDiscount(double amount);
}


class RegularDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double amount) {
        return amount; // Нет скидки
    }
}


 class SilverDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double amount) {
        return amount * 0.9;
    }
}


class GoldDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double amount) {
        return amount * 0.8;
    }
}



 class DiscountCalculator {

    private DiscountStrategy discountStrategy;


    public DiscountCalculator(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }


    public double calculateDiscount(double amount) {
        return discountStrategy.applyDiscount(amount);
    }
}




public class Main2 {
    public static void main(String[] args) {
        double amount = 100.0;

        DiscountCalculator regularCalculator = new DiscountCalculator(new RegularDiscount());
        System.out.println("Regular customer total: " + regularCalculator.calculateDiscount(amount));

        // Для клиента Silver
        DiscountCalculator silverCalculator = new DiscountCalculator(new SilverDiscount());
        System.out.println("Silver customer total: " + silverCalculator.calculateDiscount(amount));


    }
}

