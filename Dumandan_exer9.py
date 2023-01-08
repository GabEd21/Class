name = input("")
letter = name.lower()
letter = 0
number = 0
for i in name:
    if i.isalpha():
        letter = letter + 1
    elif i.isdigit():
        number = number + 1


print("Letters:", letter, "Numbers:", number)