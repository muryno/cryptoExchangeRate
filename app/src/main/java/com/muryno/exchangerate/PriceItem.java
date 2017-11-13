package com.muryno.exchangerate;

/**
 * Created by muryno on 10/11/2017.
 */

public class PriceItem {

    Double BTC;
    Double ETH;
    int imageCurrencyLoad;



    public PriceItem(Double BTC, Double ETH,int imageCurrencyLoad) {
        this.BTC = BTC;
        this.ETH = ETH;
        this.imageCurrencyLoad=imageCurrencyLoad;

    }

    public Double getBTC() {
        return BTC;
    }

    public Double getETH() {
        return ETH;
    }

    public int getImageCurrencyLoad() {
        return imageCurrencyLoad;
    }

}

