package ru.netology.springbootdemo.profiles;

public class ProductionProfile implements SystemProfile {
    public ProductionProfile() {
    }
    @Override
    public String getProfile() {
        return "Current profile is production";
    }
}
