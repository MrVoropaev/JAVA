import unittest
from list_comparator import ListComparator

class test_list_comparator(unittest.TestCase):

    def test_compare_lists_with_different_averages(self):
        list1 = [1, 2, 3, 4, 5]
        list2 = [6, 7, 8, 9, 10]
        comparator = ListComparator(list1, list2)
        assert comparator.compare_lists() == "Второй список имеет большее среднее значение"

    def test_compare_lists_with_same_averages(self):
        list1 = [1, 2, 3]
        list2 = [4, 5, 6]
        comparator = ListComparator(list1, list2)
        assert comparator.compare_lists() == "Средние значения равны"

    def test_compare_lists_with_empty_lists(self):
        list1 = []
        list2 = []
        comparator = ListComparator(list1, list2)
        assert comparator.compare_lists() == "Средние значения равны"

    def test_compare_lists_with_one_empty_list(self):
        list1 = [1, 2, 3]
        list2 = []
        comparator = ListComparator(list1, list2)
        assert comparator.compare_lists() == "Первый список имеет большее среднее значение"

