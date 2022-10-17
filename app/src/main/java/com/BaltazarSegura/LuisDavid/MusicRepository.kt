package com.BaltazarSegura.LuisDavid

class MusicRepository (val musics:MutableList<Music> = ArrayList()){

    init {
        getDataMusics()
    }

    fun getDataMusics(): List<Music> {
        musics.add(Music("Red lights", "A town called paradise", "4:22", "Tiesto", "red_lights", "Electro"))
        musics.add(Music("How Stuff", "Bad Girls", "5:14", "Donna Summer", "hot_stuff", "Pop"))
        musics.add(Music("I knew you were trouble", "Red", "3:39", "Taylow Swift", "i_knew_you_were_trouble", "Pop"))
        musics.add(Music("Mirrors", "The 20/20 exprecience", "8:04", "Justin Timberlake", "mirrors", "Pop"))
        musics.add(Music("Scream & Shout", "WILLPOWER", "4:43", "will.i.am, Britney Spears", "scream_shout", "Pop"))
        musics.add(Music("Ho Hey", "Nashville Duets", "2:43", "The Lumineers", "hey_luminers", "Pop"))
        musics.add(Music("All I Want", "In A Perfect World", "5:05", "Kodaline", "all_i_want", "Pop"))
        musics.add(Music("Little Talks", "My head is an animal", "4:26", "Of Monsters And Men", "little_talks", "Pop"))
        musics.add(Music("Pompeii", "Bad Blood", "3:34", "Bastille", "pompeii", "Pop"))
        musics.add(Music("Llueve Sobre La Cuidad", "Los Bunkers", "3:56", "Los Bunkers", "llueve_sobre_la_cuidad", "Rock"))
        musics.add(Music("Back in Black", "Back in Black", "4:17", "AC/DC", "back_in_black", "Rock"))
        return musics
    }

}







