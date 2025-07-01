# Day 30 – Greedy Algorithms in Java

Today I explored the powerful **Greedy Algorithm** paradigm and solved classic problems that rely on making locally optimal choices with the hope that it leads to a globally optimal solution.

---

## What is Greedy Algorithm?

Greedy algorithms build up a solution piece by piece, always choosing the next piece that offers the **most immediate benefit** or **local optimality**.

> Greedy algorithms don't always yield optimal solutions, but they work well for many well-structured problems (like Activity Selection, Huffman Coding, etc.).

---

## Programs Practiced

### 1. [`ActivitySelection.java`](./ActivitySelection.java)

**Problem**: Given `n` activities with start and end times, select the maximum number of activities that can be performed by a single person.

**Approach**:

* Sort activities by their end times.
* Always select the next activity whose start time is greater than or equal to the end time of the last selected activity.

**Time Complexity**: `O(n log n)` (due to sorting)

---

### 2. [`FractionalKnapsack.java`](./FractionalKnapsack.java)

**Problem**: Given weights and values of items, and a knapsack capacity, return the maximum total value that can be put in the knapsack (you can take fractional parts).

**Approach**:

* Calculate value/weight ratio for each item.
* Sort items by descending ratio.
* Add as much of the item to the knapsack as possible.

**Time Complexity**: `O(n log n)`

---

### 3. [`MinAbsoluteDifferencePairs.java`](./MinAbsoluteDifferencePairs.java)

**Problem**: Pair elements of two arrays such that the sum of absolute differences of pairs is minimized.

**Approach**:

* Sort both arrays.
* Pair the ith smallest element of one array with ith smallest element of the other.

**Time Complexity**: `O(n log n)`

---

### 4. [`MaxLengthChainOfPairs.java`](./MaxLengthChainOfPairs.java)

**Problem**: Given pairs of numbers, form the longest chain such that for any pair (a, b), the next pair (c, d) has `b < c`.

**Approach**:

* Sort pairs based on second element.
* Apply activity selection logic.

---

### 5. [`Coins.java`](./Coins.java)

**Problem**: Given infinite supply of denominations `[1,2,5,10,20,50,100,500,1000]`, find the **minimum number of coins** to make change for value `V`.

**Approach**:

* Use the **largest possible denomination** greedily until the remaining value becomes 0.

**Time Complexity**: `O(n)` where n is the number of denominations.

---

### 6. [`JobSequencingProblem.java`](./JobSequencingProblem.java)

**Problem**: Each job has a deadline and profit. Schedule jobs to maximize total profit while ensuring each job takes one unit of time and is done before the deadline.

**Approach**:

* Sort jobs by descending profit.
* For each job, find a free time slot before its deadline.
* Greedily assign jobs to maximize profit.

**Time Complexity**: `O(n^2)` (can be improved using Disjoint Set)

---

### 7. [`ChocolaProblem.java`](./ChocolaProblem.java)

**Problem**: Given costs of cutting chocolate in horizontal and vertical directions, minimize the cost to cut the entire chocolate into 1x1 pieces.

**Approach**:

* Sort horizontal and vertical costs in descending order.
* Always perform the cut with the highest cost next.
* Multiply cost by current number of segments in the opposite direction.

**Time Complexity**: `O(n log n)`

---

## Key Takeaways

* Greedy algorithms work best when the **greedy choice property** and **optimal substructure** hold.
* Sorting is often the first step in a greedy solution.
* Real-world problems like scheduling, resource allocation, and minimum cost problems often benefit from greedy methods.

---