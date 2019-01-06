# TreatWell
Coding Challenge for TreatWell :

In the Source Folder , I have created two Classes: BuildBox and InvalidSizeException

1) BuildBox

- The task was to create a method of a given width(w) and height(h) and the output to draw a box of its size.
- There were several constraints of what I assumed the box may be
  - Different sizes are omitted
  - Negative sizes are omitted
  - Assumed that it only works for squared-shape boxes.
  
  - The class consists of two methods : checkSizes and buildBox
  - checkSizes : checks the constraints mentioned above and throws an IllegalSizeException when the user input is incorrect.
  - buildBox : builds the box using 2D String Array and a loop going through rows and columns in this case the width and height
             starting with the Top corners to Bottom Corners to Sides.
  
2) InvalidSizeException

- Which extends the Exception and has a constructor to determine the message.

In the Test Folder, I have created one Test Class : BuildBoxTest

1) BuildBoxText

- Majority of the test is created using a Exception Rule and several different methods to see what the user`s input is.
- There are three methods created to check User`s action on passing the test.
- The method whenBothSizesAreDifferent has the message "different" in it , so the user will know that inserting different size will pass the test and inserting different negative value will fail the test. Vice versa for whenBothSizesAreNegative
- whenBothSizesAreSame method is used as assertTrue(condition) to see if the test passes the height must match the width.




