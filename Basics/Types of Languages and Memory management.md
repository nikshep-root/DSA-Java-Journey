 1. Procedural Programming
Focus: Step-by-step instructions or procedures (functions).

Style: Code is organized into procedures or functions.

Example Languages: C++, Pascal, BASIC.

Analogy: Like following a recipe — step 1, step 2, etc.

Key Features:

Uses loops, conditionals, and function calls.
Data and functions are separate.

2. Functional Programming
Focus: Pure functions and immutable data.

Style: No changing variables or states.

Example Languages: Haskell, Lisp, Scala, parts of Python/JavaScript.

Analogy: Like solving a math problem — same input always gives the same output.

Key Features:

Avoids loops (uses recursion instead)
Emphasizes expressions over statements
No side effects

3. Object-Oriented Programming (OOP)
Focus: Real-world modeling using objects (data + behavior).

Style: Code is organized into classes and objects.

Example Languages: Java, C++, Python (can do both).

Analogy: Like making blueprints (classes) and building objects (instances).

Key Concepts:

Encapsulation (bundling data and methods)
Inheritance (reusing code from parent classes)
Polymorphism (same interface, different behavior)

--

1. Stack Memory

Stores: Function calls, local variables

Size: Small, but fast

Managed: Automatically (LIFO – Last In, First Out)

Cleared when: Function returns

💡 Analogy: Like a stack of plates — last one placed is the first to go.

2. Heap Memory

Stores: Objects, dynamic memory (e.g., new or malloc)

Size: Large, but slower

Managed: Manually or via Garbage Collection

Cleared when: You manually free it or GC kicks in

💡 Analogy: Like a parking lot — park wherever there's space, but you must remember to remove your car.

Memory management Techinques:
1. Manual Memory Management
You explicitly allocate (malloc, new) and free (free, delete) memory.
Used in languages like C and C++, but risky due to memory leaks or crashes.

2. Garbage Collection (Automatic)
Memory is automatically reclaimed when objects are no longer used.
Common in Java, Python, etc., using methods like mark-and-sweep or reference counting.




