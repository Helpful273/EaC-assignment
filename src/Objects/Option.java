package Objects;

/**
 *
 * @author Helpful
 */
public class Option {
    private String name;
    private double uxFactor, privacyFactor;
    private String uxOperation, privacyOperation;
    
    /*
    Constructor for ScoreImpact object.
    @param uxFactor The factor in which it affects the calculation of user experience score.
    @param privacyFactor The factor in which it affects the calculation of privacy score.
    @param uxOperation The operation to calculate the user experience score with.
    @param privacyOperation The operation to calculate the privacy score with.
    */
    public Option(String name, double uxFactor, double privacyFactor, String uxOperation, String privacyOperation) {
        this.name = name;
        this.uxFactor = uxFactor;
        this.privacyFactor = privacyFactor;
        this.uxOperation = uxOperation;
        this.privacyOperation = privacyOperation;
    }
    
    /*
    Calculates the user experience score based off a preexisting
    */
    public double CalculateUXScore() {
        double finalUXScore = 0;
        return finalUXScore;
    }
    
    public double CalculatePrivacyScore() {
        double finalPrivacyScore = 0;
        return finalPrivacyScore;
    }
    
    public String GetOptionName() {
        return this.name;
    }
}
