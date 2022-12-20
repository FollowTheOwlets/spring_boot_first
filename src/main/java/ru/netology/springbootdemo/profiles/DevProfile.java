package ru.netology.springbootdemo.profiles;

public class DevProfile implements SystemProfile {
    public DevProfile() {
    }
    @Override
    public java.lang.String getProfile() {
        return "Current profile is dev";
    }
}
