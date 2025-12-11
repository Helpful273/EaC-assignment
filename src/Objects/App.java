/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;
import java.util.HashMap;

/**
 *
 * @author 344179247
 */
public class App {
    private String name;
    private HashMap<String, Option> options =  new HashMap<>();
    
    public App(String name, Option... privacySettings){
        this.name = name;
        for (Option option : privacySettings){
            this.options.put(option.GetName(),option);
        }
    }
    
    public String GetAppName(){
    return name;
    }
    
    public Option GetPrivacySetting(String key){
        return this.options.get(key);
    }
    public double GetTotalPrivacyScore(){
        for (Option option: options.values()){
            option.GetSelectedEntry();
        }
    }
    public Option GetTotalUXScore(){
        for (Option option: this.options.values()){
            return option;
        }
        return null;
    }
        
    
}