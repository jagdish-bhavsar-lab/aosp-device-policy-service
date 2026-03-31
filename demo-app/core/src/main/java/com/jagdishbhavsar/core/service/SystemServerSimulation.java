package com.jagdishbhavsar.core.service;
/**
 * SystemServerSimulation
 *
 * Purpose:
 * Simulates Android's SystemServer, which is responsible for
 * starting and registering system services during device boot.
 *
 * Responsibilities:
 * - Initialize system services
 * - Provide access to those services
 *
 * Architecture Role:
 * Acts as the entry point that wires:
 * Manager → Service → PolicyEngine
 *
 * In real AOSP:
 * - SystemServer starts during boot
 * - Services are registered via ServiceManager
 *
 * In this project:
 * - We manually initialize and return the service instance
 */
public class SystemServerSimulation {

    private static DevicePolicyCustomService devicePolicyService;

    /**
     * Bootstraps the system (simulates Android boot)
     */
    public static void startSystem() {
        System.out.println("[SystemServer] Starting system services...");

        devicePolicyService = new DevicePolicyCustomService();

        System.out.println("[SystemServer] DevicePolicyCustomService started");
    }

    /**
     * Provides access to the service (like ServiceManager in Android)
     */
    public static DevicePolicyCustomService getDevicePolicyService() {
        if (devicePolicyService == null) {
            throw new IllegalStateException("System not started. Call startSystem() first.");
        }
        return devicePolicyService;
    }
}