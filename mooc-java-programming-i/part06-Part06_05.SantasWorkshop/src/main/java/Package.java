
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author robta
 */
public class Package {

    private ArrayList<Gift> listOfGifts;

    public Package() {
        this.listOfGifts = new ArrayList();
    }

    public void addGift(Gift gift) {
        listOfGifts.add(gift);
    }

    public int totalWeight() {
        int totalWeightOfGifts = 0;
        for (Gift gift : listOfGifts) {
            totalWeightOfGifts += gift.getWeight();
        }
        return totalWeightOfGifts;
    }
}
