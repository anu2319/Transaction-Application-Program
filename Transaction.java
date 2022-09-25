import java.util.HashMap;



public class Transaction
{
    static int id = 0;
    int amount;
    int[] date = new int[3];
    static int net_total = 0;
    static int credited_amount;
    static int debited_amount;

    public static int getCredited_amount()
    {
        return credited_amount;
    }

    public static int getDebited_amount()
    {
        return debited_amount;
    }

    public static int getNet_total()
    {
        return net_total;
    }

    static HashMap<Integer, Transaction> transactionObj = new HashMap<>();

    public Transaction(int amount, int day, int month, int year)
    {
        ++id;
        this.amount = amount;
        date[0] = day;
        date[1] = month;
        date[2] = year;
        transactionObj.put(id,this);
        transactCalculation(amount);
        displayTransaction();
    }

    // calculate credited and debited and netTotal amount
    public static void transactCalculation(int amount)
    {
        if(amount > 0)
        {
            credited_amount = credited_amount + amount;
        }
        else if(amount < 0)
        {
            debited_amount = debited_amount + amount;
        }
        net_total = net_total + amount;
    }

    // display transaction details with the given transactionId
    public static  void displayTransaction()
    {
            Transaction temp = transactionObj.get(id);
            System.out.print(id+"\t"+temp.amount+"\t"+temp.date[0]+"\t"+temp.date[1]+"\t"+temp.date[2]);
            System.out.println();
    }


}
