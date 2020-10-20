public class Shop {

    public static void main(String[] args) {

        Product product1 = new Product("Woda", "Aqua", 3.00, 1);
        Product product2 = new Product("Kurczak", "Agrovita", 10.00, 2);

        CalculateBrutto calcualator = new CalculateBrutto();


        System.out.println("Cena brutto: " + calcualator.countPriceBrutto(product1));
        System.out.println("Cena brutto: " + calcualator.countPriceBrutto(product2));


    }
}
