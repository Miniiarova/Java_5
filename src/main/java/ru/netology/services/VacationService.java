package ru.netology.services;

public class VacationService {
    public int calc(int income, int expenses, int threshold) {
        int savings = 0;
        int vacations = 0;
        for (int i = 1; i <= 12; i++) {
            if (savings >= threshold) {
                savings = (savings - expenses) / 3;
                vacations++;
            } else {
                savings = savings + income - expenses;
            }
        }
        
        return vacations;
    }
}
