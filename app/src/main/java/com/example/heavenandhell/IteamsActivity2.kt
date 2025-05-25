package com.example.heavenandhell

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class IteamsActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_iteams2)

        val itemsList: RecyclerView = findViewById(R.id.itemsList)
        val items = arrayListOf<Iteam>()

        items.add(Iteam(1, "armor", "Протыкиватель",
            "Обычное оружие, подходящее для дуелей",
            "Увеличивает дальность ближнего боя на 45, 15% замедлить противника при атаке",
            100))

        items.add(Iteam(2, "plant", "Огурец бездны",
            "Морской гриб с самого дна",
            "С шансом 35% отражает любой нанесённый урон в противника. + 200 к здоровью",
            150))

        items.add(Iteam(3, "potion", "Блакитный клинок",
            "Отломанный осколок блакита привязанный к перчатке",
            "Атаки пробивают броню, -8% здоровья",
            150))

        items.add(Iteam(4, "sharke", "Друг акулённок",
            "Имунитет от депрессии",
            "Даёт полный имунитет от депрессии, + 5 к скорости передвижения",
            105))

        items.add(Iteam(5, "maska", "Искажённая маска",
            "Маска дающая силу, от которой нельзя отказаться",
            "Активная способность: Увеличивает все атакующие статы, вы полностью теряете контроль над персонажем",
            175))

        items.add(Iteam(6, "egge", "Рассколотое яйцо",
            "Загадочное квадратное яйцо из квадратного мира",
            "-30 к скорости передвижения. Через 300 секунд ломается и даёт перманентный бонус к радиусу способности х2",
            130))

        items.add(Iteam(7, "toy", "Театр живых кукл",
            "Куклы пляшут в случайном порядке",
            "Активная способность: Призывает отряд из 4 слабых кукол и 1 сильной, каждая наносит по 30 урона и взрывается после смерти нанося 400 урона по области. Сильная кукла после смерти исцеляет владельца на 30% от нанесённого урона всеми куклами",
            130))


        itemsList.layoutManager = LinearLayoutManager(this)
        itemsList.adapter = IteamsAdapter(items, this)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}