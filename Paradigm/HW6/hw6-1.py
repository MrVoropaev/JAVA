# В данном коде используется подход программирования, основанный на объектах.
# Объектно-ориентированное программирование (ООП) – это методология, в которой программа структурируется вокруг взаимодействующих объектов. Каждый объект имеет свои свойства и методы, которые определяют его поведение.
# В данном коде класс Stopwatch определяет состояние и поведение таймера, а созданный экземпляр этого класса представляет конкретный таймер со своими уникальными значениями.
# ООП позволяет абстрагироваться от деталей реализации и сосредоточиться на взаимодействии объектов. Класс Stopwatch инкапсулирует логику работы таймера, что делает код более модульным и упрощает его повторное использование в других частях программы.
# Кроме того, ООП обеспечивает наследование, полиморфизм и инкапсуляцию, что упрощает разработку, повышает гибкость и облегчает поддержку кода.

import time

class Stopwatch:
    def __init__(self):
        self.start_time = None
        self.bool_pause_time = False
        self.pause_start_time = None
        self.total_paused_time = 0

    def start(self):
        # Запуск таймера, если он еще не был запущен
        if not self.start_time:
            self.start_time = time.time()
        # Если таймер был на паузе, продолжаем его работу
        elif self.bool_pause_time:
            self.total_paused_time += time.time() - self.pause_start_time
            self.bool_pause_time = False

    def pause(self):
        # Приостанавливаем работу таймера, если он запущен и не находится на паузе
        if self.start_time and not self.bool_pause_time:
            self.bool_pause_time = True
            self.pause_start_time = time.time()

    def resume(self):
        # Продолжаем работу таймера, если он находится на паузе
        if self.bool_pause_time:
            self.bool_pause_time = False
            self.total_paused_time += time.time() - self.pause_start_time

    def stop(self):
        # Останавливаем таймер и обнуляем все значения
        self.start_time = None
        self.bool_pause_time = False
        self.pause_start_time = None
        self.total_paused_time = 0

    def get_time(self):
        # Получаем текущее время работы таймера
        if self.start_time:
            if self.pause_start_time:
                return self.pause_start_time - self.start_time - self.total_paused_time
            else:
                return time.time() - self.start_time - self.total_paused_time

    def get_time_format(self):
        # Получаем текущее время работы таймера в формате "мм:сс"
        time = int(self.get_time())
        min = time // 60
        sec = time % 60
        return f"{min:02}:{sec:02}"


if __name__ == "__main__":
    stopwatch = Stopwatch()
    while True:
        print("1 - start")
        print("2 - pause")
        print("3 - continue")
        print("4 - stop")
        print("5 - exit")

        choice = input("Choose number: ")
        if choice == "1":
            stopwatch.start()
        elif choice == "2":
            stopwatch.pause()
        elif choice == "3":
            stopwatch.resume()
        elif choice == "4":
            stopwatch.stop()
        elif choice == "5":
            print("Exit")
            break

    total = stopwatch.get_time_format()
    print("Time:", total)
