# Assignment Title: Rescue Robot Multi-Inheritance

## Student Information
- Name: ภัทรกร อนุกูล
- Student ID: 68122250068
- Submission Date: 

---

## Problem Description
ระบบหุ่นยนต์กู้ภัยที่สามารถทำงานได้หลายบทบาท:
- บินได้
- ขับเคลื่อนบนพื้นได้
- ตรวจจับอุณหภูมิ
- สื่อสารและส่งพิกัดได้

---

## Learning Objectives
- เข้าใจแนวคิด Multiple Interfaces
- เข้าใจ Composition
- จัดการปัญหา default method ชื่อชนกัน
- ออกแบบระบบ OOP อย่างเป็นระบบ

---

## System Design

### Key Classes
- RescueRobot → คลาสหลักของระบบ
- Battery → จัดการพลังงาน
- GPSTracker → จัดการพิกัด
- ThermalCamera → ตรวจจับอุณหภูมิ

---

## OOP Concepts Used

- Encapsulation:
  ซ่อนข้อมูลภายใน Battery, GPSTracker และ ThermalCamera

- Inheritance:
  RescueRobot implements 4 interfaces

- Polymorphism:
  ใช้งานผ่าน interface behavior

- Abstraction:
  ใช้ interface แยกบทบาท

- Composition:
  RescueRobot has-a Battery, GPSTracker, ThermalCamera

---

## Java สืบทอดหลาย class ไม่ได้เพราะอะไร

Java ไม่อนุญาตให้สืบทอดหลาย class
เพราะอาจเกิด Diamond Problem และความกำกวมของ method

---

## เราใช้ interface + composition แทนได้อย่างไร

ใช้ Multiple Interfaces เพื่อรับหลายบทบาท
และใช้ Composition เพื่อรวมความสามารถหลายส่วนเข้าในคลาสเดียว

---

## อธิบายการแก้ปัญหา default method ชื่อชนกัน

เมื่อ default method ชื่อชนกัน
ต้อง Override ในคลาส และเรียกผ่าน

Flyable.super.status()
Drivable.super.status()

---

## How to Run

javac *.java
java Main
