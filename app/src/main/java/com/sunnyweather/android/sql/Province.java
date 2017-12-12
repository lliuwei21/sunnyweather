package com.sunnyweather.android.sql;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/12/12.
 */

public class Province extends DataSupport {
    private int id;
    private String provinceName;
    private int provinceNumber;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceNummber() {
        return provinceNumber;
    }

    public void setProvinceNummber(int provinceNummber) {
        this.provinceNumber = provinceNummber;
    }
}
