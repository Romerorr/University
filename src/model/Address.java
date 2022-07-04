package model;

public class Address {
    private String city;
    private String str;
    private int bld;
    private int flt;

    public Address(String city, String str, int bld, int flt) {
        this.city = city;
        this.str = str;
        this.bld = bld;
        this.flt = flt;
    }
    @Override
    public String toString() {
        return "[" + city + ", " + str + ", " + bld + ", " + flt + "]";
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public int getBld() {
        return bld;
    }

    public void setBld(int bld) {
        this.bld = bld;
    }

    public int getFlt() {
        return flt;
    }

    public void setFlt(int flt) {
        this.flt = flt;
    }
}