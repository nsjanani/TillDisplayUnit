package com.till.display;

public enum StateCodes {

    UT(0.0685), NV(0.08), TX(0.0625), AL(0.04), CA(0.0825);
    double tax;

    StateCodes(double tax) {
        this.tax = tax;
    }

}

