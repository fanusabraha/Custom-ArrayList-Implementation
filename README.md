Overview
This assignment focuses on implementing and understanding algorithms by creating a custom version of the ArrayList data structure in Java. You will implement a CustomArrayList class that fulfills the requirements defined in the CustomList interface. The goal is to deepen your understanding of how ArrayLists function internally.

Important Note
In the instructional material, there is a reference to SourceTree. Instead of SourceTree, we recommend using GitHub Desktop for version control. You can install GitHub Desktop following the guide here: GitHub Desktop Installation Guide.

What You Will Learn
1. Data Structures
Understanding the workings of dynamic arrays and how they grow.
Implementing a custom version of the ArrayList data structure.
2. Abstract Methods
How to implement abstract methods in a concrete class.
Translating an interface specification into a working implementation.
3. Testing and Debugging
Testing your implementation by writing test cases and validating your logic.
Debugging common errors when managing array indices and resizing.
4. Object-Oriented Programming
Practicing interface and class design.
Creating a scalable and reusable implementation.
How to Get Started
1. Clone the Starter Code
Clone the repository containing the starter code using Git:
bash
Copy code
git clone https://github.com/CodersCampus/Assignment5starter
Alternatively, download the repository as a ZIP file and extract it to your project directory.
2. Project Structure
CustomList Interface: Defines the abstract methods that need to be implemented.
CustomArrayList Class: Your implementation of the CustomList interface.
CustomListApplication Class: Contains the main method where you will test your implementation.
3. Assignment Requirements
Implement all methods in the CustomList interface inside the CustomArrayList class.
Ensure your implementation supports adding more than 10 elements. The backing array should dynamically resize by doubling its size whenever it is full.
4. Key Functionalities to Implement
Adding Elements:
If the backing array is full, create a new array with double the size and copy existing elements to the new array.
Retrieving Elements:
Implement a method to fetch an element at a specific index.
Getting Size:
Return the number of elements currently stored in the list.
5. Testing
Use the CustomListApplication class to test your implementation.
Example test:
java
Copy code
CustomList<String> myCustomList = new CustomArrayList<>();
myCustomList.add("element 1");
myCustomList.add("element 2");
myCustomList.add("element 3");

for (int i = 0; i < myCustomList.getSize(); i++) {
    System.out.println(myCustomList.get(i));
}
6. Validation
Add more than 10 elements to your CustomList to ensure the resizing logic works as expected.
Validate that all elements remain accessible after resizing.
Expected Behavior
When the backing array is full, it should grow by doubling its size.
Elements should be retrievable in the order they were added.
The size of the list should correctly reflect the number of elements.
Example Output
plaintext
Copy code
element 1
element 2
element 3
...
element 11
Skills Gained
Algorithm Design: Developing a dynamic resizing mechanism for arrays.
Interface Implementation: Translating abstract definitions into concrete methods.
Testing: Validating the correctness of your implementation with test cases.
Version Control: Using GitHub for managing and tracking changes.
Tips and Recommendations
Avoid looking at Java’s ArrayList source code; focus on creating your unique implementation.
Make use of comments in your code to explain your logic for resizing and element management.
Consider edge cases like accessing elements at invalid indices or adding null values.
With this assignment, you’ll gain hands-on experience building and understanding a fundamental data structure used in Java development!
 
