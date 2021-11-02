package ucf.assignments;

/*
 * UCF COP3330 Fall 2021 Assignment 4 Solution
 * Copyright 2021 Luis Hernandez
 */

import java.util.ArrayList;

public class ExternalStorage {
    public void saveOne(ArrayList<Item> list) {
        /*
        * FileName : String = list + ".txt"
        * Create a FileWriter object and call the pathname "FileName"
        *   For the size of the list
        *       Add the item from the list into the FileWriter
        *   Close the FileWriter
        */
    }
    public void saveAll(ArrayList<Item> all) {
        /*
        * Create a FileWriter object and call the pathname "alllists.txt"
        *   For the size of the list
        *       Add the list and its items into the FileWriter
        *   Close the FileWriter
        */
    }
    public void loadSingle(ArrayList<Item> list) {
        /*
        * FileName : String = list + ".txt"
        * Create a File object with a pathname "FileName"
        */
    }
    //load multiple to-do lists from external storage
    public void loadMulti(ArrayList<Item> multi) {
        /*
        * Create a File object with a pathname "alllists.txt"
        */
    }
}
