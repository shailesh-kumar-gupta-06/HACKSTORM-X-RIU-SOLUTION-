# 🏝️ Number of Islands (Grid Problem)

## 📖 Problem Statement

At HackerRank, large-scale simulations often involve analyzing grid-based systems. You are given a **2D grid** consisting of `'1'`s (land) and `'0'`s (water).

An **island** is a group of connected `'1'`s connected **horizontally or vertically** (not diagonally).

Your task is to count the **total number of islands** in the grid.

---

## 📥 Input Format

* First line contains two integers `N` and `M` (rows and columns)
* Next `N` lines contain `M` space-separated characters (`'0'` or `'1'`)

---

## ⚙️ Constraints

* `1 ≤ N, M ≤ 1000`

---

## 📤 Output Format

* Print a single integer — the **number of islands**

---

## 🔍 Examples

### ✅ Sample Input 0

```id="g1"
4 5
1 1 0 0 0
1 1 0 0 1
0 0 1 0 1
0 0 0 1 1
```

### ✅ Sample Output 0

```id="g2"
3
```

### 💡 Explanation

There are **3 separate groups** of connected `'1'`s. Each group forms an island.

---

### ✅ Sample Input 1

```id="g3"
3 3
1 1 1
0 1 0
1 1 1
```

### ✅ Sample Output 1

```id="g4"
1
```

### 💡 Explanation

All `'1'`s are connected → only **1 island**

---

## 🧠 Approach

This is a classic **graph traversal problem**.

### 🔹 Key Idea:

* Treat each cell as a node
* Traverse the grid
* Whenever you find a `'1'`, start a traversal (DFS/BFS)
* Mark all connected `'1'`s as visited
* Count how many times you start a new traversal

---

### 🔹 Directions to Explore:

From each cell, check:

* Up `(i-1, j)`
* Down `(i+1, j)`
* Left `(i, j-1)`
* Right `(i, j+1)`

---


---

## ⏱️ Complexity

* **Time Complexity:** `O(N × M)`
* **Space Complexity:** `O(N × M)` (due to recursion/queue in worst case)

---

## 🎯 Key Takeaways

* Classic **DFS/BFS traversal problem**
* Convert grid → graph thinking
* Mark visited nodes to avoid recounting

---

## 🏁 Difficulty

🟡 Medium

---
