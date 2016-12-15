import java.util.*;

public class StudentCard {
	private String studentNumber;
	private String studentName;
	private int accountBalance;
  private static ArrayList<StudentCard> studentCardList_ = new ArrayList<StudentCard>();

  public StudentCard(String number, String name) {
    this.studentNumber = number;
    this.studentName = name;
    this.accountBalance = 0;
    studentCardList_.add(this);
  }

  public void setAccountBalance(int balance) {
    this.accountBalance = balance;
  }

  public int getAccountBalance() {
    return this.accountBalance;
  }

  public static void main(String[] args) {
    StudentCard card1 = new StudentCard("m133383", "森下");
    card1.setAccountBalance(1000);
    StudentCard card2 = new StudentCard("m133384", "下森");
    card2.setAccountBalance(2000);

    for (StudentCard c : StudentCard.studentCardList_) {
      System.out.println(c.getAccountBalance());
    }
	}
}
