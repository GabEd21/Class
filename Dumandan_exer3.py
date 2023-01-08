Name = input("")

def lettercount(Name):
    count = 0

    for i in Name:
        if i.isalpha():
            count += 1
        elif i.isdigit():
            count += 1
    return count


total = lettercount(Name)

print("Hello '",Name, "',your name is", total," characters long!")