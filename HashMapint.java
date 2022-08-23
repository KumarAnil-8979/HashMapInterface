// I am using intellij ide for code

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
public class HashMapint {
    Set<Integer> set = new HashSet<>();
    private void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 6 number and the key");
        for(int i=0;i<6;i++)
            set.add(Integer.parseInt(br.readLine()));
    }
    public void display(){
        System.out.println("The content of HashSet Includes");
        for(int i : set)
            System.out.println(i);
    }
    public static void main(String[] args) throws IOException {
        HashMapint hm = new HashMapint();
        hm.input();
        hm.display();
    }
}

