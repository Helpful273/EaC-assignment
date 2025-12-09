package Objects;

import java.util.HashMap;

/**
 *
 * @author helpful
 */
public class SettingEntry {
    private HashMap<String, Option> options = new HashMap<>();
    private String selectedOption;
    private String name;
    
    /*
    Constructor for a SettingEntry object.
    @param name The setting's name.
    @param options The varargs for default options
    */
    public SettingEntry(String name, Option... options) {
        this.name = name;
        
        for (Option option: options) {
            if (this.selectedOption == null)
                this.selectedOption = option.GetOptionName();
            
            this.options.put(option.GetOptionName(), option);
        }
    }
    
    /*
    Constructor for a SettingEntry object.
    @param name The setting's name.
    @param defaultOption The default option.
    @param options The varargs for default options
    */
    public SettingEntry(String name, String defaultOption, Option... options) {
        this(name, options);
        this.selectedOption = defaultOption;
    }
    
    public void AddOption(Option option) {
        this.options.put(option.GetOptionName(), option);
    }
}
