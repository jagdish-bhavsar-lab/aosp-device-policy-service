package com.jagdishbhavsar.core.framework;

import com.jagdishbhavsar.core.aidl.IDevicePolicyCustom;
import com.jagdishbhavsar.core.service.DevicePolicyCustomService;

/**
 * DevicePolicyManagerCustom
 *
 * Purpose:
 * Acts as the framework-level API exposed to applications.
 *
 * Responsibilities:
 * - Provide a clean interface for apps to interact with the system service
 * - Hide internal service implementation details
 *
 * Architecture Role:
 * App → Manager → Service → PolicyEngine
 *
 * In real Android:
 * - Retrieved via Context.getSystemService()
 * - Communicates with system service using Binder (AIDL)
 *
 * In this project:
 * - Directly holds reference to service (simulated)
 */
public class DevicePolicyManagerCustom {

    private final IDevicePolicyCustom service;

    public DevicePolicyManagerCustom(IDevicePolicyCustom service) {
        this.service = service;
    }

    public void setPolicy(String policy, boolean enabled) {
        service.setPolicy(policy, enabled);
        System.out.println("[Manager] Request sent for policy: " + policy);
    }

    public boolean getPolicyState(String policy) {
        return service.getPolicyState(policy);
    }
}