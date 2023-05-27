package com.company;

public class TestMath
{
    public static Result solveSquareEquation(double a, double b, double c)
    {
        if (a == 0)
        {
            Result result1 = new Result(0, 0, 0, a, b, c);
            return result1;
        }

        double xx1 = 0;
        double xx2 = 0;
        double d = b * b - 4 * a * c;

        if(d < 0)
        {
            Result result2 = new Result(0, 0, 0, a, b, c);
            return result2;
        }
        else if(d == 0)
        {
            xx1 = - b / (2 * a);
            Result result3 = new Result(1, xx1, 0, a, b, c);
            return result3;
        }
        else
        {
            xx1 = ( - b + Math.sqrt(d)) / (2 * a);
            xx2 = ( - b - Math.sqrt(d)) / (2 * a);
            Result result4 = new Result(2, xx1, xx2, a, b, c);
            return result4;
        }
    }
}