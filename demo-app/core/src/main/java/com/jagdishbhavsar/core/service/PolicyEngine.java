package com.jagdishbhavsar.core.service;

import java.util.HashMap;
import java.util.Map;

/**
 * PolicyEngine
 *
 * Purpose:
 * Central engine responsible for managing and applying device policies.
 *
 * This acts as the "brain" of the system service.
 *
 * Responsibilities:
 * - Maintain current state of all policies (WiFi, Bluetooth, USB, etc.)
 * - Apply policy changes
 * - Provide current policy state
 *
 * Design Decisions:
 * - Uses a Map to store policy states → makes it scalable
 * - New policies can be added without changing structure
 *
 * Example:
 * POLICY_WIFI → true/false
 * POLICY_BLUETOOTH → true/false
 *
 * In real AOSP:
 * - This logic would interact with system services like WifiManager, UsbManager, etc.
 *
 * In this project:
 * - We simulate behavior using in-memory state
 */
public class PolicyEngine {

    // Stores current state of all policies
    private final Map<String, Boolean> policyStateMap = new HashMap<>();

    /**
     * Sets a policy state.
     *
     * @param policy  Policy type (e.g., WIFI, BLUETOOTH)
     * @param enabled Desired state
     */
    public void setPolicy(String policy, boolean enabled) {
        policyStateMap.put(policy, enabled);

        // Simulate applying policy
        System.out.println("[PolicyEngine] " + policy + " set to " + enabled);
    }

    /**
     * Returns current state of a policy.
     *
     * @param policy Policy type
     * @return current state (default = true if not set)
     */
    public boolean getPolicyState(String policy) {
        return policyStateMap.getOrDefault(policy, true);
    }
}