package com.equester.capstoneproject.model;


public class Equine {

    private String equineName;
    private int yearOfBirth;
    private int height;
    private int weight;
    private String gender;
    private boolean inFoal;
    private boolean foalAtSide;
    private boolean atStud;
    private String color;
    private boolean forSale;
    private boolean forLease;

    public Equine() {
    }

    public String getEquineName() {
        return equineName;
    }

    public void setEquineName(String equineName) {
        this.equineName = equineName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isInFoal() {
        return inFoal;
    }

    public void setInFoal(boolean inFoal) {
        this.inFoal = inFoal;
    }

    public boolean isFoalAtSide() {
        return foalAtSide;
    }

    public void setFoalAtSide(boolean foalAtSide) {
        this.foalAtSide = foalAtSide;
    }

    public boolean isAtStud() {
        return atStud;
    }

    public void setAtStud(boolean stStud) {
        this.atStud = stStud;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isForSale() {
        return forSale;
    }

    public void setForSale(boolean forSale) {
        this.forSale = forSale;
    }

    public boolean isForLease() {
        return forLease;
    }

    public void setForLease(boolean forLease) {
        this.forLease = forLease;
    }
}
