package week4.day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		
		
int []numbers= {4,6,7,2,3,1,9,10,8,8,6};
//sort the numbers
Arrays.sort(numbers);

//get the length
int length=numbers.length;
//Use set to remove the duplicates=
Set<Integer> obj=new TreeSet<Integer>();
//iterate through the loop
for(int i=0;i<length;i++)
{
	//add all the numbers from the iteration
	obj.add(numbers[i]);
	}
//use for each loop
for (Integer each : obj) {
	obj.add(each);
}
//use list to get the index 
List<Integer> num1 = new ArrayList<Integer>(obj);
//iterate through the for loop with the next element
for (int i = 0; i < num1.size(); i++) {
	//if condition doesnot match
	if(num1.get(i)+1!=num1.get(i+1)){
		System.out.println(num1.get(i)+1);
		break;
	}
}
//System.out.println(obj);

}}
