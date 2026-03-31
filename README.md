# 🚀 AOSP Device Policy Service (Simulation)

A modular, AOSP-inspired Android framework project that demonstrates how custom system services are designed, exposed, and consumed by applications.

<br>

## 🎯 Overview

This project simulates the internal architecture of Android’s system services (like `DevicePolicyManager`) using a clean, layered design.

It showcases how an Android application interacts with a framework API, which internally communicates with a system service responsible for enforcing device-level policies.

<br>

## 🧠 Key Concept

Instead of directly controlling hardware, this project focuses on **how Android is structured internally**:

* Framework API (Manager)
* System Service
* Policy Engine (core logic)

> ⚠️ Note: Binder IPC (AIDL) is simulated using a Java interface for simplicity.

<br>

## 🧱 Architecture

```
App (demo-app)
   ↓
DevicePolicyManagerCustom (Framework API)
   ↓
IDevicePolicyCustom (Interface - AIDL Simulation)
   ↓
DevicePolicyCustomService (System Service)
   ↓
PolicyEngine (Core Logic)
```

<br>

## 🔧 Modules

### 📱 demo-app

Android application used to test and demonstrate the framework.

### 🧩 core

Framework module containing all system-level components.

<br>

## 🔥 Core Components

### 1. PolicyEngine

* Central logic layer
* Stores and manages policy states
* Easily extensible for new policies

### 2. DevicePolicyCustomService

* Acts as a system service
* Implements policy interface
* Delegates execution to PolicyEngine

### 3. DevicePolicyManagerCustom

* Framework API exposed to apps
* Abstracts internal implementation
* Acts like `getSystemService()`

### 4. SystemServerSimulation

* Simulates Android boot process
* Initializes and provides system services

### 5. IDevicePolicyCustom

* Interface representing AIDL contract
* Enables loose coupling between layers

<br>

## ⚙️ Features (Current)

* ✅ WiFi Policy Control (simulated)
* ✅ Bluetooth Policy Control (simulated)
* ✅ Scalable policy-based design

<br>

## 🚀 How It Works

1. App starts and simulates system boot
2. SystemServer initializes the service
3. App gets framework manager
4. App calls:

```kotlin
manager.setPolicy("WIFI", false)
```

5. Flow:

```
Manager → Service → PolicyEngine
```

6. Policy state updated and returned

<br>

## 📊 Sample Output (Logcat)

```
WiFi state = false
Bluetooth state = true
```

<br>

## 🔮 Future Enhancements

* App Whitelisting
* Kiosk Mode Simulation
* USB Restriction
* Policy Profiles (Work / Kids Mode)
* Remote Policy Control

<br>

## 🧩 Why This Project?

Most Android projects focus on UI and APIs.

This project focuses on:

* System-level design
* Framework architecture
* AOSP concepts

<br>

## 💡 Key Learnings

* Layered Android architecture
* Separation of concerns
* Interface-driven design
* System service lifecycle

<br>

## ⚡ One-Line Summary

A mini AOSP-style system service framework that demonstrates how Android internally manages device policies through a structured Manager → Service → Engine flow.

<br>

## 👨‍💻 Author

**Jagdish Bhavsar**<br>
Lead Android & AOSP Engineer | System Design | IoT | 13+ Years Experience

<br>

## ⭐ If you found this useful

Give it a ⭐ and connect on LinkedIn!
