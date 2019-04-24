###########################################
# Software Engineering
# Multiples of 3 and 5 below 1000
# Phuc Le - 456061
###########################################
total = 0
result1 = False

result2 = False

for i in range (1, 1000):

    result1 = i % 3 == 0 # Sum of all multiples of 3
    result2 = i % 5 == 0 # Sum of all multiples of 5
    
    if (result1 or result2):
        total += i 

print (total)
