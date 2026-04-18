numpy is a multi dimensional array library. we can store data in 1d, 2d, 3d, 4d, ... arrays

### why do we use numpy over lists ?

- lists - slow
- numpy - fast

### why are lists slow and numpy fast ?

A) datatype - a computer obviously read the data with smaller size faster.

    1) numpy uses fixed datatype, it consists:
        - value stored - int32 (4 Bytes)
    2) lists uses a builtin datatype int in python, where it consists of 4 different things:
        - size              int32 (4 Bytes)
        - reference count   int64 (8 Bytes)
        - object type       int64 (8 Bytes)
        - object value      int64 (8 Bytes)

B) Iterations

    while iterating through a numpy array, we don't have to do type-checking everytime
    but in the context lists, we need to type-check while iterating through array as python supports with different datatypes within a list.

C) Contiguous Memory

    -> numpy arrays uses contiguous memory (start of the memory, total size of memory block, type of memory block is stored)
    -> python lists uses pointers to store at different places scattered through our memory

    benifits:

        - our CPUs has SIMD Vector Processing
        - SIMD - Single Instruction (Arthemetic) Multiple Data.
        - If we want to do addition for a lot of values... instead of adding numbers indvidually, SIMD this in one go, if they are stored in contiguous memory

        - Effective Cache Utilization
        - as the data is scattered in lists, cpu takes much time to cache that scattered data than data stored in contiguous memory

### how are lists different from numpy ?

- we can do a lot more in numpy than traditional list operations & methods.

default datatype is int32

### applications:

1) MATLAB replacement
2) Plotting
3) Many application are built upon numpy. (Pandas, Connect 4, Digital Photography)
4) Machine Learning