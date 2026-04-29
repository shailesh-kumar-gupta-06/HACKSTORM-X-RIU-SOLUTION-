# 🎯 Subarray with Given Sum (K)

## 📖 Problem Statement

At HackerRank, analyzing large datasets efficiently is crucial. You are given an array of integers and a target value **K**.

Your task is to determine whether there exists a **continuous subarray** whose sum is exactly equal to **K**.

* If such a subarray exists, print **YES**
* Otherwise, print **NO**

---

## 📥 Input Format

* First line contains two integers `N` and `K`
* Second line contains `N` space-separated integers

---

## ⚙️ Constraints

* `1 ≤ N ≤ 10^5`
* `-10^9 ≤ arr[i] ≤ 10^9`
* `-10^14 ≤ K ≤ 10^14`

---

## 📤 Output Format

* Print `"YES"` if a subarray with sum `K` exists, otherwise `"NO"`

---

## 🔍 Examples

### ✅ Sample Input 0

```id="s1"
5 12
1 2 3 7 5
```

### ✅ Sample Output 0

```id="s2"
YES
```

### 💡 Explanation

Subarray **[2, 3, 7]** has sum = **12** → ✅ YES

---

### ✅ Sample Input 1

```id="s3"
4 15
1 2 3 4
```

### ✅ Sample Output 1

```id="s4"
NO
```

### 💡 Explanation

No subarray has sum = **15**

---

## 🧠 Approach

### 🔹 Key Idea: Prefix Sum + Hash Set

We use the concept of **prefix sums**:

* Let `prefix[i] = sum of elements from 0 to i`
* If there exists a subarray with sum `K`, then:

```
prefix[j] - prefix[i] = K
→ prefix[i] = prefix[j] - K
```

So while traversing:

* Keep storing prefix sums in a **set**
* For each prefix sum, check if `(current_sum - K)` exists

---

## 🚀 Algorithm Steps

1. Initialize:

   * `sum = 0`
   * HashSet to store prefix sums
2. Traverse array:

   * Add current element to `sum`
   * If `sum == K` → return YES
   * If `(sum - K)` exists in set → return YES
   * Insert `sum` into set
3. If no such subarray found → return NO

---

## ⏱️ Complexity

* **Time Complexity:** `O(N)`
* **Space Complexity:** `O(N)`

---

## 🎯 Key Takeaways

* Works with **negative numbers** (unlike sliding window)
* Uses **prefix sum + hashing**
* Efficient for large inputs (`10^5`)

---

## 🏁 Difficulty

🟡 Medium

---
