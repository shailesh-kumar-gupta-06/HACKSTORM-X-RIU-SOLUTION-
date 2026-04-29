# 🛡️ Defanging an IP Address

## 📖 Problem Statement

At HackerRank, millions of developers submit code every day. To maintain security and prevent malicious links from being accidentally clicked, the platform stores IP addresses in a **defanged format**.

A **defanged IP address** replaces every `"."` with `"[.]"`.

As part of the security team, your task is to convert a given server IP address into its defanged version.

---

## 🧾 Input Format

* A single string `address` representing a valid IPv4 address.

---

## ⚙️ Constraints

* `1 ≤ length of address ≤ 50`
* The input is guaranteed to be a valid IPv4 address.

---

## 📤 Output Format

* Print the **defanged version** of the given IP address.

---

## 🔍 Examples

### ✅ Sample Input 0

```
1.1.1.1
```

### ✅ Sample Output 0

```
1[.]1[.]1[.]1
```

### 💡 Explanation

We replace every `"."` with `"[.]"` step by step:

* Replace first `.` → `1[.]1.1.1`
* Replace second `.` → `1[.]1[.]1.1`
* Replace third `.` → `1[.]1[.]1[.]1`

---

### ✅ Sample Input 1

```
255.100.50.0
```

### ✅ Sample Output 1

```
255[.]100[.]50[.]0
```

### 💡 Explanation

* Replace first `.` → `255[.]100.50.0`
* Replace second `.` → `255[.]100[.]50.0`
* Replace third `.` → `255[.]100[.]50[.]0`

---

## 🧠 Approach

* Traverse the input string character by character.
* If the character is `"."`, replace it with `"[.]"`.
* Otherwise, keep the character as it is.
* Build the result string and print it.

---


## 🎯 Key Takeaway

This problem is a simple **string manipulation task** where the goal is to safely transform an IP address into a non-clickable format by replacing `"."` with `"[.]"`.

---
