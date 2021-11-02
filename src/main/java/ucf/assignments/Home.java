package ucf.assignments;

/*
 * UCF COP3330 Fall 2021 Assignment 4 Solution
 * Copyright 2021 Luis Hernandez
 */

public class Home {
    public void display() {
        /*
        * Map 'list ': String, Item
        * choice : int, initialized to zero
        * While the choice does not equal 0 and is greater than or equal to 14
        *   If choice equals one
        *       Prompt the user what title they would like to give the to-do list
        *       Put the title into the Map
        *   Else if choice equals two
        *       Prompt the user which to-do list they would like to delete
        *       If the to-do is not in the Map, tell the user
        *       Else, delete the list
        *   Else if the choice is three
        *       Prompt the user which list they would like to edit the title of
        *       If the list doesn't exist, tell the user
        *       Else, prompt the user for the new title
        *       Replace the old title with the new title
        *   Else if the choice is four
        *       Prompt the user for the contents of the item and for the list they want the item to go into
        *       If the list doesn't exist, tell the user,
        *       Else,
        *           If the description is empty, tell the user.
        *           Else, set the description using the setDesc() method
        *           If the due date doesn't follow the YYYY-MM-DD format, tell the user.
        *           Else, set the due date using hte setDueDate() method
        *           Set the completion status as false
        *           Add the item to the Map using the title the user inputted as the key
        *   Else if the choice is five
        *       Prompt the user for which item they would like to change the description of
        *       If the item does not exist, tell the user.
        *       Else,
        *           If the new description is empty, tell the user.
        *           Else, set the new description using the setDescription() method
        *   Else if the choice is six
        *       Prompt the user for which item they would like to change the due date of
        *       If the due date is empty or doesn't follow YYYY-MM-DD format, tell the user
        *       Else, set the new due date with the setDueDate() method
        *   Else if the choice is six
        *       Prompt the user which item they would like to mark complete
        *       If the item doesn't exist, tell the user.
        *       Else, set the item as complete through the setComp() method
        *   Else if the choice is seven
        *       Prompt the user which list they would like to print
        *       If the list doesn't exist, tell the user.
        *       Else, call the printAll() method and send the title as the argument
        *   Else if the choice is eight
        *       Prompt the user which list they would like to use
        *       If the list doesn't exist, tell the user.
        *       Else, call the printComplete() method and send the title as the argument
        *   Else if the choice is nine
        *       Prompt the user which list they would like to use
        *       If the list doesn't exist, tell the user.
        *       Else, call the printIncomplete() method and send the title as the argument
        *   Else if the choice is ten
        *       Prompt the user for which list they would like to save to external storage
        *       If the list doesn't exist, tell the user.
        *       Else, call the saveOne() method and send the title as an argument
        *   Else if the choice is eleven
        *       If the list map is empty, tell the user.
        *       Else, call the saveAll() method and bring the whole list as an argument
        *   Else if the choice is twelve
        *       Prompt the user for the title of the list they would like to load
        *       If the list doesn't exist, tell the user.
        *       Else, call the loadSingle() method and bring the title as the argument
        *   Else if the choice is thirteen
        *       If the list is empty, tell the user.
        *       Else, call the loadMulti() method and bring the map as the argument
        *   Else if the choice is fourteen
        *       This option is for the extermination of the program. Nothing to do
         */
    }
}
