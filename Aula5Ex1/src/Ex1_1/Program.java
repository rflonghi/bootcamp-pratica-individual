package Ex1_1;

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        Precedence<Pessoa>[] p = new Precedence[5];
        p[0] = new Pessoa("Joao", "61444139010");
        p[1] = new Pessoa("Maria", "46278305054");
        p[2] = new Pessoa("Daniel", "45065372039");
        p[3] = new Pessoa("Paula", "33010600054");
        p[4] = new Pessoa("Ricardo", "57884135086");

        System.out.println(Arrays.toString(SortUtil.sort(p)));

        Precedence<Celular>[] c = new Precedence[5];
        c[0] = new Celular(123456789, "Joao");
        c[1] = new Celular(283716283,"Maria");
        c[2] = new Celular(983201473,"Daniel");
        c[3] = new Celular(329873032, "Paula");
        c[4] = new Celular(391283143,"Ricardo");

        System.out.println(Arrays.toString(SortUtil.sort(c)));
    }
}
