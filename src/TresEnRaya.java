import java.util.*;

public class TresEnRaya{
    public static void main(String[] args) throws Exception {
        String [] tablero = {" "," "," "," "," "," "," "," "," "," "};
        String miLetra = ingreseLetra();
        mostrarTablero(tablero);

        int jugada;

        int contador = 1;
        while(contador <= 9){
            System.out.println("\n");
            jugada = ingreseJugada();

            while(!tablero[jugada].equals(" ")){
                jugada = ingreseJugada();
            }
            
            tablero[jugada] = miLetra;
            mostrarTablero(tablero);

            if(esJugadaGanadora(tablero, miLetra)){
                System.out.println("GANO: " + miLetra);
                break;
            }

            if(miLetra.equals("X")){
                miLetra = "O";
            } else {
                miLetra = "X";
            }
            contador ++;
        }
        System.out.println("TERMINAMOS!!!");
    }

    public static void mostrarTablero(String [] elTablero){
        System.out.println(elTablero[7] + "|" + elTablero[8] + "|" + elTablero[9]);
        System.out.println("-+-+-");
        System.out.println(elTablero[4] + "|" + elTablero[5] + "|" + elTablero[6]);
        System.out.println("-+-+-");
        System.out.println(elTablero[1] + "|" + elTablero[2] + "|" + elTablero[3]);
    }

    public static String ingreseLetra(){
        String miLetra;
        Scanner sc =  new Scanner(System.in);
        System.out.println("Ingrese su letra X o O");
        miLetra = sc.next();

        while(!( miLetra.equals("O") || miLetra.equals("X") ) ){
            System.out.println();
            System.out.println("Ingrese su letra X o O");
            miLetra = sc.next();
        }
        return miLetra;
    }

    public static int ingreseJugada(){
        int jugada;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese jugada del 1-9");
        jugada = sc.nextInt();

        while(jugada < 1 || jugada > 9){
            System.out.println("Ingrese jugada: ");
            jugada = sc.nextInt();
        }
        return jugada;
    }

    public static boolean esJugadaGanadora(String[] elTablero, String laLetra){
        boolean gano = false;
        gano = (elTablero[1].equals(laLetra) && elTablero[2].equals(laLetra) && elTablero[3].equals(laLetra)) ||
                (elTablero[4].equals(laLetra) && elTablero[5].equals(laLetra) && elTablero[6].equals(laLetra)) ||
                (elTablero[7].equals(laLetra) && elTablero[8].equals(laLetra) && elTablero[9].equals(laLetra)) ||
                (elTablero[1].equals(laLetra) && elTablero[4].equals(laLetra) && elTablero[7].equals(laLetra)) ||
                (elTablero[2].equals(laLetra) && elTablero[5].equals(laLetra) && elTablero[8].equals(laLetra)) ||
                (elTablero[3].equals(laLetra) && elTablero[6].equals(laLetra) && elTablero[9].equals(laLetra)) ||
                (elTablero[1].equals(laLetra) && elTablero[5].equals(laLetra) && elTablero[9].equals(laLetra)) ||
                (elTablero[3].equals(laLetra) && elTablero[5].equals(laLetra) && elTablero[7].equals(laLetra));

        return gano;
    }

}













