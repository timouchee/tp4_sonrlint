package com.iut.produit;

abstract  class AbstractProduct {


    private double prcost;

    protected AbstractProduct( double cost) {
        this.prcost = cost;
    }

    public double getCost() {
        return prcost;
    }

    public double calculatePrice() {
        // Exception non gérée (division par zéro)
        return prcost / 1;//0 ?
    }

}
