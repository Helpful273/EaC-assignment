/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;
import java.util.HashMap;
import java.util.ArrayList;
import Utils.*;

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
        OptionEntry [] optionEntries = new OptionEntry[this.options.size()];
        double score = 0.0;
        int counter = 0;
        for (Option option: options.values()){
            optionEntries[counter] = option.GetSelectedEntry();
            counter ++;
        }
        Sort.SortEntry(optionEntries);
        for (int i =  0 ; i < optionEntries.length; i++){
            score = optionEntries[i].CalculatePrivacyScore(score);
        }
        return score;
    }
    
    
    public double GetTotalUXScore(){
        OptionEntry [] optionEntries = new OptionEntry[this.options.size()];
        double score  = 0.0;
        int counter = 0;
        for (Option option: this.options.values()){
            optionEntries[counter] = option.GetSelectedEntry();
            counter ++;
            
        }
        Sort.SortEntry(optionEntries);
        for (int i =  0 ; i < optionEntries.length; i++){
            score = optionEntries[i].CalculateUXScore(score);
        }
        return score;
    }
    
}