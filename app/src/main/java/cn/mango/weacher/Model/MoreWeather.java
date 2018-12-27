package cn.mango.weacher.Model;

import cn.mango.weacher.R;

public class MoreWeather {
    private String week;
    private String weather;
    private String day_c;   // 白天气温
    private String night_c; // 夜间气温

    public MoreWeather() {
    }

    public MoreWeather(String week, String weather, String day_c, String night_c) {
        this.week = week;
        this.weather = weather;
        this.day_c = day_c;
        this.night_c = night_c;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public String getWeather() {
//        int img = 0;
        String str = null;
        switch(weather){
            case "晴":
                str = "🌞";
                break;
            case "多云":
                str = "⛅";
                break;
            case "小雨":
                str = "☔";
                break;
            case "阴":
                str = "☁";
                break;
            case "小雪":
                str = "⛄";
                break;
            default:
                str = "❄";
                break;
        }

        return str;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getDay_c() {
        return day_c;
    }

    public void setDay_c(String day_c) {
        this.day_c = day_c;
    }

    public String getNight_c() {
        return night_c;
    }

    public void setNight_c(String night_c) {
        this.night_c = night_c;
    }
}