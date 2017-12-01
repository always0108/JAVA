package sample;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {

    private double paneWidth = 600;
    private double paneHeight = 300;

    @Override
    public void start(Stage primaryStage) throws Exception{
        BorderPane pane = new BorderPane();
        TextArea taTable = new TextArea();
        pane.setCenter(new ScrollPane(taTable));

        TextField tfLoanAmount = new TextField();
        tfLoanAmount.setPrefColumnCount(7);
        TextField tfNumberOfYears = new TextField();
        tfNumberOfYears.setPrefColumnCount(2);
        Button btShowTable = new Button("Show Table");
        HBox hBox = new HBox(10);
        hBox.getChildren().addAll(new Label("Loan Amount"),
                tfLoanAmount, new Label("Number of Years"),
                tfNumberOfYears, btShowTable);
        hBox.setAlignment(Pos.CENTER);
        pane.setTop(hBox);

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, paneWidth, paneHeight);
        primaryStage.setTitle("Loan Tool"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage

        btShowTable.setOnAction(e -> {
            double loanAmount = Double.parseDouble(
                    tfLoanAmount.getText().trim());
            int numOfYears = Integer.parseInt(
                    tfNumberOfYears.getText().trim());
            Loan loan = new Loan();
            loan.setLoanAmount(loanAmount);
            loan.setNumberOfYears(numOfYears);

            taTable.setText("Interest Rate\tMonthly Payment\tTotal Payment\n");

            for (double rate = 5; rate <= 8; rate += 1 / 8.0) {
                loan.setAnnualInterestRate(rate);
                taTable.appendText(rate + "\t\t\t" +
                        (int)(loan.getMonthlyPayment() * 100) / 100.0 +
                        "\t\t\t" + (int)(loan.getTotalPayment() * 100) / 100.0 + "\n");
            }
        });
    }


    public static void main(String[] args) {
        launch(args);
    }
}

class Loan{
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate;

    public Loan(){
        this(2.5,1,1000);
    }
    public Loan(double annualInterestRate,int numberOfYears,double loanAmount){
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        loanDate = new java.util.Date();
    }

    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }

    public int getNumberOfYears(){
        return numberOfYears;
    }
    public void setNumberOfYears(int numberOfYears){
        this.numberOfYears = numberOfYears;
    }

    public double getLoanAmount(){
        return loanAmount;
    }
    public void setLoanAmount(double loanAmount){
        this.loanAmount = loanAmount;
    }

    public double getMonthlyPayment(){
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate /
                (1 - (Math.pow(1/(1+monthlyInterestRate), numberOfYears*12)));
        return monthlyPayment;
    }

    public double getTotalPayment(){
        double totalPayment = getMonthlyPayment() * numberOfYears * 12;
        return totalPayment;
    }

    public java.util.Date getLoanDate(){
        return loanDate;
    }
}
