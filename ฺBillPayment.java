class BillPayment {
    private String bill_type ;
    private int bill_lastUnit;
    private int bill_currentUnit;
    private double bill_result;

    public BillPayment(String type,int lastUnit){
        this.bill_type = type;
        this.bill_lastUnit = lastUnit;
    }

    public int getBill_currentUnit(){
        return this.bill_currentUnit;
    }

    public void setBill_currentUnit(int lastUnit){
        if(lastUnit < bill_currentUnit){
            return;
        } else {
            System.out.println("Please Insert a correct Unit.");
        }
    }

    public int calculateUnit(){
        return this.bill_currentUnit - this.bill_lastUnit;
    }

    public double calculateBill(){
        if (this.bill_type == "Water") {
            this.bill_result = calculateUnit()*5;
        } else if (this.bill_type == "Electric"){
            this.bill_result = calculateUnit()*6;
        }
        return this.bill_result;
    }

    public void displayBill(){
        System.out.println("My payment bill is : " + this.bill_type + "\n" + "The result is : " + this.calculateBill());
    }
}