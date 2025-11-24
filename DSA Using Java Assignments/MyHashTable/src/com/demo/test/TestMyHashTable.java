package com.demo.test;
import com.demo.hashing.*;
public class TestMyHashTable {
      public static void main(String args[]) {
    	  
    	MyHashTable ht = new MyHashTable(5);  
    	  ht.insertData(14);
    	  ht.insertData(73);
    	  ht.insertData(73);
    	  ht.insertData(45);
    	  ht.insertData(89);
    	  ht.insertData(23);
    	  ht.insertData(29);
    	  ht.insertData(31);
    	  ht.insertData(67);
    	  ht.insertData(33);
    	  ht.insertData(56);
    	  ht.insertData(77);
    	  ht.displayHashTable();
    }   
}
