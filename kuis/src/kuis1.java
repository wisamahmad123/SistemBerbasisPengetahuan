package kuis.src;

public class kuis1 {
    public static void main(String[] args) {
        boolean A = true, B = false, C = false, D = false
        ,E = true, F = false, G = false, H = false, I = false, J = false, K = false;
        System.out.println("Fakta A & E");
        //R1
        if(A && B == true) {
            C = true;
            System.out.println("Fakta baru C");
        }
        //R2
        if(C == true) {
            D = true;
            System.out.println("Fakta baru D");
        }
        //R3
        if(A && E == true) {
            F = true;
            System.out.println("Fakta baru F");
        }
        //R4
        if(A == true) {
            G = true;
            System.out.println("Fakta baru G");
        }
        //R5
        if(F && G == true) {
            D = true;
            System.out.println("Fakta baru D");
        }
        //R6
        if(G && E == true) {
            H = true;
            System.out.println("Fakta baru H");
        }
        //R7
        if(C && H == true) {
            I = true;
            System.out.println("Fakta baru I");
        }
        //R8
        if(I && A == true) {
            J = true;
            System.out.println("Fakta baru J");
        }
        //R9
        if(G == true) {
            J = true;
            System.out.println("Fakta baru J");
        }
        //R10
        if(J == true) {
            K = true;
            System.out.println("Fakta baru K");
        }

        System.out.println("Apakah K bernilai benar? " + K);
    }
}