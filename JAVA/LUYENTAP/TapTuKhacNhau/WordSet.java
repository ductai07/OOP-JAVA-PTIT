package LUYENTAP.TapTuKhacNhau;

import java.util.Set;
import java.util.TreeSet;

public class WordSet {
    private String input;
    private Set<String> st;

    public WordSet(String input) {
        this.input=input;
        st = new TreeSet<>();
        String[] tokens = input.toLowerCase().split("\\s+");
        for(String token:tokens){
            st.add(token);
        }
    }
    public WordSet union(WordSet o) {
        WordSet result = new WordSet("");
        for(String val:this.st){
            result.st.add(val);
        }
        for(String val:o.st){
            result.st.add(val);
        }

        return result;
    }

    public WordSet intersection(WordSet o) {
        WordSet result = new WordSet("");
        for (String word : this.st) {
            if (o.st.contains(word)) {
                result.st.add(word);
            }
        }
        return result;
    }
    
    @Override
    public String toString() {
        return String.join(" ", st);
    }
}
