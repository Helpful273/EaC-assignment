package Utils;
import Objects.*;

/**
 *
 * @author helpful
 */
public class Sort {
    /*
    @param optionEntries
    */
    public static void SortEntry(OptionEntry[] optionEntries) {
        int size = optionEntries.length;
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                OptionEntry currentEntry = optionEntries[j];
                OptionEntry comparatorEntry = optionEntries[j+1];
                
                if (currentEntry.GetOrderOfOperation() > comparatorEntry.GetOrderOfOperation()) {
                    optionEntries[j] = comparatorEntry;
                    optionEntries[j+1] = currentEntry;
                }
            } 
        }
    }
}
