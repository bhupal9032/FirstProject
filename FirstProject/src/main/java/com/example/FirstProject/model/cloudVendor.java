package com.example.FirstProject.model;

public class cloudVendor {
    private String Vendorid;
    private String vendorname;
    private String vendoraddress;
    private String vendorphonenumber;

    public cloudVendor() {
    }

    public cloudVendor(String vendorid, String vendorname, String vendoraddress, String vendorphonenumber) {
        Vendorid = vendorid;
        this.vendorname = vendorname;
        this.vendoraddress = vendoraddress;
        this.vendorphonenumber = vendorphonenumber;
    }

    public String getVendorid() {
        return Vendorid;
    }

    public void setVendorid(String vendorid) {
        Vendorid = vendorid;
    }

    public String getVendorname() {
        return vendorname;
    }

    public void setVendorname(String vendorname) {
        this.vendorname = vendorname;
    }

    public String getVendoraddress() {
        return vendoraddress;
    }

    public void setVendoraddress(String vendoraddress) {
        this.vendoraddress = vendoraddress;
    }

    public String getVendorphonenumber() {
        return vendorphonenumber;
    }

    public void setVendorphonenumber(String vendorphonenumber) {
        this.vendorphonenumber = vendorphonenumber;
    }
}
