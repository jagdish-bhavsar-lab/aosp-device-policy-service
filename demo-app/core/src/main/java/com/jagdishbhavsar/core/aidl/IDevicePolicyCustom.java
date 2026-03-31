package com.jagdishbhavsar.core.aidl;
/**
 * IDevicePolicyCustom
 *
 * Purpose:
 * Defines the contract between client (app/framework)
 * and the system service.
 *
 * Simulates Android Binder IPC using AIDL.
 *
 * Design:
 * - Generic policy-based API
 * - Easily extensible (WiFi, Bluetooth, USB, etc.)
 */
public interface IDevicePolicyCustom {

    /**
     * Set a policy state.
     *
     * @param policy  Policy type (WIFI, BLUETOOTH, etc.)
     * @param enabled true = enable, false = disable
     */
    void setPolicy(String policy, boolean enabled);

    boolean getPolicyState(String policy);
}