KBestCounter - run by entering a number k, and it will show you the k largest elements. Also works with other data types. If you wish to test the program with strings, comment out the integer tester and uncomment the string tester portion (start & end locations marked with comments).

Contents of Integer tester:
Integer[] data = {-99,0,1,3,5,7,9,2,4,6,8};
Contents of String tester:
String[] data2 = {"apple","bagle","cat","dog","elephant"};

Files:
TestKBest.java - Tester program, contains command line prompts and 2 different testers for integer and string.
KBestCounter - Implemented using a max-heap using a priority queue. The heap keeps track of the k largest values, and will add one value at a time, and make sure the heap is correct after each add. readData adds the value from the input data set one at a time on the heap, and output() simply puts the numbers in the heap in largest->smallest order and returns.
