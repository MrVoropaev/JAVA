from pyDatalog import pyDatalog
pyDatalog.create_terms('X, Y, age, average_age, sum_age, count_people')

+ age('Мария', 30)
+ age('Иван', 40)
+ age('Алексей', 20)

average_age(X) <= (sum_age(Y), count_people(Z)) & (Y==sum(X['Y']) for X in age(X['X'], X['Y'])) & (Z==len(age))

# Запрос: какой средний возраст людей?
print(average_age(X))