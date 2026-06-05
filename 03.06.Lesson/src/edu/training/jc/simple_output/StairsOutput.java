package edu.training.jc.simple_output;

public class StairsOutput {
    public static void main(String[] args){
        // есть два требования, которые противоречат друг другу:
        // 1. рисунок, в точности соответствующий рисунку на картинке.
        // 2. символ табуляции в начале второго и четвертого предложений и две табуляции для третьего;
        // тут по хорошему уточнить у заказчика, что он хотел)


        // 1. рисунок, в точности соответствующий рисунку на картинке.

        System.out.println("“To wisely live your life, you don't need to know much\n\n\t\tJust remember two main rules for the beginning:\n\n\t\t\t\tYou better starve, than eat whatever\n\n\t\tAnd better be alone, than with whoever.”\n\nOmar Khayyam, Rubaiyat");


        System.out.println("\n_______________________________________________________\n");
        // 2. символ табуляции в начале второго и четвертого предложений и две табуляции для третьего;

        System.out.println("“To wisely live your life, you don't need to know much\n\n\tJust remember two main rules for the beginning:\n\n\t\tYou better starve, than eat whatever\n\n\tAnd better be alone, than with whoever.”\n\nOmar Khayyam, Rubaiyat");
    }
}