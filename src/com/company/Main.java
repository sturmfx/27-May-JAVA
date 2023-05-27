package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
public class Main
{
    private static final int PORT = 1234;
    public static void main(String[] args) throws IOException
    {
        ServerSocket server = new ServerSocket(PORT);
        while(true)
        {
            Socket client = server.accept();
            BufferedReader reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
            PrintWriter writer = new PrintWriter(client.getOutputStream(), true);
            String input  = reader.readLine();
            String[] numbersText = input.split(",");
            double a = Double.parseDouble(numbersText[0]);
            double b = Double.parseDouble(numbersText[1]);
            double c = Double.parseDouble(numbersText[2]);
            Result res = TestMath.solveSquareEquation(a, b, c);
            String finalResult = res.toString();
            writer.println(finalResult);
            client.close();
        }
    }
}
