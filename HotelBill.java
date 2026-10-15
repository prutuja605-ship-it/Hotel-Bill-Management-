class HotelBilling {

    // Calculate food bill
    public static double calculateFoodBill(double foodAmount) {
        return foodAmount;
    }

    // Calculate GST at 5%
    public static double calculateGST(double amount) {
        return amount * 5 / 100;
    }

    // Calculate total bill including GST
    public static double calculateTotalBill(double foodAmount) {
        double gst = calculateGST(foodAmount);
        return foodAmount + gst;
    }

    // Calculate discount at 10%
    public static double calculateDiscount(double totalAmount) {
        return totalAmount * 10 / 100;
    }

    // Calculate final payable amount
    public static double calculateFinalBill(double foodAmount) {
        double total = calculateTotalBill(foodAmount);
        double discount = calculateDiscount(total);
        return total - discount;
    }

    public static void main(String[] args) {

        double foodAmount = 1000;

        double gst = calculateGST(foodAmount);
        double total = calculateTotalBill(foodAmount);
        double discount = calculateDiscount(total);
        double finalAmount = calculateFinalBill(foodAmount);

        System.out.println("===== HOTEL BILL =====");
        System.out.printf("Food Amount: Rs. %.2f%n", foodAmount);
        System.out.printf("GST (5%%): Rs. %.2f%n", gst);
        System.out.printf("Total Amount: Rs. %.2f%n", total);
        System.out.printf("Discount (10%%): Rs. %.2f%n", discount);
        System.out.printf("Final Payable Amount: Rs. %.2f%n", finalAmount);
    }
}