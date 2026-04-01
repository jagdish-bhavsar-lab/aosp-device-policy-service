# AOSP Device Policy Service (Simulation)

A modular Android framework project demonstrating how system services can be designed, exposed, and consumed using AOSP-inspired architecture.

<br>

## 🎯 Overview

This project models a policy-driven system service similar to Android’s DevicePolicyManager, using a layered architecture to separate framework APIs, service logic, and policy enforcement.

<br>

## 🏗️ Architecture

```
App (demo-app)
   ↓
DevicePolicyManagerCustom (Framework API)
   ↓
IDevicePolicyCustom (Interface)
   ↓
DevicePolicyCustomService (System Service)
   ↓
PolicyEngine (Core Logic)
```

<br>

## 🔧 Key Components

* **DevicePolicyManagerCustom**
  Framework-facing API for applications (similar to `getSystemService()` pattern)

* **DevicePolicyCustomService**
  Core service layer handling requests and coordinating policy execution

* **PolicyEngine**
  Centralized logic for policy management and enforcement

* **IDevicePolicyCustom**
  Interface layer simulating AIDL-based communication

* **SystemServerSimulation**
  Simulates Android service initialization lifecycle

<br>

## ⚙️ Features

* WiFi policy control (simulated)
* Bluetooth policy control (simulated)
* Extensible policy-based architecture

<br>

## 🔄 Execution Flow

```
App → Manager → Service → PolicyEngine
```

Policy updates are processed through layered abstraction, ensuring clear separation between API, service, and logic layers.

<br>

## 🎯 Key Concepts Demonstrated

* System service design patterns
* Layered architecture (Framework → Service → Logic)
* Interface-driven communication (AIDL-inspired)
* Modular and extensible system design

<br>

## ⚠️ Note

Binder (AIDL) communication is simulated using interfaces to focus on architectural design rather than IPC implementation.

<br>

## 🚀 Future Enhancements

* Binder/AIDL integration
* Permission and security enforcement
* Multi-client handling
* Advanced policy controls (kiosk mode, app restrictions)

<br>

## 👨‍💻 Author

Jagdish Bhavsar
Technical Lead – Android | AOSP | IoT | System-Level Design

<br>

## ⭐ If you found this useful

Give it a ⭐ and connect on LinkedIn!
