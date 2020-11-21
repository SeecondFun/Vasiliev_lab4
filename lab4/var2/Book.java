package ru.mirea.gib04.lab4.var2;

class Book implements Priceable
{
    int royalty = 30;
    int markup = 5;

    @Override
    public int getPrice()
    {
        return royalty + markup;
    }
}