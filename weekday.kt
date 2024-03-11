import javax.swing.text.StyledEditorKit
enum class weekday(val dayNumb:Int){
    pon(1),
    vtor(2),
    sr(3),
    ch(4),
    pyatn(5),
    sybb(6),
    voskr(7);

    fun displayDay():String{
        return when (this){
            pon->"Понедельник"
            vtor->"Вторник"
            sr->"Среда"
            ch->"Четверг"
            pyatn->"Пятница"
            sybb->"Суббота"
            voskr->"Воскресенье"
        }
    }
    fun displayNumb():Int {return  dayNumb}
    fun  vikhodn():Boolean {return this == sybb || this == voskr}
    fun workin():Boolean {return !vikhodn()}
    fun today():Boolean {
        var today = java.time.DayOfWeek.from(java.time.LocalDate.now())
        return dayNumb == today.value}
}

enum class Color(val colNumb:Int){
    red(1),
    blue(2),
    green(3),
    yellow(4),
    black(5),
    white(6),
    orange(7);

    fun displayCol():String {
        return when (this){
            red->"Красный"
            blue->"Синий"
            green->"Зеленый"
            yellow->"Желтый"
            black->"Черный"
            white->"Белый"
            orange->"Оранжевый"
        }
    }
    fun displayNumb():Int {return colNumb}
    fun wCol(): Boolean { return  this == red || this == orange || this == yellow}
    fun darCol():Boolean {return this == black}
    }

fun main()
{
    val today = weekday.pon
    println("Сегодня: ${today.displayDay()}")
    println("Номер дня недели: ${today.displayNumb()}")
    println("Выходной: ${if(today.vikhodn())"Да" else "Нет"} | Рабочий: ${if(today.workin())"Да" else "Нет"}")
    println("Текущий день?: ${if(today.today()) "Да" else "Нет"}")

    val color1 = Color.yellow
    val color2 = Color.black

    println("Первый цвет: ${color1.displayCol()}")
    println("Второй цвет: ${color2.displayCol()}")
    println("Номер первого цвета: ${color1.displayNumb()}")
    println("Первый Теплый цвет: ${if (color1.wCol()) "Да" else "Нет"}")
    println("Первый Темный цвет: ${if (color1.darCol()) "Да" else "Нет"}")




}
