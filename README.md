# Search Algorithms: Performance Comparison

Hi! I'm a Computer Science student, and this is a project I built to see how different search algorithms actually perform on a real machine (my M1 Mac).

We often hear that Binary Search is faster than Linear Search, but I wanted to prove it with data and visualizations.

## What's Inside?
- **Linear Search**: A simple approach that checks every single element.
- **Binary Search**: A "divide and conquer" approach that's much more efficient for sorted data.
- **Benchmark Engine**: Java code that runs these algorithms against arrays ranging from 1,000 to 1,000,000 elements and measures the time in nanoseconds.

## The Results
I used MATLAB to plot the time it took for each algorithm to find the last element in the array (the "Worst Case").

![Search Performance Graph](search_graph.png)

As you can see in the graph:
- **Linear Search** grows steadily as the data gets bigger.
- **Binary Search** stays almost flat, proving it can handle massive amounts of data without slowing down.

## How to Run
1. Open the project in IntelliJ.
2. Run `Main.java` to see the raw nanosecond data in the console.
3. Check out the `TestEdgeCases.java` file to see how the code handles empty or single-element arrays.