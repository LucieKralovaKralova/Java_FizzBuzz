
public class Main {
    public static void main(String[] args) {
// Vypisuj čísla od 1 do 100. V případě, že je dané číslo dělitelné třemi, tak napiš místo něj text Fizz.
// Pokud je číslo dělitelné pěti, tak místo čísla vypiš Buzz.
// A pokud je dělitelní třemi a pěti zároveň, tak vypiš FizzBuzz.

        int limit = 100;
        for (int i=1; i<limit; i++){

            if ((i%3==0)&&(i%5==0)){
                System.out.println("FizzBuzz");
            }else if (i%5==0){
                System.out.println("Buzz");
            }else if (i%3==0){
                System.out.println("Fizz");
            }else {
                System.out.println(i);
            }
        }

    }
}