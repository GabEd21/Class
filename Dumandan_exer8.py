name = input("")
letter = name.lower()
dec = 0
i = 0
vowel = ["a","e","i","o","u"," "]

for char in letter:
    i = i+1
    if char in vowel:
        dec = dec + 1 

res = i - dec

if res == 1:
    print(res," consonant")
else:
    print(res," consonants")