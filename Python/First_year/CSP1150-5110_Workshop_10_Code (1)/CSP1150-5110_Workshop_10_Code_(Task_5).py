import countnum
import unittest

class TestCountNum(unittest.TestCase):

    def test_boundaries(self):
        self.assertEqual(countnum.countNum(1, 5, 8), 0)
        self.assertEqual(countnum.countNum(1, 500, 2), 176)
        self.assertEqual(countnum.countNum(-50, -5, 6), 5)
        self.assertEqual(countnum.countNum(100, 1000, 42), 19)
        self.assertEqual(countnum.countNum(1, 12, 1), 4)
        self.assertEqual(countnum.countNum(5, 5, 5), 1)        


    def test_invalid(self):       
        self.assertRaises(TypeError, countnum.countNum, 1.5, 9, 5)
        self.assertRaises(TypeError, countnum.countNum, 1, 9.5, 5)
        self.assertRaises(TypeError, countnum.countNum, 1, 9, 5.5)

        self.assertRaises(TypeError, countnum.countNum, 'A', 9, 5)
        self.assertRaises(TypeError, countnum.countNum, 1, 'A', 5)
        self.assertRaises(TypeError, countnum.countNum, 1, 9, 'A')

        self.assertRaises(ValueError, countnum.countNum, 9, 1, 5)
        self.assertRaises(ValueError, countnum.countNum, 1, 9, -5)
        
unittest.main()
