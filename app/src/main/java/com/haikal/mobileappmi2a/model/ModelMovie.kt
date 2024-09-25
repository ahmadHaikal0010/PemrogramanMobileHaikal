package com.haikal.mobileappmi2a.model

import com.haikal.mobileappmi2a.R

data class ModelMovie(
    val gambar : Int,
    val judul : String,
    val sinopsis : String
)

object MovieList {
    fun getModel() : List<ModelMovie> {
        val itemModel1 = ModelMovie(
            R.drawable.avatar,
            "Avatar",
            "Avatar (2009) A paraplegic Marine dispatched to the moon Pandora on a unique mission becomes torn between following his orders and protecting the world he feels is his home."
        )

        val itemModel2 = ModelMovie(
            R.drawable.batman,
            "Batman",
            "Batman (1989) Gotham City. Crime boss Carl Grissom (Jack Palance) effectively runs the town but there's a new crime fighter in town - Batman (Michael Keaton). Grissom's right-hand man is Jack Napier (Jack Nicholson), a brutal man who is not entirely sane... After falling out between the two Grissom has Napier set up with the Police and Napier falls to his apparent death in a vat of chemicals. However, he soon reappears as The Joker and starts a reign of terror in Gotham City. Meanwhile, reporter Vicki Vale (Kim Basinger) is in the city to do an article on Batman. She soon starts a relationship with Batman's everyday persona, billionaire Bruce Wayne. ??grantss"
        )

        val itemModel3 = ModelMovie(
            R.drawable.end_game,
            "End Game",
            "Avengers: Endgame (2019) After the devastating events of Avengers: Infinity War (2018), the universe is in ruins due to the efforts of the Mad Titan, Thanos. With the help of remaining allies, the Avengers must assemble once more in order to undo Thanos's actions and undo the chaos to the universe, no matter what consequences may be in store, and no matter who they face..."
        )

        val itemModel4 = ModelMovie(
            R.drawable.hulk,
            "Hulk",
            "Hulk (2003) Bruce is an ordinary Gamma expert who one day gets blasted with radiation and somehow survives. But in the process a monster was born. Now whenever he gets angry he grows bigger and stronger until he is no longer Bruce Banner. He becomes The Hulk\n"
        )

        val itemModel5 = ModelMovie(
            R.drawable.inception,
            "Inception",
            "Inception (2010) Dom Cobb is a skilled thief, the absolute best in the dangerous art of extraction, stealing valuable secrets from deep within the subconscious during the dream state, when the mind is at its most vulnerable. Cobb's rare ability has made him a coveted player in this treacherous new world of corporate espionage, but it has also made him an international fugitive and cost him everything he has ever loved. Now Cobb is being offered a chance at redemption. One last job could give him his life back but only if he can accomplish the impossible, inception. Instead of the perfect heist, Cobb and his team of specialists have to pull off the reverse: their task is not to steal an idea, but to plant one. If they succeed, it could be the perfect crime. But no amount of careful planning or expertise can prepare the team for the dangerous enemy that seems to predict their every move. An enemy that only Cobb could have seen coming. ??Warner Bros. Pictures"
        )

        val itemModel6 = ModelMovie(
            R.drawable.jumanji,
            "Jumanji",
            "Jumanji: Welcome to the Jungle (2017) In a brand-new Jumanji adventure, four high-school kids discover an old video-game console and are drawn into the game's jungle setting, literally becoming the adult avatars they chose. What they discover is that you don't just play Jumanji--you must survive it. To beat the game and return to the real world, they must go on the most dangerous adventure of their lives, discover what Alan Parrish left 20 years ago, and change the way they think about themselves --or they'll be stuck in the game forever, to be played by others without break. ??Sony Pictures"
        )

        val itemModel7 = ModelMovie(
            R.drawable.jurassic_world,
            "Jurassic World",
            "Jurassic World (2015) Twenty-two years after the original Jurassic Park failed, the new park, also known as Jurassic World, is open for business. After years of studying genetics, the scientists on the park genetically engineer a new breed of dinosaur, the Indominus Rex. When everything goes horribly wrong, will our heroes make it off the island? ??ahmetkozan\n"
        )

        val itemModel8 = ModelMovie(
            R.drawable.lucy,
            "Lucy",
            "Lucy (2014) It was supposed to be a simple job. All Lucy had to do was deliver a mysterious briefcase to Mr. Jang. But immediately Lucy is caught up in a nightmarish deal where she is captured and turned into a drug mule for a new and powerful synthetic drug. When the bag she is carrying inside of her stomach leaks, Lucy's body undergoes unimaginable changes that begins to unlock her mind's full potential. With her new-found powers, Lucy turns into a merciless warrior intent on getting back at her captors. She receives invaluable help from Professor Norman, the leading authority on the human mind, and French police captain Pierre Del Rio. ??LeiaSolo"
        )

        val itemModel9 = ModelMovie(
            R.drawable.spider_man,
            "Spider-man",
            "Spider-Man (2002) Based on Marvel Comics' superhero character, this is a story of Peter Parker who is a nerdy high-schooler. He was orphaned as a child, bullied by jocks, and can't confess his crush for his stunning neighborhood girl Mary Jane Watson. To say his life is \"miserable\" is an understatement. But one day while on an excursion to a laboratory a runaway radioactive spider bites him... and his life changes in a way no one could have imagined. Peter acquires a muscle-bound physique, clear vision, ability to cling to surfaces and crawl over walls, shooting webs from his wrist ... but the fun isn't going to last. An eccentric millionaire Norman Osborn administers a performance enhancing drug on himself and his maniacal alter ego Green Goblin emerges. Now Peter Parker has to become Spider-Man and take Green Goblin to the task... or else Goblin will kill him. They come face to face and the war begins in which only one of them will survive at the end. ??Soumitra"
        )

        val itemModel10 = ModelMovie(
            R.drawable.venom,
            "Venom",
            "Venom (2018) After a faulty interview with the Life Foundation ruins his career, former reporter Eddie Brock's life is in pieces. Six months later, he comes across the Life Foundation again, and he comes into contact with an alien symbiote and becomes Venom, a parasitic antihero."
        )

        val itemList: ArrayList<ModelMovie> = ArrayList()
        itemList.add(itemModel1)
        itemList.add(itemModel2)
        itemList.add(itemModel3)
        itemList.add(itemModel4)
        itemList.add(itemModel5)
        itemList.add(itemModel6)
        itemList.add(itemModel7)
        itemList.add(itemModel8)
        itemList.add(itemModel9)
        itemList.add(itemModel10)

        return itemList
    }
}