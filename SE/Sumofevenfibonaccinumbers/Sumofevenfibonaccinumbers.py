################################################
# Software Engineering
# Sum of even Fibonacci number with given limit
# Phuc Le - 456061
################################################
def evenFibSum(limit): 
    if (limit < 2): 
        return 0
  
    # Initialize first two even prime numbers 
    # and their sum 
    number1 = 0
    number2 = 1
    number3 = number1 + number2
    total = 0
      
    # calculating sum of even Fibonacci value 
    while (number3 < limit):
        if (number3 % 2 == 0):
            total = total + number3
        number1 = number2
        number2 = number3
        number3 = number1 + number3 
    return total 
  
# Driver code 
limit = 4000000
print(evenFibSum(limit)) 