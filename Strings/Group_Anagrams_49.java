// Group Anagrams
// Given an array of strings strs, group the anagrams together. You can return the answer in any order.
// leetcode: https://leetcode.com/problems/group-anagrams/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Group_Anagrams_49{
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res=new ArrayList<>();
        HashMap<String , List<String>> map = new HashMap<>();
        for (String str : strs) {
            int freq[]=new int[26];
            for (int j = 0; j < str.length(); j++) {
                freq[str.charAt(j) - 'a']++;
            }
            String key = Arrays.toString(freq);
            if(!map.containsKey(key))
                map.put(key, new ArrayList<>());
            map.get(key).add(str);
        }  
        for(String s : map.keySet()){
            res.add(map.get(s));
        }
        return res;
    }
    // time : O(n × L)
    // space : O(n × L)
    public static List<List<String>> groupAnagrams1(String[] strs) {
        List<List<String>> res=new ArrayList<>();
        int count[]= new int[strs.length];
        if(strs.length==1){
            List<String> l=new ArrayList<>();
            l.add(strs[0]);
            res.add(l);
            return res;
        }
        for(int i=0;i< strs.length; i++){
            if(count[i]==1)
                continue;
            List<String> list=new ArrayList<>();
            list.add(strs[i]);
            int arr[]=new int[26];
            for(int k=0 ;k<strs[i].length(); k++){
                arr[strs[i].charAt(k)-'a']++;
            }
            for(int j=i+1; j<strs.length; j++){
                
                boolean found= true;
                if(count[j]==1)
                    continue;
                if(strs[i].length() != strs[j].length())
                    continue;
                int temp[]= arr.clone();
                for(int k=0 ;k<strs[j].length(); k++){
                    temp[strs[j].charAt(k)-'a']--;
                }
                for(int x=0; x<26; x++){
                    if(temp[x]!=0){
                        found=false;
                        break;
                    }
                        
                }
                if(found){
                    list.add(strs[j]);
                    count[j]=1;
                }
                    
            }
            res.add(list);
        } 
        return res;       
    }
    public static void main(String[] args) {
    String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
    System.out.println(groupAnagrams(strs));
    System.out.println(groupAnagrams1(strs));

    } 
}