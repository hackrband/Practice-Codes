# IPv4 Address Validator in Java

This is a simple Java program to validate IPv4 addresses. It checks both the format and the numeric range of each octet.

---

## Features

- Validates IP addresses of the form `A.B.C.D`
- Each octet (`A`, `B`, `C`, `D`) can range from `0` to `255`
- Leading zeros are allowed (`000.12.12.034` is valid)
- Prints `true` if valid, `false` otherwise

---

## How It Works

1. Uses a **regex** to check the general format: four numbers separated by dots.
2. Splits the string by `.` and checks that each number is ≤ 255.
