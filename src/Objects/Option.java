package Objects;

import java.util.HashMap;

/**
 *
 * @author helpful
 */
public class Option {
    private final HashMap<String, OptionEntry> entries = new HashMap<>();
    private final String name;
    private OptionEntry selectedEntry;
    
    /*
    Constructor for a SettingEntry object.
    @param name The setting's name.
    @param entries The varargs for default entries.
    */
    public Option(String name, OptionEntry... entries) {
        this.name = name;
        this.selectedEntry = entries[0];
        
        for (OptionEntry entry: entries) {
            this.entries.put(entry.GetName(), entry);
        }
    }
    
    /*
    Adds another OptionEntry to the options hashmap.
    @param entry The OptionEntry object to add.
    */
    public void AddEntry(OptionEntry entry) {
        this.entries.put(entry.GetName(), entry);
    }
    
    /*
    Selects an OptionEntry object based on their defined name.
    @param entryName The name to look for.
    */
    public void SelectEntry(String entryName) {
        if (this.entries.containsKey(entryName)) {
            this.selectedEntry = this.entries.get(entryName);
        } else {
            System.out.println(String.format("Key: \"%s\" does not exist within options. Option remains the same.", entryName));
        }
    }
    
    /*
    Fetch our current OptionEntry object
    @return OptionEntry
    */
    public OptionEntry GetSelectedEntry() {
        return this.selectedEntry;
    }
    
    /*
    Fetch our Option object name
    @return String The name of our option
    */
    public String GetName() {
        return this.name;
    }
}
