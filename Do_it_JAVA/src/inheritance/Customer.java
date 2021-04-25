package inheritance;

public class Customer { // extends Object 라고 되어있다고 보면 됨
    protected int customerID;
    protected String customerName;
    protected String customerGrade; // protected 로 하면 상속받은 클래스에서 사용 가능
    protected int bonusPoint;
    protected double bonusRatio; // default 는 같은 패키지 내에서 보임

//    public Customer(){
//        // super(); <- 안보이지만, 이게 호출 되는 것이다! 즉, Object(모든 클래스의 상위 클래스) 를 호출함.
//        customerGrade = "SILVER";
//        bonusRatio = 0.01;
//        System.out.println("Customer() 호출");
//    }

    public Customer(int customerID, String customerName) {
        this.customerID = customerID;
        this.customerName = customerName;
        customerGrade = "SILVER";
        bonusRatio = 0.01;

        System.out.println("Customer(int, String) 호출");
    }

    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;

        return price;
    }

    public String showCustomerInfo() {
        return customerName + " 님의 등급은 " + customerGrade + "이고, 보너스 포인트는 " + bonusPoint + " 입니다.";
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

    public void setBonusPoint(int bonusPoint) {
        this.bonusPoint = bonusPoint;
    }

    public double getBonusRatio() {
        return bonusRatio;
    }

    public void setBonusRatio(double bonusRatio) {
        this.bonusRatio = bonusRatio;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

}
