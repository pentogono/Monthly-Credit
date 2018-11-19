package ru.itpark;

public class CreditService {
    public double calculatePayment(double creditAmount, double creditTerm, double loanRate){

        double constantsOne=1;
        double monthYear=12;
        double monthRate=loanRate/monthYear;
        double monthlyPayment1=monthRate*(Math.pow((constantsOne+monthRate),creditTerm)-constantsOne);
        double monthlyPayment=(monthlyPayment1+monthRate)*creditAmount;

        return monthlyPayment;
    }
}
