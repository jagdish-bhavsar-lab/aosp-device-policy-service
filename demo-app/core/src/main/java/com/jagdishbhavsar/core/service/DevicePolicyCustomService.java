package com.jagdishbhavsar.core.service;
import com.jagdishbhavsar.core.aidl.IDevicePolicyCustom;

/**
 * DevicePolicyCustomService
 *
 * Purpose:
 * Acts as the system-level service that exposes device policy controls.
 *
 * Responsibilities:
 * - Receive requests from client (via AIDL / Manager)
 * - Delegate actual logic to PolicyEngine
 *
 * Architecture Role:
 * - This sits between Binder (AIDL) and core logic (PolicyEngine)
 *
 * In real AOSP:
 * - Registered inside SystemServer
 * - Exposed via Binder IPC
 *
 * In this project:
 * - Acts as a simulated system service
 */
/**
 * System Service implementation
 */
public class DevicePolicyCustomService implements IDevicePolicyCustom {

    private final PolicyEngine policyEngine;

    public DevicePolicyCustomService() {
        this.policyEngine = new PolicyEngine();
    }

    @Override
    public void setPolicy(String policy, boolean enabled) {
        policyEngine.setPolicy(policy, enabled);
        System.out.println("[Service] Applied policy: " + policy);
    }

    @Override
    public boolean getPolicyState(String policy) {
        return policyEngine.getPolicyState(policy);
    }
}