# Singleton Design Pattern – Memory Footprint Comparison

## Objective
Demonstrate the difference in heap memory usage before and after applying
the Singleton Design Pattern in Java.




## Before (Without Singleton)
- Multiple DatabaseConnection objects created
- High heap memory usage

![Before Singleton](<img width="1401" height="993" alt="image" src="https://github.com/user-attachments/assets/8e4b78cf-8be7-4d76-9582-714bcae54bae" />
)


## After (With Singleton)
- Single DatabaseConnection instance
- Stable and lower heap memory usage

![After Singleton](<img width="1379" height="984" alt="image" src="https://github.com/user-attachments/assets/f2c063d9-3dae-45bc-99e8-9d20769cf65d" />
)



## Key Observation
Although 10,000 references are created, only one object exists when using Singleton,
which significantly reduces heap memory usage.


