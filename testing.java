public class DiscountCalculator {
    public static void main(String[] args) {
        double value = 1800; // Thay đổi giá trị ở đây

        double discount = calculateDiscount(value);

        System.out.println("Mức giảm giá: " + discount * 100 + "%");
    }

    private static double calculateDiscount(double value) {
        double discount = 0;

        if (value > 3000) {
            discount = 0.15;
        } else if (value > 2500) {
            discount = 0.12;
        } else if (value > 2000) {
            discount = 0.10;
        } else if (value > 1500) {
            discount = 0.08;
        } else if (value > 1000) {
            discount = 0.05;
        } else if (value > 500) {
            discount = 0.02;
        }

        return discount;
    }
}