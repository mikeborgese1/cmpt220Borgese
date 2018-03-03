import java.util.Date;

public class Account {
	



	    private String namea;
	    private int ida;
	    private double balancea;
	    private double annualInterestRatea; // AnnualInterestRate is percentage.
	    private Date dateCreateda;
	    


	    public Account() {
	        dateCreateda = new Date();
	       
	    }

	    public Account(int id, double balance) {
	        this();
	        ida = id;
	        balancea = balance;
	    }

	    public Account(String name, int id, double balance) {
	        this(id, balance);
	        namea = name;

	    }

	    public int getId() {
	        return ida;
	    }

	    public void setId(int id) {
	        ida = id;
	    }

	    public double getBalance() {
	        return balancea;
	    }

	    public void setBalance(double balance) {
	        balancea = balance;
	    }

	    public double getAnnualInterestRate() {
	        return annualInterestRatea;
	    }

	    public void setAnnualInterestRate(double annualInterestRate) {
	    	annualInterestRatea = annualInterestRate;
	    }

	    public Date getDateCreated() {
	        return dateCreateda;
	    }

	    public double getMonthlyInterestRate() {
	        return balancea * (annualInterestRatea / 12) / 100;
	    }

	    public void withdraw(double amount) {
	        balancea -= amount;
	    }

	    public void deposit(double amount) {
	        balancea += amount;
	    }

	   

	}

