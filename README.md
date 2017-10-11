# MyFirstApp
I don't know what task this is supposed to solve, but it sure does whatever it does. 

Just going through the training section on the android developer site and implementing things as I read about them. 

Presently, the app:
-Opens to an activity with a textbox and a button. 
-Pressing the button loads a new activity, passing the entered message in an intent.
-The new activity creates a fragment that contains a textbox on the top and a button on the bottom, and then gives the message from the first activity to the new fragment, which then displays it. 
-Pressing the button replaces the fragment with another fragment, and adds the original fragment to the stack. This is handled by the activity. 
-the new fragment uses an onClick listener to populate its viewtext with the message from the original activity. 
