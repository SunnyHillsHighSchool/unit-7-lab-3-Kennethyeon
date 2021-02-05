//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Kenneth Yeon 

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ArrayListFunHouse
{
 public static ArrayList<Integer> getListOfFactors(int number)
 {
   //create an arraylist called factorlist
   ArrayList<Integer> factorList = new ArrayList<Integer>();
   //use a for loop to loop through numbers starting from 2 to the parameter number
   for (int i = 2; i < number; i++)
   {
     //if the remainder of dividing the parameter number by the current value of the loop is zero add that value to factorList
     if (number%i ==0)
     {
       factorList.add(i);
     }
    //end for loop
   }
  //return factorList
  return factorList;
 }
 
 public static void keepOnlyCompositeNumbers( List<Integer> nums )
 {
   //use a for loop to loop through each number in the given arrayList backwards(nums)
   for (int i = nums.size() - 1; i >=0; i--)
   {
     //create arraylist called copy
     ArrayList<Integer> copy = new ArrayList<Integer>();
     //run getListOfFactors method and set it equal to copy
     copy = ArrayListFunHouse.getListOfFactors(nums.get(i));
     //if the size of copy is < 1 remove the number from nums
     if (copy.size() < 1)
     {
       nums.remove(i);
     }
   }
 }
}