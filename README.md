# StrategyPattern

Strategy pattern<br/>
Write a program that converts text comb to secret writing, and this secret writing as well
to translate it back into plain text. The user should be able to choose which secret code to use.
he or she wants to use:
- Caesar's number: this secret is named after Julius Caesar, who used it to
to communicate with his field lords. The encryption works by every letter of the
replace plain text with a letter that appears a few places further down the alphabet
...is preventing it from happening. A circular alphabet is considered, which means that after the letter
"z" again follows the letter "a". Only letters are replaced, numbers and special
characters don't. Everything is converted to lowercase. The text "this is very secret!"
becomes "afq fp wbbo dbebfj".
- Reflection: the full sentence is reversed. The text "this is very secret!" becomes
so "mieheg reez si tid".
Later on there may be other secrets.
The programme must allow for this:
- to choose a secret code,
- choose whether you want to encode or decrypt
- text and then show the (de)coded version.<br/><br/>

In UI:<br/>
First choose which secret code to use.
Choose whether to encode or decode.

## JavaFX command
<pr>Design a JavaFX interface for the secret application:<br/>
Provide on the screen:
- a text field to type in the text to be encoded/decoded
- a text field (not editable) showing the result of coding/decoding
- a combo box showing the names of the different coding algorithms
- two buttons with text encoding and decoding.</br></pr>
<pr>On http://docs.oracle.com/javafx/2/ui_controls/combo-box.html you can find information about
the javaFX combobox.<br/>
Write simple JavaFX code without using the scene builder or FMXL!<br/><br/></pr>
<pr>Possible expansion:
Think of your own (simple) secret writing algorithm and add it to your application.</pr>

