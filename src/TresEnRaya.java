public class TresEnRaya{
    public static void main(String[] args) throws Exception {
        String [] tablero = {"","","","","","","","","",""};
        mostrarTablero(tablero);
    }

    public static void mostrarTablero(String[] elTablero){
        System.out.println(elTablero[7] + "     |    " + elTablero[8] + "   |     " + elTablero[9]);
        System.out.println("_____________________");
        System.out.println(elTablero[4] + "     |    " + elTablero[5] + "   |     " + elTablero[6]);
        System.out.println("_____________________");
        System.out.println(elTablero[1] + "     |    " + elTablero[2] + "   |     " + elTablero[3]);

    }
}
