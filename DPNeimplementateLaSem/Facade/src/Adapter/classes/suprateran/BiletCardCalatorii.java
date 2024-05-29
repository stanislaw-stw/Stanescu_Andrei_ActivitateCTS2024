package Adapter.classes.suprateran;

public class BiletCardCalatorii extends CardSTB {
    private double soldCard;
    private static double pretCalatorie = 3.2;

    public BiletCardCalatorii(String numeClient, String cnpClient, double soldCard) {
        super(numeClient, cnpClient);
        this.soldCard = soldCard;
    }

    @Override
    public void validareCalatorie() {
        if (soldCard > pretCalatorie) {
            System.out.println("Calatorie placuta!!");
            soldCard -= pretCalatorie;
        } else {
            System.out.println("Fonduri insuficiente!!");
        }
    }
}
