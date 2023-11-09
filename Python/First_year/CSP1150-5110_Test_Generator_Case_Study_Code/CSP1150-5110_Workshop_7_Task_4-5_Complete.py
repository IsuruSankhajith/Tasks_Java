# ensure that there are no duplicate usernames
def resolveDuplicate(usernames, username):
    counter = 0
    while True:
        counter = counter + 1
        newUsername = username + str(counter)       
        
        if newUsername not in usernames:
            return newUsername
        

students = {60254: 'John Smith', 60255: 'Gert Hans-Dyer', 60256: 'Sun Po',
            60257: 'Bort Woods', 60258: 'Andrew Butters', 60259: 'Betty Ho',
            60260: 'Jonah Smithers', 60261: 'Sha Po', 60262: 'Jane Smitt'}
usernames = {} # create empty dictionary to store usernames


for num, name in students.items():
    # convert to lower case, remove dashes, split into a list
    nameParts = name.lower().replace('-', '').split() 

    # create more convenient variables using the list items
    fname = nameParts[0]
    sname = nameParts[1]

    # first letter of first name concatenated to first 4 letters of surname
    uname = fname[0] + sname[0:4]

    # pad with 0s as needed
    uname = uname.ljust(5, '0')

    if uname in usernames.values(): # check if it exists
        uname = resolveDuplicate(usernames.values(), uname)

    usernames[num] = uname # add to usernames dictionary


for num, uname in usernames.items(): # print usernames
    print(num, uname)


# write the data into a file in JSON format
import json
file = open('usernames.txt', 'w')
json.dump(usernames, file, indent=4)
file.close()
