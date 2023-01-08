from array import *

name = input("")
name2 = input("")
count = 0
count2 = 0
for i in name:
        if i.isalpha():
            count += 1
        elif i.isdigit():
            count += 1

for j in name2:
    if j.isalpha():
            count2 += 1
    elif j.isdigit():
            count2 += 1

final = count %2
pinal = count2 %2

oe = [final,pinal]
v = 0
for k in oe:
    if oe[v] == 0:
        print("Even-lengthed word!")
    else:
        print("Odd-lengthed word!")
    v = v + 1    