def countNum(start, end, num):
    count = 0

    for i in range(start, end + 1):
        if str(num) in str(i):
            count = count + 1

    return count

tests = [{'input': [1, 5, 8], 'expected': 0},
         {'input': [1, 500, 2], 'expected': 176},
         {'input': [-50, -5, 6], 'expected': 5},
         {'input': [100, 1000, 42], 'expected': 19},
         {'input': [1, 12, 1], 'expected': 4},
         {'input': [5, 5, 5], 'expected': 1},

         {'input': [1.5, 9, 5], 'expected': TypeError},
         {'input': [1, 9.5, 5], 'expected': TypeError},
         {'input': [1, 9, 5.5], 'expected': TypeError},

         {'input': ['A', 9, 5], 'expected': TypeError},
         {'input': [1, 'A', 5], 'expected': TypeError},
         {'input': [1, 9, 'A'], 'expected': TypeError},

         {'input': [9, 1, 5], 'expected': ValueError},
         {'input': [1, 9, -5], 'expected': ValueError}
         ]

# perform automated testing
for testNum, test in enumerate(tests):

    start = test['input'][0]
    end = test['input'][1]
    num = test['input'][2]

    testInfo = 'Test ' + str(testNum + 1) + ' - countNum(' + str(start) + ', ' + str(end) + ', ' + str(num) + '): '
    print(testInfo, end='')

    try: 
        result = countNum(start, end, num)
        resultText = '(Res: ' + str(result) + ', Exp: ' + str(test['expected']) + ')'

    except Exception as ex:  # catch any exceptions...
        result = type(ex)
        resultText = '(Res: ' + str(result) + ', Exp: ' + str(test['expected']) + ')'

    if result == test['expected']:
        print('Test Passed', resultText)
    else:
        print('Test Failed', resultText)
