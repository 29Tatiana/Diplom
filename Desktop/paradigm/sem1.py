# Задача No1.
# Дан список целых чисел numbers.
# Необходимо написать в императивном стиле процедуру для сортировки числа в списке в порядке убывания.
# Можно использовать любой алгоритм сортировки.
def sort_list_imperative(numbers):
    for i in range(len(numbers)):
        for j in range(0, len(numbers) - i - 1):
            if numbers[j] > numbers[j + 1]:
                numbers[j], numbers[j + 1] = numbers[j + 1], numbers[j]
    return numbers


# Задача No2.
# Написать точно такую же процедуру, но в декларативном стиле
def sort_list_declarative(numbers):
    return sorted(numbers)


if __name__ == '__main__':
    print(sort_list_imperative([4, 33, 2, 5, 62, 12, 68, 99]))
    print(sort_list_declarative([4, 33, 2, 5, 62, 12, 68, 99]))