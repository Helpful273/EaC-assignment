/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;
import java.util.HashMap;

/**
 *
 * @author Terrence
 */
public class App {
    private String name;
    private HashMap<String, Option> options =  new HashMap<>();
    /*
    The Constructor for the app
    @param name the name of the app
    @param privacySettings is an array of Options
    */
    public App(String name, Option... privacySettings){
        this.name = name;
        for (Option option : privacySettings){
            this.options.put(option.GetName(),option);
        }
    }
    /*
    Gets the name of the app
    @return name returns the name of the app
    */
    public String GetAppName(){
    return this.name;
    }
    /*
    gets the specific privacy setting
    @param key the key for the hashmap
    @return returns whatever the key was associated to with the hashmap
    */
    public Option GetPrivacySetting(String key){
        return this.options.get(key);
    }
    /*
    gets the total privacy score by looping through the array of options
    @return returns the sum of all of the Privacy scores in the hashmap
    */
    public double GetTotalPrivacyScore(){
        double score = 0.0;
        for (Option option: options.values()){
            //gets the option from the options hashmap. Then gets the option entry from the option that we have and runs Calc Privacy Score on that SettingEntry
            score += option.GetSelectedEntry().CalculatePrivacyScore(1);
        }
        return score;
    }
    /*
    gets the total UX score by looping through the array of options
    @return returns the sum of all of the UX scores in the hashmap
    */
    public double GetTotalUXScore(){
        double score  = 0.0;
        for (Option option: this.options.values()){
            score += option.GetSelectedEntry().CalculateUXScore(1);
            
        }
        return score;
    }
        
    
}