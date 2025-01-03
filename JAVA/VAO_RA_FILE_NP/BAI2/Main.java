package VAO_RA_FILE_NP.BAI2;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.*;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        ObjectInputStream inp = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> a = (ArrayList<String>) inp.readObject();
        ArrayList<String> token = new ArrayList<>();
        
        for (String i : a)
        {
            String s = i.trim().replaceAll("\\s+", " ").toLowerCase();
            String tmp = "";
            for(int j = 0; j < s.length(); ++j)
            {
                if((s.charAt(j) < 'a' || s.charAt(j) > 'z') && (s.charAt(j) < '0' || s.charAt(j) > '9'))
                    tmp += ' ';
                else tmp += s.charAt(j);
            }
            tmp = tmp.trim().replaceAll("\\s+", " ");
            token.addAll(Arrays.asList(tmp.split(" ")));
        }
        
        TreeMap<String, Integer> mp = new TreeMap<>();
        for (String i : token)
        {
            if (mp.containsKey(i))
            {
                int tmp = mp.get(i);
                mp.replace(i, tmp + 1);
            }
            else
                mp.put(i, 1);
        }
        
        ArrayList<Word> words = new ArrayList<>();
        for (String i : mp.keySet())
            words.add(new Word(i, mp.get(i)));
        
        Collections.sort(words);
        
        for (Word i : words)
            System.out.println(i);
    }
}