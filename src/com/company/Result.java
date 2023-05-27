package com.company;

public class Result
{
    int number_of_roots = 0;
    double x1;
    double x2;
    double a;
    double b;
    double c;

    public Result(int number_of_roots, double x1, double x2, double a, double b, double c)
    {
        this.number_of_roots = number_of_roots;
        this.x1 = x1;
        this.x2 = x2;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString()
    {
        String s = "Уравнение: " + a + " * x^2 + " + b + " * x + " + c + " = 0";
        if(number_of_roots == 0)
        {
            s = s + "     " + "Корней у уравнения нет.";
            return s;
        }
        else if(number_of_roots == 1)
        {
            s = s + "     " + "У уравнения один корень: " + x1 + ".";
            return s;
        }
        else if(number_of_roots == 2)
        {
            s = s + "     " + "У уравнения два корня: " + x1 + " и " + x2 + ".";
            return s;
        }
        else
        {
            s = s + "     " + "Результат неверен, так как количество корней квадратного уравнения не может быть вне чисел 0, 1, 2!";
            return s;
        }
    }
}