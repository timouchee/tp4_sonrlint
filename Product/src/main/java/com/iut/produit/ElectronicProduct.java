package com.iut.produit;

class ElectronicProduct extends AbstractProduct {
    private String elbrand;

    protected ElectronicProduct( double cost, String brand) {
        super(cost);
        this.elbrand = brand;
    }

    public String getBrand() {
        return elbrand;
    }

    @Override
    public double calculatePrice() {
        // Complexité cyclomatique élevée (calcul compliqué)
        double price = getCost() * 2.0;
        for (int i = 0; i < 100; i++) {
            price += i;
        }
        return price;
    }
}
