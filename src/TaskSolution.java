/*
    1. Объявить и инициализировать словарь hashMap<String, String>
    2. Добавить в словарь 10 пар "Ключ - Значение". Автор и название книги например.
    3. Пройти по словарю и добавить к значениям символ "!"
    4. Добавить нового автора и название книги если соответствующего ключа не было.
    5. Если ключ, указанный в запросе, имеется, вырезать из соответствующего ключу значения первое слово.
    6. *Пройти по словарю другим, не таким, как в пункте 3, методом и вывести пары ключ значение в консоль.
    7. ** Пройти по словарю другим, не таким, как в пункте 3 и 6, методом. Добавить к значениям строку "(просмотрен)" и вывести в консоль.
*/

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TaskSolution {
    public static void main(String[] args) {
// 1. Объявить и инициализировать словарь hashMap<String, String>
        Map<String, String> map = new HashMap<>(Map.of("I", "Hello Java"));

// 2. Добавить в словарь 10 пар "Ключ - Значение". Автор и название книги например.
        map.put("Барри Бёрд", "Java для чайников");
        map.put("Герберт Шилдт", "Java. Руководство для начинающих");
        map.put("Кэти Сьерра, Берт Бэйтс", "Head First Java");
        map.put("Мартин Роберт К.", "Чистый код. Создание, анализ и рефакторинг");
        map.put("Адитья Бхаргава", "Грокаем алгоритмы");
        map.put("Брюс Эккель", "Философия Java");
        map.put("Кей С. Хорстманн", "Java. Библиотека профессионала");
        map.put("Лев Толстой", "Война и мир");
        map.put("Джон Толкин", "Властелин Колец");
        map.put("Федор Достоевский", "Преступление и наказание");

// 3. Пройти по словарю и добавить к значениям символ "!"
        for(var item : map.entrySet())  map.put(item.getKey(), item.getValue() + "!");

// 4. Добавить нового автора и название книги если соответствующего ключа не было.
        map.putIfAbsent("Джошуа Блох", "Эффективная Java");

// 5. Если ключ, указанный в запросе, имеется, вырезать из соответствующего ключу значения первое слово.
        String author = "Герберт Шилдт";
        StringBuilder sb = new StringBuilder(map.get(author));
        System.out.printf("5. %s\n", sb);

        sb.delete(sb.indexOf(" "), sb.length());
        System.out.printf("   %s\n\n", sb);

// 6. *Пройти по словарю другим, не таким, как в пункте 3, методом и вывести пары ключ значение в консоль.
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.printf("6. Автор: %s. Книга: %s\n", key, value);
        }
        System.out.println();

// 7. ** Пройти по словарю другим, не таким, как в пункте 3 и 6, методом. Добавить к значениям строку "(просмотрен)" и вывести в консоль.
        map.forEach((a,b) -> System.out.printf("7. Автор: %s. Книга: %s\n", a, b + " <<< просмотрен >>>"));
    }
}
