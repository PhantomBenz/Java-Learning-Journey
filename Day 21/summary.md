# Day 21 – Introduction to Backtracking in Java

Today, I explored **Backtracking**, a powerful algorithmic technique for solving constraint-based and combinatorial problems by building solutions incrementally and abandoning them (backtracking) upon failure.

---

## What is Backtracking?

* A **general algorithmic technique** that incrementally builds candidates to the solution and abandons a candidate (`backtracks`) as soon as it determines that this candidate cannot possibly lead to a valid solution.
* Often implemented with **recursive** functions.
* Used for problems like **permutations**, **combinations**, **subset generation**, and NP-hard puzzles (e.g., Sudoku, N-Queens).

---

## Types of Backtracking Problems

Backtracking problems generally fall into three categories:

1. **Decision Problems**

   * Determine if **at least one valid solution** exists.
   * Example: **N-Queens** (`d_NQueens.java`) – Is there a way to place n queens so none attack each other?

2. **Optimization Problems**

   * Find the **best** solution according to some metric (e.g., minimal cost or maximal value).
   * Example: **N-Knights** (`e_NKnights.java`) can be extended to maximize non-attacking placements.

3. **Enumeration (Generation) Problems**

   * **List all possible solutions** or configurations.
   * Examples:

     * **Subset generation** (`b_FindSubset.java`)
     * **Permutation generation** (`c_FindPermutation.java`)
     * **Sudoku** (`g_Sudoku.java`), **Grid paths** (`f_GridWays.java`) – enumerate valid fills or paths.

---

## How Backtracking Works (Generic Pattern)

```java
void backtrack(parameters) {
    if (solutionFound) {
        recordSolution();
        return;
    }
    for (choice : choices) {
        if (isValid(choice)) {
            makeChoice(choice);
            backtrack(updatedParameters);
            undoChoice(choice); // backtrack
        }
    }
}
```

* **isValid()** prunes invalid branches early.
* **makeChoice()/undoChoice()** manage state changes.

---

## Programs Practiced

| Filename                   | Description                                                         |
| -------------------------- | ------------------------------------------------------------------- |
| `a_BacktrackingArray.java` | Demonstrates backtracking framework on simple array choices.        |
| `b_FindSubset.java`        | Generates all subsets of an input set using recursive backtracking. |
| `c_FindPermutation.java`   | Generates all permutations of an array.                             |
| `d_NQueens.java`           | Solves the N‑Queens puzzle for n queens.                            |
| `e_NKnights.java`          | Solves placing knights on a board without mutual attacks.           |
| `f_GridWays.java`          | Counts paths in an m×n grid using backtracking.                     |
| `g_Sudoku.java`            | Solves Sudoku puzzles by filling empty cells recursively.           |

---

## Key Takeaways

* Backtracking is **depth-first search with pruning**, ideal for exhaustive search when constraints exist.
* Effective **pruning (isValid)** drastically reduces search space.
* Many combinatorial and puzzle problems can be elegantly solved with backtracking.
