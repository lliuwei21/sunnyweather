package com.sunnyweather.android.sql;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/12/12.
 */

public class City extends DataSupport {
    private int id;
    private String cityName;
    private int cityNumber;
    private int provinceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityNummber() {
        return cityNumber;
    }

    public void setCityNummber(int cityNummber) {
        this.cityNumber = cityNummber;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
