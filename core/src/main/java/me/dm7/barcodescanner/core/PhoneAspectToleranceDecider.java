package me.dm7.barcodescanner.core;

import android.os.Build;

class PhoneAspectToleranceDecider {

    static boolean isHuaweiOrLenovo() {
        String manufacturer = Build.MANUFACTURER;
        return "HUAWEI".equalsIgnoreCase(manufacturer) || "Lenovo".equalsIgnoreCase(manufacturer);
    }
}
