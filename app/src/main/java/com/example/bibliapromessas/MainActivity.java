package com.example.bibliapromessas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        // Metodo de clique para gerar textos aleatórios
    public void geradorDeTextos(View view){

        TextView resultado = findViewById(R.id.txt_promessa);

            // Array de strings simples
        String[] paoDiario = {
         "Eu busco as lágrimas derramadas, não para exibição, mas por arrependimento \nCrisóstomo",
         "Uma pedra não erige uma torre inteira, assim como obedecer a um mandamento não eleva a alma à altura necessaria da perfeição. \nGregório de Nissa",
         "Todo ato da pessoa perfeita é um testemunho de Cristo Jesus, e a abstinência de todo pecado é uma negação de si mesmo, que leva a Cristo. \nOrígenes",
         "Mesmo que não fosse oferecido um prêmio aos que lutam pela verdadeira religião, a Verdade em si bastaria para persuadir aqueles que a amam, a aceitarem qualquer perigo em favor dela. \nTeodoreto",
         "Tenha cuidado com a sua propria confiança, para não cair da altura de disciplina por falta de treinamento. É melhor avançar um pouco por vez. \nBasílio",
         "Não sei a quais tentações consigo resistir e a quais não consigo. Há, porém, esperança porque tu és fiel. \nAgostinho",
         "Fuja da soberba, porque ela é uma paixão mais traiçoeira do que qualquer outra. \nGlória duradoura - Crisóstomo",
         "Você praticou algum ato por humildade? Não se orgulhe disso, senão todo mérito desse ato será perdido. \nCrisóstomo",
         "O poder da sabedoria divina é tão grande que, quando infundida no coração, expulsa a tolice em um único impulso, de uma vez por todas. \nLactâncio",
         "Não devemos fugir ou desanimar quando algo inesperado nos acontece. Em vez disso, devemos nos submeter Àquele que tem o maior conhecimento e provará nosso coração no fogo durante o tempo que quiser. \nCrisóstomo",
         "É inútil tentar ensinar o que você não sabe, e ainda pior, não reconhecer a sua ignorância. \nJerônimo",
         "O maior conforto para quem sofre falsas acusações é dado pelas palavras das Escrituras. \nTeodoreto",
         "É necessário tanto que nós nos dominemos, quanto que Deus nos poupe. \nGregório Nazianzeno",
         "Quanto mais a alma morre para as coisas carnais, mais se eleva para as espirituais. \nAgostinho",
         "Não temos outra fonte de conhecimento senão o próprio Deus. \nHilário de Poitiers",
         "Nada falta à fé: ela é perfeita e completa em si mesma. \nClemente de Alexandria",
         "Dizemos ter ouvido Cristo e crer nas promessas feitas por Ele. Então, dizem: demonstre isso pelas suas obras. \nCrisóstomo",
         "Todos os dias, devemos considerar o que fizemos naquele dia e naquela noite. Se tivermos pecado, precisamos parar. Porém, se não tivermos, não devemos nos orgulhar. \nAtanásio",
         "O Senhor Deus, que é misericordioso e justo, presta atenção às nossas continuas orações. \nAgostinho",
         "Até mesmo o mais puro e claro entendimento humano é incapaz de compreender a Sua natureza divina. \nOrígenes",
         "Inclinemo-nos a demonstrar misericórdia e tods as outras bênçãos se seguirão. \nCrisóstomo",
         "Não esconda o seu único talento em um guardanapo, mas, como os bons negociantes, trabalhe sempre com sua mente, seu corpo e sua vontade firme e pronta para distribuí-lo. \nAmbrósio"
        };

        int geradorAleatorio = new Random().nextInt(23);
        resultado.setText(paoDiario[geradorAleatorio]);
    }
}