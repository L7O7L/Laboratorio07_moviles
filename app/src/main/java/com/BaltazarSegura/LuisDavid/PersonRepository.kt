package com.BaltazarSegura.LuisDavid

class PersonRepository (val persons:MutableList<Person> = ArrayList()){

    init {
        getDataPersons()
    }

    fun getDataPersons(): List<Person> {
        persons.add(Person(100, "Juan Perez", "jperez@gmail.com", "hey_luminers"))
        persons.add(Person(200, "Miguel Chavez", "mchavez@gmail.com", "hey_luminers"))
        persons.add(Person(300, "Martha Prado", "mprado@gmail.com", "hey_luminers"))
        persons.add(Person(400, "Jaime Farfan", "jfarfan@gmail.com", "hey_luminers"))
        persons.add(Person(500, "Luiz Maza", "lmaza@gmail.com", "hey_luminers"))
        persons.add(Person(600, "Juan Perez", "jperez@gmail.com", "hey_luminers"))
        persons.add(Person(700, "Miguel Chavez", "mchavez@gmail.com", "hey_luminers"))
        persons.add(Person(800, "Martha Prado", "mprado@gmail.com", "hey_luminers"))
        persons.add(Person(900, "Jaime Farfan", "jfarfan@gmail.com", "hey_luminers"))
        persons.add(Person(1000, "Luiz Maza", "lmaza@gmail.com", "hey_luminers"))
        return persons
    }


}