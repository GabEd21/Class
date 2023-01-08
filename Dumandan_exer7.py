
year = int(input())
og = year
leap = 0
common = 0

while year <= 2022:
    if year % 4 == 0 and year % 100 != 0 :

        year += 1
        leap += 1
    else:
        year +=1
        common +=1

print(leap, " leap years and ", common, " common years from ", og, 'to', year -1)
