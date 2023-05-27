package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
public class Client
{
    private static final String SERVER_HOST = "localhost";
    private static final int SERVER_PORT = 1234;
    public static void main(String[] args) throws IOException
    {
        Socket connection = new Socket(SERVER_HOST, SERVER_PORT);
        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        PrintWriter writer = new PrintWriter(connection.getOutputStream(), true);
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите три числа характеризующие квадратное уравнение через запятую:");
        String message = console.readLine();
        writer.println(message);
        String result = reader.readLine();
        System.out.println(result);
        connection.close();
    }
}
