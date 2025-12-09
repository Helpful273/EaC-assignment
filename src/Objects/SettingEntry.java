package Objects;

import java.util.HashMap;

/**
 *
 * @author helpful
 */
public class SettingEntry {
    private HashMap<String, Option> options = new HashMap<>();
    private Option selectedOption;
    private String name;
    
    /*
    Constructor for a SettingEntry object.
    @param name The setting's name.
    @param options The varargs for default options
    */
    public SettingEntry(String name, Option... options) {
        this.name = name;
        this.selectedOption = options[0];
        
        for (Option option: options) {
            this.options.put(option.GetOptionName(), option);
        }
    }
    
    public void AddOption(Option option) {
        this.options.put(option.GetOptionName(), option);
    }
    
    public void SelectOption(String optionKey) {
        if (this.options.containsKey(optionKey)) {
            this.selectedOption = this.options.get(optionKey);
        } else {
            System.out.println(String.format("Key: \"%s\" does not exist within options. Option remains the same.", optionKey));
        }
    }
    
    public Option GetSelectedOption() {
        return this.selectedOption;
    }
    
    public String GetName() {
        return this.name;
    }
}
