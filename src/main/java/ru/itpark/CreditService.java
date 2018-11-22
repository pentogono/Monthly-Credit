package ru.itpark;

public class CreditService {
    public int calculatePayment(int creditAmount, int creditTerm, int loanRate) {

        int constantsOne = 1;
        int monthYear = 12;
        int hundredPercent = 100;
        double percentageRate = (double) loanRate / (double) hundredPercent;
        double monthRate = percentageRate / (double) monthYear;
        double baseDegree = (double) constantsOne + monthRate;
        double exponentiation = Math.pow(baseDegree, creditTerm);

        int monthlyPayment = (int) (((monthRate / (exponentiation - constantsOne)) + monthRate) * creditAmount);

        return monthlyPayment;
    }
}
