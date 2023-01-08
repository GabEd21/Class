from operator import or_


from array import *

year1 = int(input())
year2 = int(input())

leap = year1 % 4
leap2 = year2 % 4

count = [leap,leap2]
j = 0
for i in count:
    if count[j] == 0:
        print("Leap!")
    else:
        print("Common!")
    j = j + 1    
