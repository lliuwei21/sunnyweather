package com.sunnyweather.android.tool;

import android.text.TextUtils;

import com.google.gson.JsonObject;
import com.sunnyweather.android.sql.City;
import com.sunnyweather.android.sql.County;
import com.sunnyweather.android.sql.Province;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Administrator on 2017/12/12.
 */

public class Utility {
    /**
     * 解析和处理服务器返回的省级数据
     */
    public static boolean handleProvinceResponse(String response){
        if (!TextUtils.isEmpty(response)){
            try {
                JSONArray arrayProvince = new JSONArray(response);
                for (int i = 0; i< arrayProvince.length();i++){
                    JSONObject provinceObject = arrayProvince.getJSONObject(i);
                    Province province = new Province();
                    province.setProvinceName(provinceObject.getString("name"));
                    province.setProvinceNummber(provinceObject.getInt("id"));
                    province.save();
                }
                return true;
            }catch (JSONException e){
                e.printStackTrace();
            }
        }
        return false;
    }
    /**
     * 解析和处理服务器返回的市级数据
     */
    public static  boolean handleCityResponse(String response,int provinceId){
        if (!TextUtils.isEmpty(response)){
            try {
                JSONArray arrayCity = new JSONArray(response);
                for (int i = 0; i< arrayCity.length();i++){
                    JSONObject cityObject  = arrayCity.getJSONObject(i);
                    City city = new City();
                    city.setCityName(cityObject.getString("name"));
                    city.setCityNummber(cityObject.getInt("id"));
                    city.setProvinceId(provinceId);
                    city.save();
                }
                return true;
            }catch (JSONException e){
                e.printStackTrace();
            }

        }return false;
    }
    /**
     * 解析和处理服务器返回县级数据
     */
    public static boolean handleCountyResponse(String response,int cityId){
        if (!TextUtils.isEmpty(response)){
            try {
                JSONArray arrayCounty = new JSONArray(response);
                for (int i = 0; i< arrayCounty.length();i++){
                    JSONObject countyObject  = arrayCounty.getJSONObject(i);
                    County county = new County();
                    county.setCountyName(countyObject.getString("name"));
                    county.setWeatherId(countyObject.getString("weather_id"));
                    county.setCityId(cityId);
                    county.save();
            }
            return true;
        }catch (JSONException e){
            e.printStackTrace();
            }
        }return false;
    }
}
