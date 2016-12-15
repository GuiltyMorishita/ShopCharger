import java.util.*;

public class MainShopCharger {
  private StudentCard insertedStudentCard;

  public void insertStudentCard(StudentCard studentCard) {
    this.insertedStudentCard = studentCard;
	}

  public void chargeMoney(int chargeAmount) {
    int currentAmount = this.insertedStudentCard.getAccountBalance();
    int totalAmount = currentAmount + chargeAmount;
    this.insertedStudentCard.setAccountBalance(totalAmount);
	}

  public void printAccountBalance() {
    System.out.format("学生名\t: %s\n残高\t: %s\n",
                      insertedStudentCard.getStudentName(),
                      insertedStudentCard.getAccountBalance());
  }
}
