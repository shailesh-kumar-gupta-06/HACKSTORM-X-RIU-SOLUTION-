# ⚡ Maximum Sum of Two Elements

## 📖 Problem Statement

At HackerRank, performance optimization is key when processing large datasets. You are given an array of integers representing system metrics.

Your task is to find the **maximum possible sum of any two distinct elements** in the array.

---

## 📥 Input Format

* First line contains an integer `N` (size of array)
* Second line contains `N` space-separated integers

---

## ⚙️ Constraints

* `2 ≤ N ≤ 10^5`
* `-10^9 ≤ arr[i] ≤ 10^9`

---

## 📤 Output Format

* Print a single integer — the **maximum sum of any two distinct elements**

---

## 🔍 Examples

### ✅ Sample Input 0

```id="a1"
5
1 3 5 2 4
```

### ✅ Sample Output 0

```id="a2"
9
```

### 💡 Explanation

* The two largest elements are **5** and **4**
* Maximum sum = `5 + 4 = 9`

---

### ✅ Sample Input 1

```id="a3"
4
-1 -2 -3 -4
```

### ✅ Sample Output 1

```id="a4"
-3
```

### 💡 Explanation

* The two largest elements are **-1** and **-2**
* Maximum sum = `-1 + (-2) = -3`

---

## 🧠 Approach

### 🔹 Key Idea:

To maximize the sum, we need the **two largest elements** in the array.

### 🔹 Efficient Method (O(N)):

* Traverse the array once
* Keep track of:

  * Largest element (`max1`)
  * Second largest element (`max2`)
* Update them while iterating

This avoids sorting and works in **linear time**

---


## 🎯 Key Takeaways

* Only the **top two elements** matter
* No need to sort the entire array
* Optimal solution runs in **O(N)** time and **O(1)** space

---

## 🏁 Difficulty

🟢 Easy

---
