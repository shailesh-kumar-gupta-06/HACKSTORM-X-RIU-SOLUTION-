# 🌐 HackerRank Network Optimization Queries

## 📖 Problem Statement

HackerRank is a globally recognized platform where millions of developers participate in coding contests, practice problems, and improve their skills. Behind the scenes, it relies on a powerful network of interconnected servers to handle massive traffic during competitions.

You are part of the infrastructure team responsible for maintaining this network.

The system consists of **N servers (nodes)** connected by **M bidirectional links (edges)**. Each link has an associated **latency cost**.

Due to heavy contest load, the network undergoes **dynamic updates**, where latency on certain links increases over time.

---

## 🧩 Query Types

You are given **Q queries** of two types:

### 🔹 1. Update Query

```
1 L R X
```

* Increase the latency of all edges from index **L to R** by **X**

---

### 🔹 2. Shortest Path Query

```
2 U V
```

* Find the **minimum latency** required to travel from server **U to V**
* If no path exists, return **-1**

---

## 📥 Input Format

```
N M Q
u1 v1 w1
u2 v2 w2
...
uM vM wM

Queries:
1 L R X
2 U V
```

---

## ⚙️ Constraints

* `1 ≤ N, M, Q ≤ 10^5`
* `1 ≤ ui, vi ≤ N`
* `1 ≤ wi, X ≤ 10^9`
* `1 ≤ L ≤ R ≤ M`

---

## 📤 Output Format

* For each query of type `2`, print the **minimum latency**
* If no path exists, print `-1`

---

## 🔍 Example

### ✅ Sample Input

```
5 5 3
1 2 4
2 3 2
3 4 7
4 5 1
1 5 10
2 1 5
1 2 4 3
2 1 5
```

---

### ✅ Sample Output

```
10
10
```

---

## 💡 Explanation

* **Initial Graph:**

  * Edges:

    * (1–2: 4)
    * (2–3: 2)
    * (3–4: 7)
    * (4–5: 1)
    * (1–5: 10)

* **Query 1:** `2 1 5`

  * Shortest path from **1 → 5** is **10** (direct edge)

* **Query 2:** `1 2 4 3`

  * Increase weights of edges **2 to 4** by **+3**
  * Updated edges:

    * (2–3: 5)
    * (3–4: 10)
    * (4–5: 4)

* **Query 3:** `2 1 5`

  * Recompute shortest path
  * Still **10** (direct edge remains optimal)

---

## 🧠 Approach (High-Level)

This is a **dynamic graph problem** combining:

* **Range Updates on edges**
* **Shortest Path Queries**

### Key Challenges:

* Efficiently updating multiple edge weights
* Answering shortest path queries quickly

### Possible Strategies:

* Use a **Segment Tree / Fenwick Tree** to handle range updates on edge weights
* Apply **Dijkstra’s Algorithm** for shortest path queries
* Optimize by:

  * Lazy propagation for updates
  * Avoid recomputing entire graph unnecessarily

---

## 🚀 Key Takeaways

* Combines **graph algorithms + data structures**
* Requires handling **dynamic updates efficiently**
* Real-world analogy: managing **network latency under load**

---

## 🏁 Difficulty

🔴 Hard
