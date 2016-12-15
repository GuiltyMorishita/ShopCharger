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
}
