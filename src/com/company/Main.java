package com.company;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        while (true){
            Scanner scanner = new Scanner(System.in);
            String n = scanner.nextLine();
            if (n.equals("")){
                break;
            }
            else{
                a.add(n);
            }
        }
        int max = 0;
        String ans = "";
        for (int i = 0; i<a.size(); i++){
            if(a.get(i).length()>max){
                max=a.get(i).length();
                ans=a.get(i);
            }
        }
        System.out.println(ans);
    }
}
