package Objects;

import Assets.Mail.hotSingles;
import Assets.Mail.hiddenBenefits;
import Assets.Mail.nigreanPrince;
import Assets.Mail.reverseMortgage;
import Assets.Mail.vote4Me;

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
     new hotSingles().setVisible(true);
     new hiddenBenefits().setVisible(true);
     new nigreanPrince().setVisible(true);
     new reverseMortgage().setVisible(true);
     new vote4Me().setVisible(true);
    }

}
