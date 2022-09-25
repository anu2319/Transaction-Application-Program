public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Id"+" "+ "Amount"+" "+"Date"+" "+"Month"+" "+"Year");
        Transaction transaction1 = new Transaction(500,23,03,2002);
        Transaction transaction2 = new Transaction(-200,24,04,2002);
        Transaction transaction3 = new Transaction(-100,25,04,2002);
        Transaction transaction4 = new Transaction(100,26,05,2002);

        System.out.println("Savings : " + Transaction.getCredited_amount());
        System.out.println("Expenditure : " + Math.abs(Transaction.getDebited_amount()));
        System.out.println("Net Total : " + Transaction.getNet_total());



    }

}
