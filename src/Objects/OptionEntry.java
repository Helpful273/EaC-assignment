package Objects;

/**
 *
 * @author Helpful
 */
public class OptionEntry {
    private final String name;
    private final double uxFactor, privacyFactor;
    private final String uxOperation, privacyOperation;
    
    /*
    Constructor for ScoreImpact object.
    @param name An option entry
    @param uxFactor The factor in which it affects the calculation of user experience score.
    @param privacyFactor The factor in which it affects the calculation of privacy score.
    @param uxOperation The operation to calculate the user experience score with.
    @param privacyOperation The operation to calculate the privacy score with.
    */
    public OptionEntry(String name, double uxFactor, double privacyFactor, String uxOperation, String privacyOperation) {
        this.name = name;
        this.uxFactor = uxFactor;
        this.privacyFactor = privacyFactor;
        this.uxOperation = uxOperation;
        this.privacyOperation = privacyOperation;
    }
    public OptionEntry(String name, double uxFactor, double privacyFactor, String Operator) {
        this.name = name;
        this.uxFactor = uxFactor;
        this.privacyFactor = privacyFactor;
        this.uxOperation =  Operator;
        this.privacyOperation = Operator;
    }
    
    /*
    Calculates the new user experience score.
    @param score The previous score.
    @return double The new score.
    */
    public double CalculateUXScore(double score) {
        double factor = this.uxFactor;
        
        switch (this.uxOperation) {
            case "Multiplication":
                return score * factor;
            case "Divison":
                return score / factor;
            case "Addition":
                return score + factor;
            case "Subtraction":
                return score - factor;
        }
        
        return score;
    }
    
    /*
    Calculates the new privacy score given.
    @param score The previous score.
    @return double The new score.
    */
    public double CalculatePrivacyScore(double score) {
        double factor = this.privacyFactor;
        
        switch (this.privacyOperation) {
            case "Multiplication":
                return score * factor;
            case "Divison":
                return score / factor;
            case "Addition":
                return score + factor;
            case "Subtraction":
                return score - factor;
        }
        
        return score;
    }
    
    /*
    Gets the number order of said operation.
    @return int The order in which operations should be done.
    */
    public int GetOrderOfOperation() {
        switch (this.privacyOperation) {
            case "Multiplication":
                return 2;
            case "Divison":
                return 2;
            case "Addition":
                return 1;
            case "Subtraction":
                return 1;
        } 
        
        return 0;
    }
    
    /*
    Fetch our OptionEntry object name
    @return String The name of our entry.
    */
    public String GetName() {
        return this.name;
    }
}
