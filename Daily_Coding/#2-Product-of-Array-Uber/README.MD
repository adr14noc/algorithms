# Concept 
The two sum problem is a common interview question, and it is a variation of the subset sum problem. There is a popular dynamic programming solution for the subset sum problem, but for the two sum problem we can actually write an algorithm that runs in O(n) time. The challenge is to find all the pairs of two integers in an unsorted array that sum up to a given S. 

# Challenge
Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i

# Examples
 If our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].

# Bonus: 
What if you can't use division?