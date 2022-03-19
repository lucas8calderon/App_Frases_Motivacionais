package com.lucascalderon1.frasesmotivacionais;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    private TextView frases;
    private Button gerarFrases;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frases = findViewById(R.id.frases);
        gerarFrases = findViewById(R.id.gerarFrases);

        getSupportActionBar().hide();


        gerarFrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] frasesMotivacionais = {"Na vida um monte de gente sabe o que fazer, mas poucos fazem, de fato, o que sabem que é preciso. Saber não é o suficiente. Você precisa agir.",
                        "Saiba que são suas decisões, e não suas condições, que determinam seu destino.",
                        "Se você faz o que sempre fez, você obterá o que você sempre obteve.",
                        "É nos momentos de decisão que o seu destino é traçado.",
                        "Onde há foco a energia flui.",
                        "A persistência é o caminho do êxito",
                        "A persistência é o caminho do êxito.",
                        "O sucesso nasce do querer, da determinação e persistência em se chegar a um objetivo. Mesmo não atingindo o alvo, quem busca e vence obstáculos, no mínimo fará coisas admiráveis.",
                        "Lute. Acredite. Conquiste. Perca. Deseje. Espere. Alcance. Invada. Caia. Seja tudo o quiser ser, mas, acima de tudo, seja você sempre.",
                        "Só existe um êxito: a capacidade de levar a vida que se quer.",
                        "A vitalidade é demonstrada não apenas pela persistência, mas pela capacidade de começar de novo.",
                        "A coragem não é ausência do medo; é a persistência apesar do medo.",
                        "Só se pode alcançar um grande êxito quando nos mantemos fiéis a nós mesmos.",
                        "O homem não teria alcançado o possível se, repetidas vezes, não tivesse tentado o impossível.",
                        "Todo mundo é capaz de sentir os sofrimentos de um amigo. Ver com agrado os seus êxitos exige uma natureza muito delicada.",
                        "Força de ânimo e coragem na adversidade servem para conquistar o êxito, mais do que um exército.",
                        "O sucesso tem uma estranha capacidade de esconder o erro.",
                        "Creia em si, mas não duvide sempre dos outros.",
                        "Uma autoimagem forte e positiva é a melhor preparação possível para o sucesso.",
                        "Dois homens não podem passar meia hora juntos sem que um conquiste uma evidente superioridade em relação ao outro.",
                        "Não deixe que as pessoas te façam desistir daquilo que você mais quer na vida. Acredite. Lute. Conquiste. E acima de tudo, seja feliz!",
                        "As únicas grandes companhias que conseguirão ter êxito são aquelas que consideram os seus produtos obsoletos antes que os outros o façam.",
                        "Talento é dom, é graça. E sucesso nada tem a ver com sorte, mas com determinação e trabalho.",
                        "Para ter um negócio de sucesso, alguém, algum dia, teve que tomar uma atitude de coragem.",
                        "Nenhum mentiroso tem uma memória suficientemente boa para ser um mentiroso de êxito.",
                        "Estar decidido, acima de qualquer coisa, é o segredo do êxito.",
                        "Para obter êxito no mundo temos de parecer loucos mas sermos espertos.",
                        "A disciplina é a mãe do êxito.",
                        "O segredo do êxito na vida de um homem está em preparar-se para aproveitar a ocasião, quando ela se apresenta.",
                        "O êxito começa no exato momento em que o homem decide o que quer e começa a trabalhar para consegui-lo.",
                        "A disciplina é a alma de um exército; torna grandes os pequenos contingentes, proporciona êxito aos fracos, e estima todos.",
                        "O êxito parece doce a quem não o alcança.",
                        "A raiz do mal reside no fato de se insistir demasiadamente que no êxito da competição está a principal fonte de felicidade.",
                        "O preço barato do papel é a razão por que as mulheres começaram por ter êxito na literatura, antes de o alcançarem noutras profissões.",
                        "Não existe comparação entre aquilo que é perdido por não se obter êxito e aquilo que é perdido por não se tentar.",
                        "O conhecimento coroa os esforços com o êxito.",
                        "Pouco nos importa o êxito. Trata-se de sermos grandes e não de o parecermos.",
                        "Não é um notável talento o que se exige para assegurar o êxito em qualquer empreendimento, mas sim um firme propósito.",
                        "A persistência realiza o impossível.",
                        "Persistência é a irmã gêmea da excelência. Uma é a mãe da qualidade, a outra é a mãe do tempo.",
                        "Eu escolho um homem que não duvide de minha coragem, que não me acredite inocente, que tenha a coragem de me tratar como uma mulher.",
                        "As pessoas não carecem de força, carecem de determinação.",
                        "Suba o primeiro degrau com fé. Não é necessário que você veja toda a escada. Apenas dê o primeiro passo.",
                        "Conserve os olhos fixos num ideal sublime e lute sempre pelo que deseja, pois só os fracos desistem e só quem luta é digno de vida.",
                        "A esperança não será a prova de um sentido oculto da Existência, uma coisa que merece que se lute por ela?",
                        "O êxito da vida não se mede pelo caminho que você conquistou, mas sim pelas dificuldades que superou no caminho.",
                        "A impaciência é um grande obstáculo para o bom êxito.",
                        "Não procure ser um homem com êxito, e sim um homem com valores.",
                        "Ame, acredite, pense, grite, sonhe, conquiste, lute, batalhe, tenha força, tenha foco, tenha fé. Sorria e agradeça a Deus por mais um dia.",
                        "Tudo deveria se tornar o mais simples possível, mas não simplificado.",
                        "Comece fazendo o que é necessário, depois o que é possível, e de repente você estará fazendo o impossível.",
                        "O erro acontece de vários modos, enquanto ser correto é possível apenas de um modo.",
                        "Não é possível ser bom pela metade.",
                        "O milagre não prova o impossível; serve, apenas, como confirmação do que é possível.",

                };

                Random random = new Random();

                int numerosAleatorios = random.nextInt(frasesMotivacionais.length);

                frases.setText(frasesMotivacionais[numerosAleatorios]);
            }
        });


    }
}