## Please enter your personal info here:
Name: Jana Mourad

PennKey: jam903

# Part 1:
## Are Alicia and Lloyd both wrong, or perhaps both right? Is only one of them correct? Why?
They are both correct depending on the types of list that is implemented, since the runtime complexity depends on whether the list is an ArrayList or a LinkedList. For snippet A, if it is an ArrayList, then it would be O(1) but if it is a LinkedList, then O(n). For snipped B if it is an ArrayList then it would be O(n) since things would shift after the remove, and if it is a LinkedList then it would be O(1). 

# Part 2:
## What are the Big O and Big Ω times for snippets C and D?
Snippet C: Big O = O(n * m) , Big Ω = Ω(1)
Snippet D: Big O = O(n * m) , Big Ω = Ω(n * m)
## When measuring actual runtime, does one of the snippets run faster than the other? In what situations? Why do you think this is the case?
Snippet C runs faster than Snippet D when using the getGridOne() function because Snippet C can exit early after finding the target, while Snippet D continues scanning the entire grid regardless. When the target appears later in the grid or is not present, both snippets must scan most or all of the grid, causing similar runtimes. 
## What else do you notice about the reported runtime? Is it 100% consistent every time you run it?
The runtimes differ each runtime but both remain close in runtime. Some times C is quicker and other times D is. 

# Part 3:
## Before you make any changes, explain whether you think a LinkedList or an ArrayList makes more sense in this instance. Which do you think will be faster? Why?
A LinkedList makes more sense and will be faster because the code repeatedly removes the first element in the list using remove(0). For a LinkedList, removing the first element runs in O(1) time, while for an ArrayList it requires shifting all remaining elements, resulting in O(n) time per removal.

## When measuring actual runtime, is the LinkedList version Suho wrote, or your ArrayList version faster? Does this change when the list size is small versus when it is very large?
The LinkedList was faster than the ArrayList after 10 runs. When the list size was small ArrayList was faster but when it was large, LinkedList was significantly faster. 

## If you ignore queue creation times, does that affect which ticket processor version is faster?
When queue creation time is ignored, the LinkedList implementation is faster than the ArrayList implementation for both small and large sized lists. This is because the remaining measured operation is ticket removal, where LinkedList removes elements from the front in O(1) time, while ArrayList incurs an O(n) cost due to shifting each element.

## Write a paragraph or two in the style of a technical report (think about – how would I write this professionally if I needed to explain my findings to my manager?).
Your report should answer the following questions:
* What did you learn from this experience?
* Which implementation do you suggest should be used? Are there certain situations that might call for the other approach?
* How does the theoretical time complexity compare with your findings?
* 
Given this experiment, I learned that while Big-O analysis predicts that removing elements from the front of an ArrayList is inefficient, initial runtime measurements showed that ArrayList could outperform LinkedList for a small queue sizes due to lower constant overhead. However, as the list size increased, the cost of repeatedly shifting elements in the ArrayList became dominant, therefore the LinkedList implementation performed significantly better. This showed the importance of considering both input size and the specific operations performed when evaluating performance.

Based on these findings, I would recommend using a LinkedList when the workload involves many removals from the front of the list, especially when it comes to large queues, since it provides consistent O(1) removal time. An ArrayList may still be appropriate in scenarios where the queue is small, or when random accessing are more important. In addition, by modifying the ArrayList implementation to remove elements from the end instead of the front, removal time can be reduced to O(1), resulting in better performance similar to a LinkedList, and maybe even better. Overall, the results aligned with the theoretical expectations when we measured only the key operations. The performance results matched what Big-O theory predicted, and allowed us to see how runtime scales with input size and not the exact speed for small cases.



# Part 4
## What are the Big O and Big Ω times for Javier's algorithm? What are the Big O and Big Ω for space use?
Big O time = O(n log n) 
Big Ω time = Ω(n log n) 

Big O space = O(n) 
Big Ω space = Ω(n) 

## Write a paragraph or two in the style of a technical report (think about – how would I write this professionally if I needed to explain my findings to my manager?). 
Your report should answer the following questions:
* Which of the two algorithms (yours versus Javier's) is more efficient in time and space (in terms of Big O)
    * What about in actual runtime?
* Which implementation do you suggest should be used? Are there certain situations that might call for the other approach?

With both the iterative and recursive implementations of merge sort, they have the same theoretical efficiency, but in terms of Big O analysis, both algorithms run in O(n log n) time and require O(n) additional space, since they repeatedly merge smaller arrays and allocate new arrays during this process. From an asymptotic perspective, neither implementation is more efficient than the other, however, when considering actual runtime, the recursive implementation generally performs better due to less constants. The iterative version uses repeated list operations, which can have a negative impact on real world performance despite having the same Big O complexity. Therefore, based on these findings, the recursive merge sort is the preferred implementation for most  cases due to its maintainability, with the iterative approach still being appropriate in certain circumstances. 
