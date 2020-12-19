package code._4_student_effort.firstchallenge;

public class TestCurrency {

    public static void main(String[] args) throws CurrencyException {
        ExchangeDesk exchengeDesk = new ExchangeDesk();
        Ron lei = new Ron();
        lei.setAmountOfMoney(1000d);
        Dollar dollar = exchengeDesk.convert(lei, Dollar.class, 4.1d);
        System.out.println(dollar.getAmountOfMoney());
    }
}
