# Singleton Design Pattern – Memory Footprint Comparison

## Objective
Demonstrate the difference in heap memory usage before and after applying
the Singleton Design Pattern in Java.




## Before (Without Singleton)
Multiple DatabaseConnection objects created
High heap memory usage

![Before Singleton](./Screenshot%202026-02-18%20015221.png)

## After (With Singleton)
Single DatabaseConnection instance
Stable and lower heap memory usage

![After Singleton](./Screenshot%202026-02-18%20020047.png)


## Key Observation
Although 10,000 references are created, only one object exists when using Singleton,
which significantly reduces heap memory usage.


