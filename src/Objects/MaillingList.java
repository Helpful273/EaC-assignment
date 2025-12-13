package Objects;

import Assets.Mail.hotSingles;
import Assets.Mail.hiddenBenefits;
import Assets.Mail.nigreanPrince;
import Assets.Mail.vote4Me;
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author 343012951
 */
public class MaillingList extends Option {

    private String corpName;

    public MaillingList(String corpName, String name, OptionEntry... entries) {
        super(name, entries);
        this.corpName = corpName;
    }

    public void showMail() {
        Random rand = new Random();
        int randomNumber = rand.nextInt(4);
        if (randomNumber == 0) {
            new hotSingles().setVisible(true);
        }
        if (randomNumber == 1){
            new hiddenBenefits().setVisible(true);
        }
        if(randomNumber == 2)
        {
            new nigreanPrince().setVisible(true);
        }
        if (randomNumber==3) {
                new vote4Me().setVisible(true);
        }

    }

}
