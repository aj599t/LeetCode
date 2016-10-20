package edu.usc.mycode;

import java.util.*;
import java.util.Map.*;

public class LeetCode {

	public static void main(String[] args) {
		LeetCode a = new LeetCode();
		/*char a1 = a.findTheDifference("abcd", "abcde");
		System.out.println(a1);
		
		//Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
		//For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
		int nums[] = {0, 1, 0, 3, 12};
		a.moveZeroes(nums);*/
		
		//System.out.println(a.canConstruct("aa", "ab"));
		int a1[] = {1,2,2,1,1};
//		int b1[] = {2,2};
//		
//		int c[] = a.intersection(a1,b1);
		
		//a.longestPalindrome("aaasssddd");
		//a.titleToNumber("A");
		//System.out.println(a.isAnagram("abc", "aba"));
		System.out.println(a.majorityElement(a1));
		
		

	}
	
	public char findTheDifference(String s, String t) {
        
		Map<Character, Integer> m = new LinkedHashMap<Character, Integer>(); 
		
		for(int i=0;i<t.length();i++){
        	m.put(t.charAt(i), 1);        	
        }
		
        for(int i=0;i<s.length();i++){
        		m.put(s.charAt(i), 0);
        	
        }
        char result ='N';
        for (Map.Entry<Character, Integer> i : m.entrySet()) {
        	Character key = i.getKey();
		    Integer value = i.getValue();
          	if(value == 1)
          		result = key;
        	  
        }
        
        return result;
    }
	
	public void moveZeroes(int[] nums) {
		
		int count =0;
		for(int i=0;i<nums.length;i++){
			if(nums[i]!=0){
				nums[count]=nums[i];
				count ++;
			}
		}
		
		for(int i=count;i<nums.length;i++){
			nums[i]=0;
		}
        
    }	
	
	public boolean canConstruct(String ransomNote, String magazine) {
    
		
		int[] table = new int[128];
	    for (char c : magazine.toCharArray())   table[c]++;
	    for (char c : ransomNote.toCharArray())
	        if (--table[c] < 0) return false;
	    return true;
		
		
    }
	
	public void deleteNode(ListNode t) {
		
		t.val = t.next.val;
		t.next = t.next.next;
        
    }
	
	public int[] intersection(int[] nums1, int[] nums2) {
		
		Set s1 = new LinkedHashSet();
		Set s2 = new LinkedHashSet();
		List l = new ArrayList();
		boolean flag1 = false;
		for(int i=0;i<nums1.length;i++){
			s1.add(nums1[i]);
		}
		
		for(int i=0;i<nums2.length;i++){
			flag1 = s2.add(nums2[i]);
			if(flag1){
				if(s1.contains(nums2[i])){
					System.out.println(nums2[i]);
					l.add(nums2[i]);
					
				}
					
			}
		}
		int a[] = new int[l.size()];
		for(int i=0;i<l.size();i++)
			a[i] = (int)l.get(i);
		return a;
    }
	
	public int longestPalindrome(String s) {
		
		if(s.length() == 1)
			return 1;
		
		if(s == null || s.length() == 0)
			return 0;
		
		Map <Integer, Integer> set = new LinkedHashMap<Integer, Integer>();
		for(int i=0;i<s.length();i++){
			if(set.containsKey((int)s.charAt(i)))				
				set.put((int)s.charAt(i), (int)set.get((int)s.charAt(i))+1);
			else
				set.put((int)s.charAt(i),1);
		}
		
		int count = 0;
		int c = 0;
		
		for (Map.Entry<Integer, Integer> i : set.entrySet()) {
			
		    Integer v = i.getValue();
		    
          	count += (v - v%2);
          	if(v%2 == 1){
          		c=1;
          	}
        	  
        }
		
		if(c>0){
			System.out.println(count+c);
			return (count+c);
		}
		else{
			System.out.println(count);
			return (count);
		}
	
    }
	
	public int titleToNumber(String s) {
		
		int value = 0;
		for(int i=0,j=(s.length()-1); j>=0 && i<s.length(); i++,j--){
				value+= Math.pow(26, i)*((int)s.charAt(j) - 64);
			
		}
		System.out.println(value);
		return value;
        
    }
	public boolean isAnagram(String s, String t) {
		if(s.length() != t.length())
			return false;
		
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		for(int i=0;i<s.length();i++){
			if(m.containsKey((int)s.charAt(i)))				
				m.put((int)s.charAt(i), (int)m.get((int)s.charAt(i))+1);
			else
				m.put((int)s.charAt(i),1);
		}
		
		for(int i=0;i<t.length();i++){
			if(m.containsKey((int)t.charAt(i)))				
				m.put((int)t.charAt(i), (int)m.get((int)t.charAt(i))-1);
			else
				return false;
		}
		
		for (Map.Entry<Integer, Integer> i : m.entrySet()) {
			 Integer v = i.getValue();
			 if(v<0)
				 return false;	
		}
		
		return true;
		
        
    }
	
	public int majorityElement(int[] nums) {
		
		Map <Integer, Integer>m = new HashMap<Integer, Integer>();
		int max=nums[0];
		for(int i=0;i<nums.length;i++){
			if(m.containsKey(nums[i])){				
				m.put(nums[i], m.get(nums[i])+1);
				if(m.get(max) < m.get(nums[i]))
					max = nums[i];
			}
			else
				m.put(nums[i],1);
			
		}
		
		return max;
        
    }
	
	public boolean containsDuplicate(int[] nums) {
		
		if(nums.length == 0)
			return false;
		Set m = new HashSet();
		
		for(int i=0;i<nums.length;i++){
			
			if(! m.add(nums[i]))
				return true;
		}
		return false;
    }
	
	/*public int romanToInt(String s) {
		
			
        
    }*/
	
}
	


class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
}
