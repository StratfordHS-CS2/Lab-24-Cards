[![Build Status](https://travis-ci.com/StratfordHS-CS2/lab-24-cards-username.svg)](https://travis-ci.com/StratfordHS-CS2/lab-24-cards-username)

# Lab 24 - Cards

## Lab Goal
You will be using object oriented programming to make two classes: a Card class and a Deck class.  You will be making a deck of cards that could be used in card games.

## Instructions
* In the `Card` class:
  - Edit the default constructor so it sets default values for the instance variables.  The default value for `suit` is `' '`, and the default value for `rank` is `""`.
  - Edit the second constructor to set the values of `suit` and `rank` accordingly.
  - Add a getter and setter for each of `suit` and `rank`.
  - Edit the `toString` method to return a String representation of a Card.  For example, the 2 of Hearts should be "2H".

* In the `Deck` class:
  - Edit the constructor to create one of each type of card in a standard deck and add it to the ArrayList containing the deck.
  - Complete the `shuffle` method so it randomly shuffles the deck.  See the algorithm in the code comments.
  - Complete the `toString` method to return the deck as a String.  Example: "2H 4S QS ..."

* Complete all javadoc comments with the proper tags.

## Notes
* The Checkstyle config url is http://www.daveavis.com/cs/checkstyle_SHS.xml
* Make sure you modify the link at the top of your **Readme.md** to reflect your username if you want the badge at the top to represent the status of your code.

## Grading
* 10 - default Card constructor
* 10 - second Card constructor
* 10 - Card.setRank()
* 10 - Card.setSuit()
* 10 - Card.toString()
* 15 - Deck constructor
* 15 - Deck.shuffle()
* 10 - Deck.toString()
* 10 - style

Note that these are potential maximums; the computer can only check so much.  If your code passes Checkstyle, but I see non-descriptive variable names, then your style grade will go down.  If your code passes all tests, but I see code that was copied off of the internet or from another student your grade will go *way* down.
