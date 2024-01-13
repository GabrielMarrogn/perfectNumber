import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int soma;
        int b = 0;

        for(int i = 0; i < a; i++){
            soma= 0;
            b = Integer.parseInt(br.readLine());
            for(int k = 1; k < b; k++){
                if(b%k == 0){
                    soma = soma+k;
                }
            }
            if(soma == b){
                System.out.println(b +" eh perfeito");
            }else{
                System.out.println(b +" nao eh perfeito");
            }
        }

    }
}
