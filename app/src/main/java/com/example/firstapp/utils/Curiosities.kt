package com.example.firstapp.utils

class Curiosities private constructor(){
    companion object {
        private val catCuriosities = arrayListOf<String>(
            "Em média um gato passa 2/3 do dia a dormir. Isso significa que em 9 anos de vida, apenas está acordado 3 anos.",
            "Os gatos não saboreiam o doce.",
            "Quando um gato persegue uma presa, ao contrário de um cão ou humano, mantém a cabeça sempre para baixo.",
            "As bolas de pelo que vomitamos chamam-se egagropilos.",
            "As gatas tendem a ser dextras, enquanto os gatos tendem a ser maioritariamente esquerdinos.",
            "Um gato faz cerca de 100 sons diferentes, enquanto um cão faz cerca de 10.",
            "O cérebro de um gato é biologicamente mais similar ao de um humano do que o cérebro de um cão. Ambos, humanos e gatos, têm uma região idêntica no cérebro responsável pelas emoções.",
            "Existem mais de 500 milhões de gatos domésticos no mundo, e aproximadamente 40 raças reconhecidas.",
            "O gato doméstico mais antigo foi encontrado numa sepultura no Chipre com mais de 9000 anos.",
            "De acordo com uma lenda hebraica, Noé rezou a Deus para o ajudar a proteger a comida dos ratos na arca. Deus fez um Leão espirrar, e desse espirro nasceu o gato.",
        )

        private val dogCuriosities = arrayListOf<String>(
            "Um cachorro adulto tem 42 dentes.",
            "O olfato canino é 1 milhão de vezes melhor do que o dos humanos.",
            "Castrar seu cachorro pode ajudar a prevenir alguns tipos de câncer.",
            "Se não for castrada, uma cachorra pode ter 66 filhotes em 6 anos.",
            "A audição canina é 10 vezes melhor do que a dos humanos.",
            "Em média, um cachorro pode correr 30 km/h.",
            "Os cães são mencionados 14 vezes na Bíblia.",
            "O nariz de cada cachorro é único, assim como nossa impressão digital.",
            "A temperatura canina gira em torno de 38°C.",
            "As únicas glândulas sudoríparas que os cachorros têm estão entre seus dedos das patas;",
        )

        fun getRandomCatCuriosity(): String {
            return catCuriosities.random()
        }

        fun getRandomDogCuriosity(): String {
            return this.dogCuriosities.random()
        }
    }
}