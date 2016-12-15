import java.util.*;

public class StudentCard {
	private String studentNumber;
	private String studentName;
	private int accountBalance;

  public StudentCard(String number, String name) {
    this.studentNumber = number;
    this.studentName = name;
    this.accountBalance = 0;
  }

  public void setAccountBalance(int balance) {
    this.accountBalance = balance;
  }

  public int getAccountBalance() {
    return this.accountBalance;
  }

  public static void main(String[] args) {
    StudentCard card = new StudentCard("m133383", "森下");
    System.out.println(card.getAccountBalance());
    card.setAccountBalance(1000);
    System.out.println(card.getAccountBalance());
	}
}
