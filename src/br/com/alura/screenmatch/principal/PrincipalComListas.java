package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão",1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar",2023);
        outroFilme.avalia(6);
        Filme filmeDoPaulo = new Filme("dogville",2003);
        filmeDoPaulo.avalia(10);
        Serie lost = new Serie("Lost",2000);


        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        for(Titulo item: lista){
            System.out.println(item);
            if(item instanceof Filme){
                Filme filme = (Filme)item;
                System.out.println("Classificação"+ filme.getClassificacao());
            }

        }
        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Diego");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("depois da ordenação");
        System.out.println(buscaPorArtista);
        System.out.println("lista de titulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("ordenando por ano");
        System.out.println(lista);

    }
}
