# ⏰ Work Hours Calculator - Java

This Java program calculates the overtime or undertime based on user input for clock-in time, daily workload, and actual clock-out time. It uses the modern `java.time` API to handle time parsing, arithmetic, and formatting.

## 🧩 Features

- Reads user input for:
    - Clock-in time (in HH:mm format).
    - Expected daily workload (hours).
    - Actual clock-out time (in HH:mm format).
- Calculates expected check-out time by adding workload hours to clock-in.
- Computes the difference between expected and actual check-out times.
- Displays hours and minutes balance indicating overtime (+) or undertime (-).

## 🧠 Concepts Illustrated

- Parsing and formatting `LocalTime` with `DateTimeFormatter`.
- Time arithmetic using `plusHours()`.
- Calculating time differences with `Duration.between()`.
- Handling user input with `Scanner`.

## 🚀 How to Use

1. Run the program.
2. Enter the clock-in time in `HH:mm` format (e.g., `08:30`).
3. Enter the daily workload in hours (e.g., `8`).
4. Enter the actual clock-out time in `HH:mm` format (e.g., `18:15`).
5. View the calculated overtime or undertime result.

## 📎 Requirements

- Java JDK 8 or higher.

---

A practical tool for calculating daily working hours balance using Java’s time API. 🕰️