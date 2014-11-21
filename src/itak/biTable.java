package itak;

import java.util.HashMap;

import javax.swing.text.html.HTMLDocument.Iterator;

class biTable {
    
    HashMap<String, String> table1;
    HashMap<String, String> table2;
    public biTable() {
        table1 = new HashMap<>();
        table2 = new HashMap<>();
    }
    
    public void put(String key, String value) {
        table1.put(key, value);
        table2.put(value, key);
    }
    
    public String getVal(String key) {
        return table1.get(key);
    }
    
    public String getInverseVal(String value) {
        return table2.get(value);
    }
    
    public String printAll() {
        java.util.Iterator<String> iter = table2.values().iterator();
        StringBuilder hi = new StringBuilder();
        while (iter.hasNext()) {
            hi.append(iter.next());
            hi.append("\n");
        }
        return hi.toString();
    }
}