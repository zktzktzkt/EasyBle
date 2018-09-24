package com.ficat.easyble;

import android.bluetooth.BluetoothDevice;
import android.support.annotation.NonNull;
import android.text.TextUtils;

import java.io.Serializable;

/**
 * Created by pw on 2018/9/13.
 */

public class BleDevice implements Serializable {
    public volatile boolean connected;
    public volatile boolean connecting;
    public String address;
    public String name;
    private BluetoothDevice device;
    private byte[] scanRecord;

    BleDevice(@NonNull BluetoothDevice device) {
        this.device = device;
        this.address = device.getAddress();
        this.name = device.getName();
        if (TextUtils.isEmpty(name)) {
            name = "unknown";
        }
    }

    public BluetoothDevice getDevice() {
        return device;
    }

    public byte[] getScanRecord() {
        return scanRecord;
    }
}
