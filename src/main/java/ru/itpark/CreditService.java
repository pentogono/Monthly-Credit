package ru.itpark;

public class CreditService {
    public int calculatePayment(int creditAmount, int creditTerm, int loanRate) {

        double percentageRate = (double) loanRate / 100;
        double monthRate = percentageRate / (double) 12;
        double baseDegree = (double) 1 + monthRate;
        double exponentiation = Math.pow(baseDegree, creditTerm);

        int monthlyPayment = (int) (((monthRate / (exponentiation - 1)) + monthRate) * creditAmount);

        return monthlyPayment;
    }
}
