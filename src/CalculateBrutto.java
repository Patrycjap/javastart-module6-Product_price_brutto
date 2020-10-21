public class CalculateBrutto {
    private Product product;


    public double countPriceBrutto(Product product) {
        int vat = getVat(product);
        return product.getPriceNetto() * (vat / 100.0 + 1);

    }


    private int getVat(Product product) {
        switch (product.getCategory()) {
            case 1:
                return 20;
            case 2:
                return 25;
            case 3:
                return 30;
            default:
                return 0;
        }

    }
}

