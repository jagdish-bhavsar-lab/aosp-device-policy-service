package com.jagdishbhavsar.demoapp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

// Import from core module
import com.jagdishbhavsar.core.common.PolicyConstants
import com.jagdishbhavsar.core.framework.DevicePolicyManagerCustom
import com.jagdishbhavsar.core.service.SystemServerSimulation

/**
 * MainActivity
 *
 * Purpose:
 * Acts as a demo client application to interact with the
 * custom AOSP Device Policy Framework.
 *
 * Responsibilities:
 * - Simulate system boot
 * - Initialize framework manager
 * - Trigger policy changes
 * - Display/log results
 *
 * Note:
 * This activity is only for demonstration/testing purposes.
 * It mimics how an Android app would interact with framework APIs.
 */
class MainActivity : AppCompatActivity() {

    private lateinit var manager: DevicePolicyManagerCustom

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Step 1: Simulate Android system boot
        SystemServerSimulation.startSystem()

        // Step 2: Get system service
        val service = SystemServerSimulation.getDevicePolicyService()

        // Step 3: Initialize framework manager
        manager = DevicePolicyManagerCustom(service)

        // Step 4: Apply a policy (WiFi OFF)
        manager.setPolicy(PolicyConstants.POLICY_WIFI, false)

        // Step 5: Read back state
        val wifiState = manager.getPolicyState(PolicyConstants.POLICY_WIFI)

        // Step 6: Log result (visible in Logcat)
        Log.d("DevicePolicyDemo", "WiFi state = $wifiState")

        // Optional: Test another policy (future scalability)
        manager.setPolicy(PolicyConstants.POLICY_BLUETOOTH, true)
        val btState = manager.getPolicyState(PolicyConstants.POLICY_BLUETOOTH)

        Log.d("DevicePolicyDemo", "Bluetooth state = $btState")
    }
}