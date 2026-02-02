# Singleton Design Pattern – Memory Footprint Comparison

## Objective
Demonstrate the difference in heap memory usage before and after applying
the Singleton Design Pattern in Java.




## Before (Without Singleton)
- Multiple DatabaseConnection objects created
- High heap memory usage

![Before Singleton](screenshots/before_no_singleton.png)


## After (With Singleton)
- Single DatabaseConnection instance
- Stable and lower heap memory usage

![After Singleton](screenshots/after_singleton.png)



## Key Observation
Although 10,000 references are created, only one object exists when using Singleton,
which significantly reduces heap memory usage.


