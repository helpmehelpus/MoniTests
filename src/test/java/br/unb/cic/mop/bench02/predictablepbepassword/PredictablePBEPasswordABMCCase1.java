package br.unb.cic.mop.bench02.predictablepbepassword;

public class PredictablePBEPasswordABMCCase1 {
    public static void main(String [] args){
        PredictablePBEPasswordABMC1 ckp = new PredictablePBEPasswordABMC1();
        String password = "sagar";
        ckp.key(password);
    }
}
