import java.util.*;

public class MainShopCharger {
  private StudentCard insertedStudentCard;

  public void insertStudentCard(StudentCard studentCard) {
    this.insertedStudentCard = studentCard;
	}

  public void chargeMoney(int chargeAmount) {
    if (this.insertedStudentCard != null) {
      int currentAmount = this.insertedStudentCard.getAccountBalance();
      int totalAmount = currentAmount + chargeAmount;
      this.insertedStudentCard.setAccountBalance(totalAmount);
    }
	}

  public void printAccountBalance() {
    if (this.insertedStudentCard != null) {
      System.out.format("学生名\t: %s\n残高\t: %s\n",
                        insertedStudentCard.getStudentName(),
                        insertedStudentCard.getAccountBalance());
    }
  }

  public static void main(String[] args) {
    MainShopCharger charger = new MainShopCharger();
    StudentCard card = new StudentCard("m133383", "森下");
    charger.chargeMoney(1000);
    charger.printAccountBalance();
	}
}
